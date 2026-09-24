public class ContaBancaria {
    private Integer agencia;
    private Integer numero;
    private Cliente cliente;
    private Data dataAbertura;
    private String senha;
    private TipoConta tipo;
    private Double saldo;
    private Double limiteContratado;
    private Double limiteUtilizado;
    private Boolean ativa;

    ContaBancaria(Integer agencia, Integer numero, Cliente cliente, String senha, TipoConta tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.senha = senha;
        this.tipo = tipo;
        this.saldo = 0.0;
        this.limiteContratado = 0.0;
        this.limiteUtilizado = 0.0;
        this.ativa = true;
    }

    ContaBancaria(Integer agencia, Integer numero, Cliente cliente, String senha, TipoConta tipo, Double limiteContratado){
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.senha = senha;
        this.tipo = tipo;
        if(this.tipo == TipoConta.CONTA_CORRENTE)
            this.limiteContratado = limiteContratado;
        else if(this.tipo == TipoConta.POUPANCA)
            this.limiteContratado = 0.0;
        this.limiteUtilizado = 0.0;
        this.saldo = 0.0;
        this.ativa = true;
    }

    public Boolean autenticar(String senha){
        if(senha.contentEquals(this.senha))
            return true;
        else
            return false;
    }

    public void depositar(Double valor){
        if(valor > 0.0) {
            IO.println("Depósito de R$ " + valor + " efetuado!" );
            if(this.limiteUtilizado > 0.0){ // pagar o o que foi no limite
                this.limiteUtilizado -= valor;
                if(this.limiteUtilizado < 0.0) { // eu ainda tenho algo para pagar
                    saldo = -this.limiteUtilizado; // inverter a dívida e deposito o que sobrou
                    this.limiteUtilizado = 0.0;
                }
            }
            else
                this.saldo += valor; // ou this.saldo = this.saldo + valor;
        }
    }

    // limite
    public Double sacar(Double valor, String senha){
        if(estaBloqueada() == true){
            IO.println("A conta está bloqueada!");
            return 0.0;
        }

        if(autenticar(senha) == true){
            if(limiteContratado > 0.0) {
                if (saldo + (limiteContratado - limiteUtilizado) >= valor) {
                    saldo -= valor;
                    if(saldo < 0.0){
                        limiteUtilizado -= saldo;
                        saldo = 0.0;
                    }
                    IO.println("Foi efetuado um saque de R$ " + valor);
                    return valor;
                } else {
                    IO.println("Saldo + limite contratado não é suficiente para efetuar o saque.");
                }
            }
            else{
                if(saldo >= valor){
                    saldo -= valor;
                    IO.println("Foi efetuado um saque de R$ " + valor);
                    return valor;
                }
                else{
                    IO.println("Saldo insuficiente!");
                }
            }
        }
        else{
            IO.println("Senha incorreta!");
        }
        return 0.0;
    }

    // limite
    public void consultarSaldo(String senha){
        if(estaBloqueada() == true){
            IO.println("A conta está bloqueada!");
        }
        else {
            if (autenticar(senha) == true) {
                IO.println("Saldo: " + this.saldo);
                if(this.limiteContratado > 0.0) {
                    IO.println("Limite contratado: " + this.limiteContratado);
                    IO.println("Limite utilizado: " + this.limiteUtilizado);
                }
            } else
                IO.println("Senha incorreta!");
        }
    }

    public void alterarSenha(String senhaAtual, String novaSenha){
        if(estaBloqueada() == true){
            IO.println("A conta está bloqueada!");
        }
        else {
            if (autenticar(senhaAtual) == true) {
                if (autenticar(novaSenha) == true) { // a nova senha é igual à senha atual, por isso não mudar a senha
                    IO.println("A nova senha é igual à senha anterior!");
                } else { // É diferente da anterior
                    this.senha = novaSenha;
                    IO.println("A senha foi modificada!");
                }
            } else
                IO.println("Senha incorreta!");
        }
    }

    // contratar limite se for conta corrente

    public void bloquear(String senha){
        if(estaBloqueada() == true){
            IO.println("A conta já está bloqueada!");
        }
        else {
            if (autenticar(senha))
                this.ativa = false;
        }
    }

    private void bloquear(){
        if(estaBloqueada() == true){
            IO.println("A conta já está bloqueada!");
        }
        else
            this.ativa = false;
    }

    public void desbloquear(String senha){
        if(estaBloqueada() == true){
            if(autenticar(senha))
                this.ativa = true;
            else
                IO.println("Senha incorreta!");
        }
        else
            IO.println("A conta já está desbloqueada!");
    }

    private void desbloquear(){
        if(!estaBloqueada())
            IO.println("A conta já está desbloqueada!");
        else
            this.ativa = true;
    }

    public Boolean estaBloqueada(){
        return !this.ativa;
    }
}

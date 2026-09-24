public class ContaBancaria {
    private Integer agencia;
    private Integer numero;
    private String nome;
    private String senha;
    private TipoConta tipo;
    private Double saldo;
    private Double limite;
    private Boolean ativa;

    ContaBancaria(Integer agencia, Integer numero, String nome, String senha, TipoConta tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
        this.saldo = 0.0;
        this.limite = 0.0;
        this.ativa = true;
    }

    ContaBancaria(Integer agencia, Integer numero, String nome, String senha, TipoConta tipo, Double limite){
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
        this.limite = limite;
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
        if(valor >= 0.0) {
            this.saldo += valor; // ou this.saldo = this.saldo + valor;
        }
        // testar limite
    }

    public Double sacar(Double valor, String senha){
        if(estaBloqueada() == true){
            IO.println("A conta está bloqueada!");
            return 0.0;
        }

        if(autenticar(senha) == true){
            //testar limite
            if(saldo >= valor){
                saldo -= valor;
                return valor;
            }
            else{
                IO.println("Saldo insuficiente!");
            }
        }
        else{
            IO.println("Senha incorreta!");
        }
        return 0.0;
    }

    public void consultarSaldo(String senha){
        if(estaBloqueada() == true){
            IO.println("A conta está bloqueada!");
        }
        else {
            if (autenticar(senha) == true) {
                IO.println("Saldo: " + this.saldo);
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

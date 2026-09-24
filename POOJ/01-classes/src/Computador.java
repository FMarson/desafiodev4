public class Computador {
    //atributos
    Double tamanhoTela;
    Integer memoriaRAM;
    String SO;
    Double versaoSO;
    String processador;
    Double armazenamento;
    String versaoWifi;
    Boolean estaLigado;
    Double cargaBateria;
    Boolean estaConectadoTomada;

    //métodos
    Computador(){ //default
        tamanhoTela = 15.0;
        memoriaRAM = 16;
        SO = "Linux XXX";
        versaoSO = 7.54;
        processador = "Ryzen 7";
        armazenamento = 2000000.0;
        versaoWifi = "6e";
        estaLigado = false;
        cargaBateria = 0.0;
        estaConectadoTomada = false;
    }

    void ligarDesligar(){
        if(estaLigado == true){
            estaLigado = false;
        }
        else{ // estaLigado == false
            if(estaConectadoTomada == true){
                estaLigado = true;
            }
            else if(cargaBateria > 0.1){
                estaLigado = true;
            }
        }
    }

    void verificarLigado(){
        if(estaLigado){
            IO.println("O computador está ligado!");
        }
        else{
            IO.println("O computador está desligado!");
        }
    }

    void carregarBateria(){
        cargaBateria = 100.0;
    }

    void conectarTomada(Boolean conectado){
        estaConectadoTomada = conectado;
    }
}

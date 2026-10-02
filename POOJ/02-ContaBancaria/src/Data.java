public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Periodo periodo;;
    private final String[] nomeMeses;

    // verificar valores válidos dia e mês

    public Data(Integer dia, Integer mes, Integer ano) {
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
        this.periodo = Periodo.DC;
        nomeMeses = new String[]{"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto",
                "setembro", "outubro", "novembro", "dezembro"};
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        Integer maxDia = 1;

        switch(mes){
            case 2 -> {
                    if (ehAnoBissexto())
                        maxDia = 29;
                    else
                        maxDia = 28;
                }
            case 1, 3, 5, 7, 8, 10, 12 -> maxDia = 31;
            case 4, 6, 9, 11 -> maxDia = 30;
            default -> this.dia = -1;
            }
        if(dia >= 1 && dia <= maxDia) {
            this.dia = dia;
        }
        else
            this.dia = -1;

    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        if(mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
        else // mês inválido
            this.mes = -1;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if(ano >= 0)
            this.ano = ano;
    }


    public void imprimir(){
        // Imprimir 24/09/2026
        if(this.dia == -1 || this.mes == -1){
            IO.println("Data inválida");
        }
        else {
            IO.println(dia + "/" + mes + "/" + ano);
        }
    }

    public void imprimirPorExtenso(){
        Integer indiceMes = mes - 1; // ajuste para poder imprimir o mês corretamente janeiro 1 -> 0, fevereiro 2 -> 1

        if(this.dia == -1 || this.mes == -1){
            IO.println("Data inválida");
        }
        else {
            IO.println(dia + " de " + nomeMeses[indiceMes] + " de " + ano);

            // Segunda forma de fazer
            String nomeMes = "";
            switch (mes) {
                case 1 -> nomeMes = "janeiro";
                case 2 -> nomeMes = "fevereiro";
                case 3 -> nomeMes = "março";
                case 4 -> nomeMes = "abril";
                case 5 -> nomeMes = "maio";
                case 6 -> nomeMes = "junho";
                case 7 -> nomeMes = "julho";
                case 8 -> nomeMes = "agosto";
                case 9 -> nomeMes = "setembro";
                case 10 -> nomeMes = "outubro";
                case 11 -> nomeMes = "novembro";
                case 12 -> nomeMes = "dezembro";
            }

            IO.println(dia + " de " + nomeMes + " de " + ano);
        }
    }

    public Boolean ehAnoBissexto(){
         return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

}

public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    // verificar valores válidos dia e mês

    public Data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }


    private void imprimir(){
        // Imprimir 24/09/2026
    }

    private void imprimirPorExtenso(){
        // Imprimir 24 de setembro de 2026.
    }


}

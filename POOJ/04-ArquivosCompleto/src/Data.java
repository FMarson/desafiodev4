public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    private final String[] nomeMeses = {
            "janeiro",
            "fevereiro",
            "março",
            "abril",
            "maio",
            "junho",
            "julho",
            "agosto",
            "setembro",
            "outubro",
            "novembro",
            "dezembro"
    };

    public Data(Integer dia, Integer mes, Integer ano) {
        validarData(dia, mes, ano);

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        validarData(dia, this.mes, this.ano);
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        validarData(this.dia, mes, this.ano);
        this.mes = mes;
    }

    public String getMesPorExtenso() {
        return nomeMeses[mes - 1];
    }

    public void setMesPorExtenso(String mesPorExtenso) {
        if (mesPorExtenso == null) {
            throw new IllegalArgumentException(
                    "O mês por extenso não pode ser nulo."
            );
        }

        String mesNormalizado = mesPorExtenso
                .trim()
                .toLowerCase();

        for (int indice = 0; indice < nomeMeses.length; indice++) {
            if (nomeMeses[indice].equals(mesNormalizado)) {
                setMes(indice + 1);
                return;
            }
        }

        throw new IllegalArgumentException(
                "Mês inválido: " + mesPorExtenso
        );
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        validarData(this.dia, this.mes, ano);
        this.ano = ano;
    }

    private void validarData(
            Integer dia,
            Integer mes,
            Integer ano
    ) {
        if (dia == null || mes == null || ano == null) {
            throw new IllegalArgumentException(
                    "Dia, mês e ano não podem ser nulos."
            );
        }

        if (ano < 0) {
            throw new IllegalArgumentException(
                    "O ano deve ser maior ou igual a zero."
            );
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException(
                    "O mês deve estar entre 1 e 12."
            );
        }

        int maximoDeDias = obterMaximoDeDias(mes, ano);

        if (dia < 1 || dia > maximoDeDias) {
            throw new IllegalArgumentException(
                    "O dia " + dia
                            + " não é válido para "
                            + mes + "/" + ano
                            + ". O máximo permitido é "
                            + maximoDeDias + "."
            );
        }
    }

    private int obterMaximoDeDias(
            Integer mes,
            Integer ano
    ) {
        return switch (mes) {
            case 2 -> ehAnoBissexto(ano) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 0;
        };
    }

    private boolean ehAnoBissexto(Integer ano) {
        return ano % 4 == 0
                && (ano % 100 != 0 || ano % 400 == 0);
    }

    public boolean ehAnoBissexto() {
        return ehAnoBissexto(ano);
    }

    public void imprimir() {
        IO.println(
                String.format(
                        "%02d/%02d/%04d",
                        dia,
                        mes,
                        ano
                )
        );
    }

    public void imprimirPorExtenso() {
        IO.println(
                String.format(
                        "%02d de %s de %04d",
                        dia,
                        getMesPorExtenso(),
                        ano
                )
        );
    }
}

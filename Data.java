public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) { // validação de data
        if (!dataValida(dia, mes, ano)) {
            System.out.println("Data inválida! Usando 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12)
            return false;

        int diasFevereiro;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasFevereiro = 29;
        } else {
            diasFevereiro = 28;
        }

        int[] diasMes = { 31, diasFevereiro, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        return dia >= 1 && dia <= diasMes[mes - 1];
    }

    public boolean verificaAnoBissexto() { // método para verificar se o ano é bissexto
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
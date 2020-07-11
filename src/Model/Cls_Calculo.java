package Model;

public class Cls_Calculo {

    private String modalidade;
    private int valorDesconto;
    private int valorMensalidade;

    public String calcularModalidade(int pacote) {
        switch (pacote) {
            case 1:
                modalidade = "Corrida";
                break;
            case 2:
                modalidade = "Bicicleta";
                break;
            case 3:
                modalidade = "Abdominal";
                break;
        }
        return modalidade;
    }

    public int calcularValorDesconto(int pacote) {
        switch (pacote) {
            case 1:
                valorDesconto = 20;
                break;
            case 2:
                valorDesconto = 30;
                break;
            case 3:
                valorDesconto = 40;
                break;

        }
        return valorDesconto;
    }

    public int calcularMensalidade(int pacote) {
        switch (pacote) {
            case 1:
                valorMensalidade = 160;
                break;
            case 2:
                valorMensalidade = 240;
                break;
            case 3:
                valorMensalidade = 320;
                break;

        }
        return valorMensalidade;
    }
}
package Model;

public class Cls_Cliente {

    private static String nome;
    private static int pacote;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cls_Cliente.nome = nome;
    }

    public static int getPacote() {
        return pacote;
    }

    public static void setPacote(int pacote) {
        Cls_Cliente.pacote = pacote;
    }

}

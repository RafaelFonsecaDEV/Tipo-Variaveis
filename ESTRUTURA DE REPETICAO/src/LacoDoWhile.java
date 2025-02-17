import java.util.Random;

public class LacoDoWhile {

    public static void main(String[] args) {
        System.out.println("Discando ....");

        do {
            System.out.println("ligando...:" + "telefone tocando");
        } while (tocando());

        System.out.println("atendido:" + "alo !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu?" + atendeu);
        return !atendeu;
    }

}

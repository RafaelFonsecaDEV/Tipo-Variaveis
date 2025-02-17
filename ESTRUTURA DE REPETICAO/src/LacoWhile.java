import java.util.concurrent.ThreadLocalRandom;

public class LacoWhile {

    public static void main(String[] args) {
        double mesada = 10.0;

        System.out.println("Mesada:" + mesada);
        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            System.out.println("Valor do doce:" + valorDoce);

            if (valorDoce > mesada) {
                valorDoce = mesada;
                System.out.println("Doce comprado: " + valorDoce + " Adicionando no carrinho");
                mesada = mesada - valorDoce;
            }

            System.out.println("Mesada:" + mesada);
            System.out.println("pedrinho gastou toda a mesada em doces");

        }

    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(16, 25);
    }

}

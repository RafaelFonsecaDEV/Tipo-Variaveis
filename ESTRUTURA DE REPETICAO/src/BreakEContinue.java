public class BreakEContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;

            } else {
                System.out.println("numero:" + numero);
            }
        }

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue; // continue faz com que o loop pule a iteraçao atual que e 3 e continue a
                          // execuçao

            }
            System.out.println(numero);
        }

    }
}
public class Validacoes {

 public static void main(String[] args) {
    
       String nomeUm = "RAFAEL";
       String nomeDois = new String("RAFAEL");
    
      System.out.println(nomeUm.equals(nomeDois)); // compara o conteudo com "equals"
    
       int numero1 = 1;
       int numero2  = 2;


       boolean simNao = numero1 == numero2;


      if (numero1 < numero2) {
        
          System.out.println(" a nossa condiçao e verdadeira");

      }

          System.out.println("numeroUm e igual a numeroDois:" + simNao);

       simNao = numero1 != numero2;

          System.out.println("numeroUm e diferente a numeroDois:" + simNao);

       simNao = numero1 > numero2;

          System.out.println("numeroUm e maior que numeroDois:" + simNao);




 }

}

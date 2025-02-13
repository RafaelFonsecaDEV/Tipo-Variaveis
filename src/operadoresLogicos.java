public class operadoresLogicos {

    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;
        
        boolean c = a && b; // e
        boolean d = a || b; // ou
        boolean e = a ^ b; // ou exclusivo
        boolean f = !a; // negação
        
        System.out.println("c:" + c + "d:" + d + "e:" + e + "f:" + f);



      boolean condicao1 = true;
       
      boolean condicao2 = false;

       if (condicao1 && condicao2) {
         System.out.println(" as duas condiçoes sao verdadeiras ");
       }

       if (condicao1 || condicao2) {
        System.out.println(" uma das condiçoes e  verdadeiras ");
      }
     


      System.out.println("fim");

    }

}

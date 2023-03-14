public class Gato {
      String nome;
      String raca;
      String cor;
      int idade;
      double peso;
      boolean fome;

      void fome(boolean fome) {
            if (fome == true) {
                  System.out.println("O gato esta com fome!!");
            } else {
                  System.out.println("O gato não esta com fome.");
            }
            ;
      }
}
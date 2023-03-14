public class Cachorro {
      String nome;
      String raca;
      String cor;
      int idade;
      double peso;
      boolean passeio;

      void passeio(boolean passeio) {
            if (passeio == true) {
                  System.out.println("O cachorro ja foi passear.");
            } else {
                  System.out.println("O cachorro não foi passear.");
            }
      }

}

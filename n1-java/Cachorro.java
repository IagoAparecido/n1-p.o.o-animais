public class Cachorro {
      String nome;
      String raca;
      String cor;
      double idade;
      double peso;
      boolean passeio;

      void passeio(boolean passeio) {
            if (passeio == true) {
                  System.out.println("O cachorro já foi passear.");
            } else {
                  System.out.println("O cachorro não foi passear.");
            }
      }

}

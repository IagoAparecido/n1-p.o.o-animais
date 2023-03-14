public class Animal {

      //Um animal deve ter:
            //nome(String), peso(double), raça(String), cor(String), idade(int).

      public static void main(String[] args) {
            Gato gato = new Gato();

            gato.nome = "Bingolinha";
            gato.peso = 5;
            gato.raca = "Viralata";
            gato.cor = "Preto";
            gato.idade = 3;

            System.out.println("\n---------Animais = GATO--------\n");
            System.out.println("Nome: " + gato.nome +"  //E realmente o nome do meu gato");
            System.out.println("Peso: " + gato.peso);
            System.out.println("Raca: " + gato.raca);
            System.out.println("Cor: " + gato.cor);
            System.out.println("Idade: " + gato.idade +" meses");

            gato.fome(true);

            System.out.println("\n------------------------------------------\n");

            Cachorro cachorro = new Cachorro();

            cachorro.nome = "Cotocao";
            cachorro.peso = 6;
            cachorro.raca = "Pincher grande";
            cachorro.cor = "Preto";
            cachorro.idade = 3;

            System.out.println("\n---------Animais = CACHORRO--------\n");
            System.out.println("Nome: " + cachorro.nome);
            System.out.println("Peso: " + cachorro.peso);
            System.out.println("Raca: " + cachorro.raca);
            System.out.println("Cor: " + cachorro.cor);
            System.out.println("Idade: " + cachorro.idade+" anos");

            cachorro.passeio(true);
      }

}
public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa("joseph", 20);


        Aluno a1 = new Aluno("Breno", 20, 3, "ADS");
        Cachorro c1 = new Cachorro("Tobias");
        Boi b1 = new Boi("Ferdinando");


        c1.MakeSound();

        b1.MakeSound();



        a1.status();
    }
}
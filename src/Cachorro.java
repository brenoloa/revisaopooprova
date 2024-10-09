public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void MakeSound() {
        System.out.println("AU AU AU AU AU");
    }
}

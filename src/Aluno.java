public class Aluno extends Pessoa{
    private int tier;
    private String curse;


    public Aluno(String nome, int idade, int tier, String curse) {
        super(nome, idade);
        this.tier = tier;
        this.curse = curse;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    public void status(){
        System.out.println(this.getName());
        System.out.println(this.getIdade());
        System.out.println(this.getCurse());
        System.out.println(this.getTier());
    }
}

public class Formiga extends Presonagem{

    @Override
    public void mover() {
        System.out.println(energia - 2);
    }

    @Override
    public void fazerSom(){
        System.out.println("Fzzzz!");
    }
    
    @Override
    public int dormir(){
        return energia + 10;
    }
}
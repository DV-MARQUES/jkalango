public class Abelhinha extends Presonagem {

    @Override
    public void mover() {
       System.out.println(energia - 1);
    }

    @Override
    public void fazerSom(){
        System.out.println("Bzzzz!");
    }
            
}

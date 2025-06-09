public class Kalango extends Presonagem {

    @Override
    public void mover() {  
         System.out.println(energia - 3);
    }
    
    @Override
    public void fazerSom(){
        System.out.println("Tssss!");
    }
}

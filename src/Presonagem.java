public abstract class Presonagem {
    public abstract void mover();
    public abstract void fazerSom();
    
    public int dormir(){
        return energia + 10;
    }
    
    protected int energia = 0;
}

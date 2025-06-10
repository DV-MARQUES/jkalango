public abstract class Presonagem {
    public abstract void mover();
    public abstract void fazerSom();
    public abstract void comer();

    public int dormir(){
        return energia += 10;
    }
    

    protected int energia = 10;
    protected Integer nome;
}

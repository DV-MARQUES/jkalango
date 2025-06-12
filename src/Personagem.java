public abstract class Personagem {
    public abstract void mover();
    public abstract void fazerSom();
    public abstract void comer();

    public int dormir(){
        return energia += 10;
    }
    
    public Personagem(){

    }

    public Personagem(int energia){
        this.energia = energia;
    }

    protected int energia = 10;
    protected Integer nome;
}

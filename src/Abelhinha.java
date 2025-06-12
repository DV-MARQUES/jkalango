public class Abelhinha extends Personagem {

    @Override
    public void mover() {
        energia -= 4;
        System.out.println("Movendo...energia atual: "+energia);
    }

    @Override
    public void fazerSom(){
        System.out.println("Barulho da Abelhinha: "+"Bzzzz!");
    }
    

    public void mostrarEnergia(){
        System.out.println("Dormindo...Energia atual: "+energia);
  
   }

   @Override
   public void comer(){
     energia += 3;
     System.out.println("Comendo...Energia Atual: "+energia);
   }

   public void verificarEnergia(){
       if (energia < 5){
           System.out.println("Seu personagem tá morto de cansado!");
       }else{
           System.out.println("Teu presonagem tá bem!"+"\n");
       }
 }
}


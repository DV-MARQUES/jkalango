public class Kalango extends Presonagem {

    @Override
    public void mover() {  
        energia -= 3;
        System.out.println("Movendo...energia atual: "+energia);
    }
    
    @Override
    public void fazerSom(){
        System.out.println("Barulho da Kalango: "+"Tssss!");
    }


    public void mostrarEnergia(){
        System.out.println("Dormindo...Energia atual: "+energia);
   }
   
   @Override
   public void comer(){
     energia += 5;
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

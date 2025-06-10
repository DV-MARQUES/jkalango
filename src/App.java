public class App {
    public static void main(String[] args) throws Exception {
        
        Formiga f = new Formiga();
        System.out.println("Formiga no Trabalho: ");
        f.mover();
        f.mover();
        f.mover();
        f.fazerSom();
        f.dormir();
        f.mostrarEnergia();
        f.comer();
        f.verificarEnergia();
        
        Abelhinha a = new Abelhinha();
        System.out.println("Abelhinhas no Trabalho: ");
        a.mover();
        a.mover();
        a.mover();
        a.fazerSom();
        a.dormir();
        a.mostrarEnergia();
        a.comer();
        a.verificarEnergia();

        Kalango k = new Kalango();
        System.out.println("Kalangos no Trabalho: ");
        k.mover();
        k.mover();
        k.mover();
        k.fazerSom();
        k.dormir();
        k.mostrarEnergia();
        k.comer();
        k.verificarEnergia();
    }
}

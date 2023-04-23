public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        smartTv.ligar();
        //smartTv.desligar();
        smartTv.aumentarVol(5);
        //martTv.diminuirVol(15);
        smartTv.aumentarCanal(250);
        smartTv.diminuirCanal(120);
        //smartTv.mudarCanal(9999);
        smartTv.mudarCanal(180);

        System.out.println("Estado da TV:");

        if(smartTv.ligada == false){
            System.out.println("    A TV está desligada!");
        }else{
            System.out.println("    A TV está ligada.");
            System.out.println("    Canal " + smartTv.canal);
            System.out.println("    Volume: " + smartTv.volume);
        }
    }
}

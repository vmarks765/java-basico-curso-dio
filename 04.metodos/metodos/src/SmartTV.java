public class SmartTV {
    boolean ligada = false;
    int canal = 3;
    int volume = 12;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVol(int repeticoes){
        for (int i=0; i < repeticoes; i++) {
            volume++;
        }
        if (volume >= 30){
            volume = 30;
        }
    }


    public void diminuirVol(int repeticoes){
        for (int i=0; i < repeticoes; i++) {
            volume--;
        }
        if (volume <= 0){
            volume = 0;
        }
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        if (canal >= 1000){
            canal = 1000;
        }
        if (canal <= 1){
            canal = 1;
        }
    }

    public void aumentarCanal(int repeticoes){
        for (int i=0; i < repeticoes; i++) {
            canal++;
        }
        if (canal >= 1000){
            canal = 1000;
        }
    }

    public void diminuirCanal(int repeticoes){
        for (int i=0; i < repeticoes; i++) {
            canal--;
        }
        if (canal <= 1){
            canal = 1;
        }
    }
}

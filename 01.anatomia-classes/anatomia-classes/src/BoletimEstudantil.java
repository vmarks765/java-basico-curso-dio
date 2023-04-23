public class BoletimEstudantil {
    public static void main(String[] args) {
        double mediaFinal = 6.7;
        if(mediaFinal < 6)
            System.out.println("REPROVADO.");
        else if((mediaFinal > 6) && (mediaFinal < 7))
            System.out.println("RECUPERAÇÃO.");
        else
            System.out.println("APROVADO.");
    }
}

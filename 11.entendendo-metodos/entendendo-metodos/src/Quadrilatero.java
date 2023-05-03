// Sobrecarga

public class Quadrilatero {
    public static void calcularArea(double lado){
        double area = lado * lado;
        System.out.println("Quadrado de área igual a " + String.format("%.2f", area) + " u.a.");
    }

    public static void calcularArea(double lado1, double lado2){
        double area = lado1 * lado2;
        System.out.println("Retângulo de área igual a " + String.format("%.2f", area) + " u.a.");
    }

    public static void calcularArea(double baseMaior, double baseMenor, double altura){
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Trapézio de área igual a " + String.format("%.2f", area) + " u.a.");
    }
}

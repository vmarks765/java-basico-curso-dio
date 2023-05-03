import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Calculadora
        Calculadora.soma(1.5, 3.5);
        Calculadora.subtracao(1.5, 3.5);
        Calculadora.multiplicacao(1.5, 3.5);
        Calculadora.divisao(1.5, 3.5);
        System.out.println();

        // Mensagem
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(20);
        System.out.println();

        // Emprestimo
        Emprestimo.getTaxa(1000,3);
        Emprestimo.getTaxa(1000,2);
        Emprestimo.getTaxa(1000,1);
        Emprestimo.getTaxa(200000,36);

        // Quadrilátero
        Quadrilatero.calcularArea(5);
        Quadrilatero.calcularArea(5, 10);
        Quadrilatero.calcularArea(5, 4, 3);
        System.out.println();

        // QuadriláteroReturn
        double areaQuadrado = QuadrilateroReturn.calcularArea(5);
        double areaRetangulo = QuadrilateroReturn.calcularArea(5, 10);
        double areaTrapezio = QuadrilateroReturn.calcularArea(5, 4, 3);
        System.out.println("Quadrado de área igual a " + String.format("%.2f", areaQuadrado) + " u.a.");
        System.out.println("Retângulo de área igual a " + String.format("%.2f", areaRetangulo) + " u.a.");
        System.out.println("Trapézio de área igual a " + String.format("%.2f", areaTrapezio) + " u.a.");
        System.out.println();

    }
}

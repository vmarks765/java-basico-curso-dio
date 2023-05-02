public class Main {
    public static void main(String[] args) {

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
        System.out.println();

    }
}

public class MinhaClasse {

    public static void main(String[] args) {

        System.out.println("Olá, sejam bem-vindos");
    /*
    final String BR = "Brasil";
    final double PI = 3.14;
    final int ESTADOS_BRASILEIROS = 27;

    boolean afirmacao = false;
    */
        /*Teste de métodos*/
        double soma;

        soma = soma(20.5, -2.87);
        System.out.println(soma);

        String nome1 = "Vinícius";
        String nome2 = "Marques";
        String nomeCompleto;

        nomeCompleto = nomeCompleto(nome1, nome2);

        System.out.println(nomeCompleto);
    }

    /*Métodos*/
    public static double soma (double numero1, double numero2){
        double soma = numero1 + numero2;
        return soma;
    }

    public static String nomeCompleto (String primeiroNome, String ultimoNome){
        return "Resultado do método 'nomeCompleto': " + primeiroNome.concat(" ").concat(ultimoNome);
    }

}

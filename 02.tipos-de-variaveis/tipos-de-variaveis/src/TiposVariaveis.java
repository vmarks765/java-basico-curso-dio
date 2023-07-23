public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 2500.35;

        /*Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F
        e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional. */

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // cast implícito.
        // short numeroCurto2 = numeroNormal;
        short numeroCurto2 = (short)numeroNormal; // cast explícito.

        /*Por mais que tenhamos ciência do valor que numeroNormal cabe é um short, o Java não permite correr o risco. */

        /*Constantes...
        Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados.
        Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.
        Por convenção, Constantes são sempre escritas em CAIXA ALTA.
        */

        final float PI = 3.14F;
        final short ANO = 2023;
        final double SALARIOMINIMO = 1326.16;

        System.out.println(PI);
    }
}

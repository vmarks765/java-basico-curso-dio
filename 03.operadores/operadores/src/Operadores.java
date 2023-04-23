public class Operadores {
    public static void main(String[] args) {

        // Operador de atribuição: =
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;

        // Operadores aritiméticos:
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        // ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".

        System.out.println("10.5 + 15.7 = " + soma);
        System.out.println("113 - 25 = " + subtracao);
        System.out.println("20 * 7 = " + multiplicacao);
        System.out.println("15 / 3 = " + divisao);
        System.out.println("18 % 3 = " + modulo);
        System.out.println("(10 * 7) + (20/4) = " + resultado);

        String nomeCompleto = "Vinícius" + " " + "Marques";

        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);

        /*
        Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
        (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.
         */

        int numero = 5;
        //Imprimindo o numero negativo
        System.out.println(- numero);
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        System.out.println(numero);// agora sim, numero virou 7
        //ordem de precedencia conta aqui
        System.out.println(++ numero);
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);
        System.err.println(verdadeiro);
        // Muito cuidado com ordem de precedência, dos operadores unários!

        //Operador ternário:

        int a, b;

        a = 5;
        b = 6;
        String valor;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        valor = "verdadeiro";
        else
        valor = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        valor = (a==b) ? "Verdadeiro" : "Falso";
        int resultado2 = (a==b) ? 1 : 0;

        System.out.println(valor);
        System.out.println(resultado2);

        //Operadores relacionais:
        /*
        == Quando desejamos verificar se uma variável é IGUAL A outra.
        != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        < Quando desejamos verificar se uma variável é MENOR QUE outra.
        <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
        */

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        /*
        Operadores Lógicos
        Conjunção (and/e - &&): operação lógica que só é verdadeira quando ambos os operandos ou expressões são verdadeiras;
        Disjunção (or/ou - ||): operação que é verdadeira quando ao menos um dos operandos ou expressões é verdadeiro;
        Disjunção Exclusiva (xor - ^): operação que é verdadeira quando ambos os operandos ou expressões são opostos;
        Negação (inversão - !): operação que inverte o valor lógico de um operando ou expressão.
        */

    }
}

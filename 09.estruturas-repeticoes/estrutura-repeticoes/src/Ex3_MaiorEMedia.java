import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int i = 0;
        do {
            System.out.println("Número: ");
            numero = sc.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            i++;
        } while(i < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
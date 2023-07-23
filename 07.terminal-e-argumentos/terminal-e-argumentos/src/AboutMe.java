import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("\n\nOlá, meu nome é " + nome + " " + sobrenome +".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");

        sc.close();
    }
}
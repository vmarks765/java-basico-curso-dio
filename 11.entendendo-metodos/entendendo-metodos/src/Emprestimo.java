public class Emprestimo {
    public static void getTaxa(double valor, int numParcelas) {
        double taxa = 1.0;
        double parcela;
        System.out.println("Valor a ser financiado:  R$ " + valor);

        for (int i = 1; i <= numParcelas; i++) {
            taxa *= 1.035;
        }
        parcela = (valor / numParcelas) * taxa;
        valor = numParcelas * parcela;
        System.out.println("Número de parcelas:  " + numParcelas);
        System.out.println("Valor da parcela:  " + String.format("%.2f", parcela));
        System.out.println("Taxa ao mês:  " + String.format("%.4f", taxa));
        System.out.println("Montante final:  " + String.format("%.2f", valor) + "\n");

    }
}

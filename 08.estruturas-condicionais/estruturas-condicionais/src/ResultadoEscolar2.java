public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 6;

        // Condição Ternária
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
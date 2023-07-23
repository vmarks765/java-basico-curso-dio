
// Modo condicional switch / case
public class SistemaMedida2 {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
        /*
        Observe que a nível de sintaxe, não tivemos nenhum ganho quanto a redução de códigos
        e ainda tivemos mais uma preocupação: informar a palavra break em cada alternativa.
        */
    }
}
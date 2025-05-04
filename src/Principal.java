import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;        
        double valorParaConversao;

        String menu = """
                **************************************************************
                Seja bem vindo/a ao Conversor de Moeda =]

                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real Brasileiro
                4) Real Brasileiro =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Sair
                Escolha uma opção válida>
                **************************************************************
                """;
        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao >= 1 && opcao <= 7) {
                if (opcao != 7) {
                    System.out.println("A opcao escolhida foi: " + opcao);
                    System.out.println("Digite o valor que queseja converter: ");
                    valorParaConversao = leitura.nextDouble();
                    System.out.println("O valor a ser convertido é: " + valorParaConversao);                
                }
            }else{
                System.out.println("Voce digitou uma opcao inválida!");
            }
        }
    }
}

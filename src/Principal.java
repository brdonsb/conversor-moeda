import java.util.Scanner;

import modelo.ConversorMoeda;
import modelo.ConversorMoedaExchangerate;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;        
        String moedaAConverter = "";
        String moedaConvertida = "";
        double valorAConverter = 0;
    
        String menu = """
                **************************************************************
                Seja bem vindo/a ao Conversor de Moeda =]

                1) Dólar americano =>> Peso argentino
                2) Peso argentino =>> Dólar americano
                3) Dólar americano =>> Real Brasileiro
                4) Real Brasileiro =>> Dólar americano
                5) Dólar americano =>> Peso colombiano
                6) Peso colombiano =>> Dólar americano
                7) Sair
                Escolha uma opção válida>
                **************************************************************
                """;
        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao >= 1 && opcao <= 7) {
                if (opcao != 7) {
                    System.out.println("Digite o valor que queseja converter: ");
                    valorAConverter = leitura.nextDouble();
                    switch (opcao) {
                        case 1:
                            moedaAConverter = "USD";
                            moedaConvertida = "ARS";
                            break;
                        case 2:
                            moedaAConverter = "ARS";
                            moedaConvertida = "USD";
                            break;
                        case 3:
                            moedaAConverter = "USD";
                            moedaConvertida = "BRL";
                            break;
                        case 4:
                            moedaAConverter = "BRL";
                            moedaConvertida = "USD";
                            break;                        
                        case 5:
                            moedaAConverter = "USD";
                            moedaConvertida = "COP";
                            break;                        
                        case 6:
                            moedaAConverter = "COP";
                            moedaConvertida = "USD";
                            break;                       
                    }

                    ConversorMoeda conversor = new ConversorMoedaExchangerate(moedaAConverter, moedaConvertida, valorAConverter);
                    conversor.converteMoeda();
                    System.out.println(conversor);
                    System.out.println("O valor convertido É: " + conversor.getValorConvertido());           
                }
            }else{
                System.out.println("Voce digitou uma opcao inválida!");
            }
        }
        leitura.close();
    }
}
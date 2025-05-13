package modelo;

public class ConversorMoeda {
    private String moedaAConverter;
    private String moedaConvertida;
    private double valorAConverter;
    private double valorConvertido;

    public double getValorConvertido() {
        return valorConvertido;
    }

    public ConversorMoeda(String moedaAConverter, String moedaConvertida, double valorAConverter){
        this.moedaAConverter = moedaAConverter;
        this.moedaConvertida = moedaConvertida;
        this.valorAConverter = valorAConverter;
        this.valorConvertido = this.converteMoeda();
    }

    public double converteMoeda(){
        String APYKEY = "89bd25af4ce778f97e9d258a";
        String endereco = "https://v6.exchangerate-api.com/v6/" + APYKEY + "pair/" + this.moedaAConverter + "/" + this.moedaConvertida + "/" + this.valorAConverter;
        System.out.println(endereco);

        return 4.0;
    }
}

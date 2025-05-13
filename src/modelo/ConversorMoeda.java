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
        return 4.0;
    }
}

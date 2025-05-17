package modelo;

public class ConversorMoeda {
    protected String moedaAConverter;
    protected String moedaConvertida;
    protected double valorAConverter;
    protected double valorConvertido;

    public double getValorConvertido() {
        return valorConvertido;
    }

    public ConversorMoeda(String moedaAConverter, String moedaConvertida, double valorAConverter){
        this.moedaAConverter = moedaAConverter;
        this.moedaConvertida = moedaConvertida;
        this.valorAConverter = valorAConverter;
        this.converteMoeda();
    }

    public void converteMoeda(){
    //implementado nas classes que acessam as diversas API de converção de moedas
    }
}

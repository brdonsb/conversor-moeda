package modelo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversorMoedaExchangerate extends ConversorMoeda{
    final String APYKEY = "89bd25af4ce778f97e9d258a";

    public ConversorMoedaExchangerate(String moedaAConverter, String moedaConvertida, double valorAConverter) {
        super(moedaAConverter, moedaConvertida, valorAConverter);
    }

    @Override
    public void converteMoeda(){
        String endereco = "https://v6.exchangerate-api.com/v6/" + APYKEY + "pair/" + this.moedaAConverter + "/" + this.moedaConvertida + "/" + this.valorAConverter;
        Gson gson = new GsonBuilder().create();
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            DesserealizadorMoedaExchange conversao = gson.fromJson(json, DesserealizadorMoedaExchange.class);
            setValorConvertido(conversao.conversion_result());
        } catch (Exception e){
        }
    }
}

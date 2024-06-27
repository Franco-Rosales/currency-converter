package Generadores;

import Modelos.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI {

    public Moneda buscarConvercionMonedas(String monedaValor, String monedaAConvertir, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2b06f6bda84b907b4d029d85/pair/" + monedaValor +"/"+ monedaAConvertir +"/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar esa conversion.");
        }

    }
}

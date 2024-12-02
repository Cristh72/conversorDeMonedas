package com.conversor.connections;

import com.conversor.modelos.Moneda;
import com.conversor.modelos.MonedaDTO;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApiMoneda {
    public static MonedaDTO ricercaDivisa(String codiceISO, String codiceISOVoluto) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/00a33320b182358c4dffac62/pair/" + codiceISO.toUpperCase().trim() + "/" + codiceISOVoluto.toUpperCase().trim());

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new MonedaDTO(new Gson().fromJson(response.body(), Moneda.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

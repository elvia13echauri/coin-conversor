package com.aluracursos.coinconversor.models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinConsult {
    public Coin findCoin (String abbrevCoin){
        URI direcction = URI.create("https://v6.exchangerate-api.com/v6/eee6048c183ee677951606ac/latest/" +
                abbrevCoin);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direcction)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request,HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),Coin.class);
        }catch (Exception e){
            throw new RuntimeException(("No se encontro esa moneda"));
        }
    }
}

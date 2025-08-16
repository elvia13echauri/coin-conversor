package com.aluracursos.coinconversor.main;

import com.aluracursos.coinconversor.models.Coin;
import com.aluracursos.coinconversor.models.CoinConsult;
import com.aluracursos.coinconversor.models.Conversor;

public class Main {
    public static void main(String[] args) {
        CoinConsult consult = new CoinConsult();
        Coin coin = consult.findCoin("ARS");
        Conversor conversor= new Conversor("EUR");
        double result = conversor.calculate(coin,78.6);
        System.out.println(result);

    }
}

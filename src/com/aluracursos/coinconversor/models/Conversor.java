package com.aluracursos.coinconversor.models;

public class Conversor {
    String countryToCoin;



    public Conversor (String countryToCoin){
        this.countryToCoin = countryToCoin;
    }

    public double calculate(Coin consultCoin, double value){
        double result = consultCoin.conversion_rates().get(countryToCoin);
        return result * value;
    }
}

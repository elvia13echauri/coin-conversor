package com.aluracursos.coinconversor.models;

public class Converter {
    private String baseCode;
    private String countryToCoin;
    private double value;
    private double result;
    private String timeData;


    public Converter(String countryToCoin){
        this.countryToCoin = countryToCoin;
    }

    public double calculate(Coin consultCoin, double value){
        double result = consultCoin.conversion_rates().get(countryToCoin);
        this.value = value;
        this.result = result * value;
        this.baseCode = consultCoin.base_code();
        this.timeData = consultCoin.time_last_update_utc();
        return this.result;
    }

    @Override
    public String toString() {
        return """ 
                ------------ Consulta------------ 
                Moneda Base: %s
                Moneda de conversion: %s
                Valor: %.2f
                Convertido: %.2f
                Tiempo de Consulta: %s
                ------------------------------------
                """.formatted(baseCode, countryToCoin, value, result, timeData);
    }
}

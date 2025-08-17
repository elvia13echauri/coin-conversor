package com.aluracursos.coinconversor.main;

import com.aluracursos.coinconversor.models.Coin;
import com.aluracursos.coinconversor.models.CoinConsult;
import com.aluracursos.coinconversor.models.Converter;

import java.util.List;
import java.util.Scanner;

public class OparationMenu extends TextMenu {


    public Converter operating (String countryFrom, String countryTo, double value, CoinConsult consult, int option){
        Scanner teclado = new Scanner(System.in);
        Coin coin = consult.findCoin(countryFrom);
        Converter converter = new Converter(countryTo);
        askForValue();
        value = teclado.nextDouble();
        double result = converter.calculate(coin,value);
        selecctionDisplay(option,result,value);
        return converter;
    }
}

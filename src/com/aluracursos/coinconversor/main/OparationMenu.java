package com.aluracursos.coinconversor.main;

import com.aluracursos.coinconversor.models.Coin;
import com.aluracursos.coinconversor.models.CoinConsult;
import com.aluracursos.coinconversor.models.Conversor;

import java.util.Scanner;

public class OparationMenu extends TextMenu {


    public void operating (String countryFrom, String countryTo, double value, CoinConsult consult, int option){
        Scanner teclado = new Scanner(System.in);
        Coin coin = consult.findCoin(countryFrom);
        Conversor conversor = new Conversor(countryTo);
        askForValue();
        value = teclado.nextDouble();
        double result = conversor.calculate(coin,value);
        selecctionDisplay(option,result,value);
    }
}

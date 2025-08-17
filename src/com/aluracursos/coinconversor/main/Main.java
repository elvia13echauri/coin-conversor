package com.aluracursos.coinconversor.main;

import com.aluracursos.coinconversor.models.CoinConsult;
import com.aluracursos.coinconversor.models.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option = 10;
        OparationMenu menu = new OparationMenu();
        List<Converter> conversions = new ArrayList<>();

        CoinConsult consult = new CoinConsult();
        double value=0;


        while (option != 0){
            menu.menuDisplay();
            option = teclado.nextInt();
            switch (option){
                case 1:
                    conversions.add(menu.operating("USD","ARS", value, consult, option));
                    break;
                case 2:
                    conversions.add(menu.operating("ARS","USD", value, consult, option));
                    break;
                case 3:
                    conversions.add(menu.operating("USD","BRL", value, consult, option));
                    break;
                case 4:
                    conversions.add(menu.operating("BRL","USD", value, consult, option));
                    break;
                case 5:
                    conversions.add(menu.operating("USD","COP", value, consult, option));
                    break;
                case 6:
                    conversions.add(menu.operating("COP","USD", value, consult, option));
                    break;
                case 7:
                    conversions.add(menu.operating("USD","MXN", value, consult, option));
                    break;
                case 8:
                    conversions.add(menu.operating("MXN","USD", value, consult, option));
                    break;
                case 9:
                    System.out.println(conversions);
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro Conversor de Monedas");
                    break;
                default:
                    System.out.println("No es una opción Valida, por favor intenta de nuevo");

            }
        }
    }
}

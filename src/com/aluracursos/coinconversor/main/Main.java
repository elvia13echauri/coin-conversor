package com.aluracursos.coinconversor.main;

import com.aluracursos.coinconversor.models.Coin;
import com.aluracursos.coinconversor.models.CoinConsult;
import com.aluracursos.coinconversor.models.Conversor;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option = 0;
        OparationMenu menu = new OparationMenu();

        CoinConsult consult = new CoinConsult();
        double value=0;


        while (option != 9){
            menu.menuDisplay();
            option = teclado.nextInt();
            switch (option){
                case 1:
                    menu.operating("USD","ARS", value, consult, option);
                    break;
                case 2:
                    menu.operating("ARS","USD", value, consult, option);
                    break;
                case 3:
                    menu.operating("USD","BRL", value, consult, option);
                    break;
                case 4:
                    menu.operating("BRL","USD", value, consult, option);
                    break;
                case 5:
                    menu.operating("USD","COP", value, consult, option);
                    break;
                case 6:
                    menu.operating("COP","USD", value, consult, option);
                    break;
                case 7:
                    menu.operating("USD","MXN", value, consult, option);
                    break;
                case 8:
                    menu.operating("MXN","USD", value, consult, option);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro Conversor de Monedas");
                    break;
                default:
                    System.out.println("No es una opción Valida, por favor intenta de nuevo");

            }
        }
    }
}

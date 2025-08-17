package com.aluracursos.coinconversor.main;

import java.util.logging.SocketHandler;

public class TextMenu {

    public static void menuDisplay (){
        System.out.println("""
                ************ Conversor de Moneda ************
                
                Bienvenid@s al conversor de monedas
                Las opciones son:
                
                1 - Dolar ==> Peso Argentino
                2 - Peso Argentino ==> Dolar
                3 - Dolar ==> Real Brasileño
                4 - Real Brasileño ==> Dolar
                5 - Dolar ==> Peso Colombiano
                6 - Peso Colombiano ==> Dolar
                7 - Dolar ==> Peso Mexicano
                8 - Peso Mexicano ==> Dolar
                9 - Mostrar todas las consultas
                0 - Salir
                
                Escribe el número de la conversión que deseas hacer:
                """);
    }

    public void selecctionDisplay(int option, double result, double value){
        switch (option){
            case 1:
                System.out.println("""
                        $ %.2f Dolares = $ %.2f Pesos Argentinos
                        """.formatted(value,result));
                break;
            case 2:
                System.out.println("""
                        $ %.2f Pesos Argentinos = $ %.2f Dolares
                        """.formatted(value,result));
                break;
            case 3:
                System.out.println("""
                        $ %.2f Dolares = $ %.2f Reales Brasileños
                        """.formatted(value,result));
                break;
            case 4:
                System.out.println("""
                        $ %.2f Reales Brasileños = $ %.2f Dolares
                        """.formatted(value,result));
                break;
            case 5:
                System.out.println("""
                        $ %.2f Dolares = $ %.2f Pesos Colombianos
                        """.formatted(value,result));
                break;
            case 6:
                System.out.println("""
                        $ %.2f Pesos Colombianos = $ %.2f Dolares
                        """.formatted(value,result));
                break;
            case 7:
                System.out.println("""
                        $ %.2f Dolares = $ %.2f Pesos Maxicanos
                        """.formatted(value,result));
                break;
            case 8:
                System.out.println("""
                        $ %.2f Pesos Mexicanos = $ %.2f Dolares
                        """.formatted(value,result));
                break;
        }
    }
    public void askForValue () {
        System.out.println("Ingresa el valor a convertir");
    }
}

package com.mycompany.eva1_11_tipos_de_datos;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 */
public class EVA1_11_TIPOS_DE_DATOS {

    public static void main(String[] args) {
        byte calif;
        calif = 127;
        //calif = 200; <-- No se puede porque "byte" llega hasta 127
        calif = -128; 
        //calif = -200; <- No se puede, "byte" es desde -128
        //calif 127 + 1: 
        int valor;
        valor = Integer.MAX_VALUE;
        System.out.println(valor);
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        //
        valor = Integer.MAX_VALUE;
        System.out.println(valor + 1);
        //Al pasar el valor máximo de "int", se regresa al primer valor que aborda
        
        //---------------------------------------------------------------------
        char caracter = 'A';
        System.out.println(caracter);
        System.out.println(caracter + 1);
    }
}

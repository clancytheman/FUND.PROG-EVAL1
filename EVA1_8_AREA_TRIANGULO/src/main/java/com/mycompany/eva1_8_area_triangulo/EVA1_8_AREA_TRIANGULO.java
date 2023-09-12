/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA1_8_AREA_TRIANGULO {

    public static void main(String[] args) {
        //"double" --> tipo de dato para número decimal.
        double AREA;
        double BASE;
        double ALTURA;
        Scanner CPTR = new Scanner(System.in);
        System.out.println("Introduce la base del triángulo=");
        BASE = CPTR.nextDouble();
        System.out.println("Introduce la altura=");
        ALTURA = CPTR.nextDouble();
        AREA = (BASE*ALTURA) / 2;
        System.out.println("Area=");
        System.out.println(AREA);
    }
}

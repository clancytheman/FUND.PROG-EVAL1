/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA1_5_ENTRADA_SALIDA {

    public static void main(String[] args) {
        //1. DECLARACIÓN DE VARIABLES
        String nombre;
        String apellidos;
        String semestre;
        Scanner capturota = new Scanner (System.in);
        //i. fin de instrucción en Java
        //2. CAPTURA DE VARIABLES
        System.out.println("Introduce tu nombre:");
        nombre = capturota.nextLine();
        System.out.println("Introduce tus apellidos:");
        apellidos = capturota.nextLine();
        System.out.println("Introduce el semestre:");
        semestre = capturota.nextLine();
        //Java es sensible a mayúsculas y minúsculas
        //Es decir, "System" es diferente a "system"       
        //3. MOSTRAR LOS DATOS CAPTURADOS
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(semestre);
    }
}

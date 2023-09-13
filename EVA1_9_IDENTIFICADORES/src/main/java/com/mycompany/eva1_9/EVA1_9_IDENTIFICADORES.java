/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9;

/**
 *
 * @author DIEGO ESCARCEGA 
 */
public class EVA1_9_IDENTIFICADORES {

    public static void main(String[] args) {
        //al usar identificadores Java no permite iniciar con números, ni tener espacios dentro del identificador.
        //Se permiten caracteres (A-Z),(a-z),(0-9),"$" y "_".
        //Por igual, las variables no se pueden repetir.
        int $cashmoney$;
        int cashmoney;
        int CASHMONEY;
        int CashMoney;
        int _ca$hmoney_;
        int cash_money;
        //"int public;", no podemos usar "public", ya que es keyword.
        int PUBLIC;
        //A diferencia "PUBLIC", si es válido usar, ya que es diferente (mayúsculas).
        //Existen otras variables que son prohibidas usar como identificadores:
        //"class", "static", "void" (Reserved Words, es de Java).
        //"HelloWorld", "main" (keywords).
        //"String", "println", "System", "out" (código que usamos).
        //Hay que nombrar los identificadores de manera que se entienda su función.
    }
}

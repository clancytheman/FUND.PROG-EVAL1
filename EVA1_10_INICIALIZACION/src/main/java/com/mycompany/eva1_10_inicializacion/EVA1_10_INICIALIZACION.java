package com.mycompany.eva1_10_inicializacion;
/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA1_10_INICIALIZACION {

    public static void main(String[] args) {
        int valor = 0; //Inicializar la variable, SIEMPRE.
        System.out.println(valor);
        
        //EJEMPLO:
        int precio; //declarar
        precio=100; //inicializar
        //
        double salario = 0, precioMayoreo = 100, iva = 10.5, subtotal = 15, total =100.0; 
        //tenemos 5 variables, todas son tipo "double".
        //tambien todas se pueden inicializar en la misma linea.
        
        //CONSTANTES:
        //"final" permite asignar un valor solo una vez.
        final int conteo = 100;//"final" permite asignar un valor solo una vez.
        System.out.println(conteo);
        //
        final double VALOR_PI = 3.1416;
        final String ESCUELA = "Instituto Tecnológico de Chihuahua II";
        final int CALIF_PARA = 70;
        
        /*
        Varias lineas de comentarios
        para cuando necesites escribir muucho
        (>_<)7
        */
    }
}

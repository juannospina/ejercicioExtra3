/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package ejercicioextra3;

import java.util.Scanner;

public class EjercicioExtra3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una letra: ");
        String letra = entrada.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Es vocal");
        }else{
            System.out.println("No es vocal");
        }
    }    
}

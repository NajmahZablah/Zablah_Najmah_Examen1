/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zablah_najmah_examen1;

import java.util.*;

/**
 *
 * @author najma
 */
public class Zablah_Najmah_Clave {
    public static void main(String[] args) {
   Scanner lea = new Scanner(System.in).useDelimiter("\n");
   
   int opcion;
    do {
        //Menu Principal:
        System.out.println("\n=== Cifrado/Descifrado ===");
        System.out.println("1. Cifrar un mensaje");
        System.out.println("2. Descifrar un mensaje");
        System.out.println("3. Salir");
        System.out.print("Por favor, seleccione una de las opciones: ");
        opcion = lea.nextInt();
        
        //Variables tipo string:
        String mensajeProcesado;
        String mensajeOriginal;
        
        //Procedimiento:
        if (opcion == 1) {
            System.out.print("Ingrese el mensaje a cifrar: ");
            mensajeOriginal = lea.next();
            mensajeProcesado = "";
            
            int i = 0;
            while (i < mensajeOriginal.length()) {
            char caracterActual = mensajeOriginal.charAt(i);
            char caracterCifrado = caracterActual;
        
            //Lógica para minúsculas:
            if (caracterActual >= 'a' && caracterActual <= 'z') {
            caracterCifrado = (char) ('z' - (caracterActual - 'a'));
            //Lógica para mayúsculas     
            } else if (caracterActual >= 'A' && caracterActual <= 'Z') {
            caracterCifrado = (char) ('Z' - (caracterActual - 'A'));
            }
        
            mensajeProcesado += caracterCifrado;
            i++;
            }
            System.out.println("Mensaje cifrado: "+mensajeProcesado);
            
        } else if (opcion == 2) {
            System.out.print("Ingrese el mensaje a descrifrar: ");
            mensajeOriginal = lea.next();
            mensajeProcesado = "";
            
            int i = 0;
            while (i < mensajeOriginal.length()) {
            char caracterActual = mensajeOriginal.charAt(i);
            char caracterCifrado = caracterActual;
        
            //Lógica para minúsculas:
            if (caracterActual >= 'a' && caracterActual <= 'z') {
            caracterCifrado = (char) ('z' - (caracterActual - 'a'));
            //Lógica para mayúsculas     
            } else if (caracterActual >= 'A' && caracterActual <= 'Z') {
            caracterCifrado = (char) ('Z' - (caracterActual - 'A'));
            }
        
            mensajeProcesado += caracterCifrado;
            i++;  
            }
            System.out.println("Mensjae descifrado: "+mensajeProcesado);
        } else if (opcion == 3) {
            System.out.println("Saliendo del programa... nos vemos!");
        } else {
            System.out.println("Opcion invalida. Por favor, seleccione una de las opciones presentes.");
        }  
    } while (opcion != 3);
    
    lea.close();
    }
}



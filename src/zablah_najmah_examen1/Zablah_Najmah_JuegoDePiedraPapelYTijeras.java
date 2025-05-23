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
public class Zablah_Najmah_JuegoDePiedraPapelYTijeras {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        
        //SistemaActivo:
        boolean seguirJugando = true;
        
        //Bienvenida al usuario:
        System.out.println("\n===Bienvenido al Juego de Piedra, Papel o Tigera! ===");
        
        //Procedimiento:
        while (seguirJugando) {
        String eleccionUsuario;
        do {
            System.out.print("Ingresa una de las siguientes opciones (Piedra, Papel o Tijeras): ");
            eleccionUsuario = lea.next();
            
            if (!eleccionUsuario.equalsIgnoreCase("Piedra") && !eleccionUsuario.equalsIgnoreCase("Papel") && !eleccionUsuario.equalsIgnoreCase("Tijeras")) {
            System.out.println("Opcion Invalida. Vuelva a intentarlo.");
            }
        } while (!eleccionUsuario.equalsIgnoreCase("Piedra") && !eleccionUsuario.equalsIgnoreCase("Papel") && !eleccionUsuario.equalsIgnoreCase("Tijeras"));
        
        String eleccionCompu = "";
        int numeroAleatorio = random.nextInt(3);
        
        switch (numeroAleatorio) {
            case 0:
                eleccionCompu = "Piedra";
                break;
            case 1: 
                eleccionCompu = "Papel";
                break;
            case 2:
                eleccionCompu = "Tijeras";
                break;
        }
        System.out.println("La computadora ha elegido: "+eleccionCompu);
        
        
        if (eleccionUsuario.equalsIgnoreCase(eleccionCompu)) {
            System.out.println("Es un empate!");
        } else if (eleccionUsuario.equalsIgnoreCase("Piedra")) {
            if (eleccionCompu.equalsIgnoreCase("Tijeras")) {
                System.out.println("Ganaste la ronda! Felicidades!");
            } else {
                System.out.println("Perdiste la ronda! Mejor suerte la proxima!");
            }
        } else if (eleccionUsuario.equalsIgnoreCase("Papel")) {
            if (eleccionCompu.equalsIgnoreCase("Piedra")) {
                System.out.println("Ganaste la ronda! Felicidades!");
            } else {
                System.out.println("Perdiste la ronda! Mejor suerte la proxima!");
            }
        } else if (eleccionUsuario.equalsIgnoreCase("Tijeras")) {
            if (eleccionCompu.equalsIgnoreCase("Papel")) {
                System.out.println("Ganaste la ronda! Felicidades!");
            } else {
                System.out.println("Perdiste la ronda! Mejor suerte la proxima!");
            }
        }
        String respuesta = "";
        do {
        System.out.print("\nDeseas jugar una ronda? (si/no): ");
        respuesta = lea.next();
        
        if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
            System.out.println("Opcion no valida. Ingrese 'si' o 'no'.");
            } 
        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
        
        seguirJugando = respuesta.equalsIgnoreCase("si");
        }
        System.out.println("Buena ronda! Nos vemos!");
        lea.close();
    }
}


        
        

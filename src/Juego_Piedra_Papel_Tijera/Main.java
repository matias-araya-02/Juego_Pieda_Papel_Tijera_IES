package Juego_Piedra_Papel_Tijera;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" --- PIEDRA, PAPEL O TIJERA --- ");

        int cont_win= 0, cont_lose = 0;
        int opcion;
        double num_aleatorio = 0;
        boolean salir;

        for (int i = 0; i < 3 ; i++) {
            do {
                System.out.println("\n ---- RONDA " +(i+1)+" ---- ");
                
                String mensaje = " ------------- RONDA "+(i+1)+" ------------- "+"\nIngrese que desea jugar:\n1. Piedra\n2. Papel\n3. Tijera";
                String opcionStr = JOptionPane.showInputDialog(null, mensaje, "Piedra, Papel o Tijera", JOptionPane.QUESTION_MESSAGE);
                opcion = Integer.parseInt(opcionStr);

                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    salir = true;
                }else {
                    System.out.println("ERROR!, Ingrese una opción valida");
                    salir = false;
                }
            }while(!salir);

            if (opcion == 1) {
                System.out.println("Tiraste PIEDRA");
            } else if (opcion == 2) {
                System.out.println("Tiraste PAPEL");
            }else {
                System.out.println("TIRASTE TIJERA");
            }

            num_aleatorio = (Math.random()*3) + 1;
            int num_alea_int = (int)num_aleatorio;


            if (num_alea_int == 1) {
                System.out.println("PC tiró PIEDRA");
            } else if (num_alea_int == 2) {
                System.out.println("PC tiró PAPEL");
            } else{
                System.out.println("PC tiró TIJERA ");
            }

            System.out.println("\n --- RESULTADO --- ");

            if (num_alea_int == 1 && opcion == 1){
                System.out.println("EMPATE");
            } else if (num_alea_int == 1 && opcion == 2) {
                System.out.println("GANASTE");
                cont_win++;
            } else if (num_alea_int == 1 && opcion == 3) {
                System.out.println("PERDISTE");
                cont_lose++;
            }

            if (num_alea_int == 2 && opcion == 1){
                System.out.println("PERDISTE");
                cont_lose++;
            } else if (num_alea_int == 2 && opcion == 2) {
                System.out.println("EMPATE");
            } else if (num_alea_int == 2 && opcion == 3) {
                System.out.println("GANASTE");
                cont_win++;
            }

            if (num_alea_int == 3 && opcion == 1){
                System.out.println("GANASTE");
                cont_win++;
            } else if (num_alea_int == 3 && opcion == 2) {
                System.out.println("PERDISTE");
                cont_lose++;
            }else if (num_alea_int == 3 && opcion == 3) {
                System.out.println("EMPATE");
            }

            System.out.println("Cantidad ganada: "+cont_win);
            System.out.println("Cantidad perdidas: "+cont_lose);
        }

        if (cont_win > cont_lose) {
            System.out.println("LE GANASTE A LA PC PAPAAAA ;) !!");
        }else if (cont_win ==  cont_lose){
            System.out.println("CASI CHE :/");
        } else {
            System.out.println("SOS ALTO MUERTO JSAJSA");
        }

    }
}

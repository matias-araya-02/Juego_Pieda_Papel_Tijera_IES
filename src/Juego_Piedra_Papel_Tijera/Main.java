package Juego_Piedra_Papel_Tijera;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" --- PIEDRA, PEL O TIJERA --- ");

        int cont_win= 0, cont_lose = 0;
        int opcion;
        double num_aleatorio = 0;
        boolean salir;

        for (int i = 0; i < 3 ; i++) {
            do {
                System.out.println("RONDA " +(i+1));
                System.out.println("\nIngrese que desea jugar: ");
                System.out.println("1. Piedra");
                System.out.println("2. Papel");
                System.out.println("3. Tijera");
                System.out.print("Opcion --> ");
                opcion = new Scanner(System.in).nextInt();

                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    salir = true;
                }else {
                    System.out.println("ERROR!, Ingrese una opción valida");
                    salir = false;
                }
            }while(!salir);


            System.out.println();
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
            System.out.println("LE GANASTE A LA PC PAPAAAA!!");
        }else {
            System.out.println("SOS ALTO MUERTO JSAJSA");
        }

    }
}

package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion = 0, numerito1, numerito2;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("==========================");
            System.out.println("1.-sumar");
            System.out.println("2.-restar");
            System.out.println("0.-salir");

            System.out.print("elige una opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 1){
                System.out.print("dame numerito: ");
                numerito1 = entrada.nextInt();
                System.out.print("dame otro numerito: ");
                numerito2 = entrada.nextInt();
                System.out.println();
                System.out.println("la suma es: " + (numerito1+numerito2));
                System.out.println();
            } else if(opcion == 2) {
                System.out.print("dame numerito: ");
                numerito1 = entrada.nextInt();
                System.out.print("dame otro numerito: ");
                numerito2 = entrada.nextInt();
                System.out.println();
                System.out.println("la resta es: " + (numerito1-numerito2));
                System.out.println();

            } else if (opcion == 0){
                System.out.println("ni dos besiko ni na");
                System.out.println();
            } else {
                System.out.println("ese numero no me gusta ponme otro olvidona");
                System.out.println();
            }





        }while (opcion != 0);
    }
}

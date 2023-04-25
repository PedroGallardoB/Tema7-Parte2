package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Hora hora = new Hora(23, 59, 0);//Objeto hora
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de segundos para aumentarlos: ");//Pedimos la cantidad de segundos a aumentar
        int segundos = sc.nextInt();//Lo leemos

        
        for (int i = 0; i < segundos; i++) {//Bucle que incrementa las veces pedidas
            hora.incrementaSegundo();
        }
        //Mostramos la hora
        System.out.println("HORA: " + hora.getHora() + ":" + hora.getMinuto() + ":" + hora.getSegundo());
        sc.close();
    }
   
}
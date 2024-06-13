package Taller_Gestion_Reservas;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Boda boda1 = new Boda(123454,"Ariel","ariel16@gmail.com","14/06/2024","Boda",1000);
        boda1.calcularCosto(300,1000);
        boda1.mostrarDatos();
    }
}

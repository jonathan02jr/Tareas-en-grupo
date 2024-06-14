package Taller_Gestion_Reservas;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("1. Conferencia");
        System.out.println("2. Boda");
        System.out.println("3. Concierto");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");

        int opcion1= sc.nextInt();
        switch (opcion1){
            case 1:
                break;
            case 2:
                break;
            case 3:
                Concierto evento1 = new Concierto(12345,"Josue","josue@gmail.com","26 de julio","Concierto",1000,400,150);
                System.out.println("---CONCIERTO---");
                System.out.println("El valor base es de: "+evento1.getCostoEvento());

                System.out.println("---- SERVICIOS ADICIONALES ----");
                System.out.println("1. Seguridad adicional- $"+evento1.getValorSeguridad());
                System.out.println("2. Stand de comida - $"+evento1.getValorComida());
                System.out.println("3. Los dos servicios - $550");
                System.out.println("4. No desea ningun servicio / Salir");
                System.out.print("Ingrese una opcion: ");
                int opcion2= sc.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println("---------------------------------------- ");
                        evento1.calcularCosto(1);
                        break;
                    case 2:
                        System.out.println("---------------------------------------- ");
                        evento1.calcularCosto(2);
                        break;
                    case 3:
                        System.out.println("---------------------------------------- ");
                        evento1.calcularCosto(3);
                        break;
                    case 4:
                        System.out.println("---------------------------------------- ");
                        evento1.mostrarDatos();
                        return;
                    default:
                        System.out.println("Ingrese valores del 1 al 4");
                        break;
                }
                break;
            case 4:
                return;
            default:
                System.out.println("Ingrese valores del 1 al 4");
                break;
        }



    }
}

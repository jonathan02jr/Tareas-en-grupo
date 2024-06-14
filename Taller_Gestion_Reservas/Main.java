package Taller_Gestion_Reservas;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion2;
        System.out.println("-----BIENVENIDO AL PROGRAMA PARA RESERVAS---------");
        System.out.println("********************************************************");
        System.out.println("Por favor escoja el tipo de reserva que desea realizar: ");
        System.out.println("1. Conferencia");
        System.out.println("2. Boda");
        System.out.println("3. Concierto");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion1= sc.nextInt();
        switch (opcion1){
            case 1:
                Conferencia conferencia1 = new Conferencia(1715141219,"Ariel","aashqui@gmail.com","13 de Agosto","CONFERENCIA",1000,200,100);
                System.out.println("---CONFERENCIA---");
                System.out.println("El valor base es de: "+conferencia1.getCostoEvento());
                System.out.println("---- SERVICIOS ADICIONALES ----");
                System.out.println("1. Servicios de Catering- $"+conferencia1.getValorServicioCatering());
                System.out.println("2. Equipo audiovisual $"+conferencia1.getValorEquipoAudiovisual());
                System.out.println("3. Los dos servicios - $300");
                System.out.println("4. No desea ningun servicio / Salir");
                System.out.print("Ingrese una opcion: ");
                opcion2= sc.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println("---------------------------------------- ");
                        conferencia1.calcularCosto(1);
                        break;
                    case 2:
                        System.out.println("---------------------------------------- ");
                        conferencia1.calcularCosto(2);
                        break;
                    case 3:
                        System.out.println("---------------------------------------- ");
                        conferencia1.calcularCosto(3);
                        break;
                    case 4:
                        System.out.println("---------------------------------------- ");
                        conferencia1.mostrarDatos();
                        return;
                    default:
                        System.out.println("Ingrese valores del 1 al 4");
                        break;
                }
                break;
            case 2:
                Boda boda1 = new Boda(1751253400,"Evelyn","eguachamin@gmail.com","15 de Febrero","BODA",2000,500,300);
                System.out.println("---BODA---");
                System.out.println("El valor base es de: "+boda1.getCostoEvento());
                System.out.println("---- SERVICIOS ADICIONALES ----");
                System.out.println("1. Decoración floral $"+boda1.getValorDecoracionFloral());
                System.out.println("2. Música en vivo $"+boda1.getValorMusicaEnVivo());
                System.out.println("3. Los dos servicios - $800");
                System.out.println("4. No desea ningun servicio / Salir");
                System.out.print("Ingrese una opcion: ");
                opcion2= sc.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println("---------------------------------------- ");
                        boda1.calcularCosto(1);
                        break;
                    case 2:
                        System.out.println("---------------------------------------- ");
                        boda1.calcularCosto(2);
                        break;
                    case 3:
                        System.out.println("---------------------------------------- ");
                        boda1.calcularCosto(3);
                        break;
                    case 4:
                        System.out.println("---------------------------------------- ");
                        boda1.mostrarDatos();
                        return;
                    default:
                        System.out.println("Ingrese valores del 1 al 4");
                        break;
                }
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
                opcion2= sc.nextInt();
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

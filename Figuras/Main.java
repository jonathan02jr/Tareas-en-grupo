package Figuras;

import java.util.Scanner;
//Ariel Ashqui-Jonathan Ramirez - Evelyn Guachamin
//Tarea Conjunta
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Figuras Geometricas");
            System.out.println("1. Figura 2D");
            System.out.println("2. Figura 3D");
            System.out.println("3. Salir");
            System.out.print("Seleccione el tipo de figura: ");
            int tipoFigura = scanner.nextInt();

            switch (tipoFigura) {
                case 1:
                    System.out.println("1. Cuadrilátero");
                    System.out.println("2. Triángulo");
                    System.out.println("3. Otro");
                    System.out.println("Seleccione la figura: ");

                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1: // Cuadrilátero
                            System.out.println("Ingrese el lado A del cuadrilátero:");
                            double ladoA = scanner.nextDouble();
                            System.out.println("Ingrese el lado B del cuadrilátero:");
                            double ladoB = scanner.nextDouble();
                            Cuadrilateros cuadrilatero = new Cuadrilateros(ladoA, ladoB);
                            cuadrilatero.calcularArea();
                            cuadrilatero.calcularPerimetro();
                            cuadrilatero.mostrar_Datos();
                            System.out.print("\n");
                            break;
                        case 2: // Triángulo
                            System.out.println("Ingrese la base (Lado A) del triángulo:");
                            ladoA = scanner.nextDouble();
                            System.out.println("Ingrese la altura (Lado B) del triángulo:");
                            ladoB = scanner.nextDouble();
                            System.out.println("Ingrese el lado (C) del triángulo:");
                            double ladoC = scanner.nextDouble();
                            Triangulos triangulo = new Triangulos(ladoA, ladoB, ladoC);
                            triangulo.calcularArea();
                            triangulo.calcularPerimetro();
                            triangulo.mostrar_Datos();
                            System.out.print("\n");
                            break;
                        case 3: // Otro
                            System.out.println("Seleccione el tipo de figura:");
                            System.out.println("1. N Lados Poligono");
                            System.out.println("2. Círculo");
                            int subopcion = scanner.nextInt();
                            switch (subopcion) {
                                case 1: // N Lados
                                    System.out.println("Ingrese la cantidad de lados del polígono:");
                                    int cantidadLados = scanner.nextInt();
                                    System.out.println("Ingrese la longitud de cada lado del polígono:");
                                    double longitudLado = scanner.nextDouble();
                                    NLados poligono = new NLados(cantidadLados, longitudLado);
                                    poligono.calcularArea();
                                    poligono.calcularPerimetro();
                                    poligono.mostrar_Datos();
                                    System.out.print("\n");
                                    break;
                                case 2: // Círculo
                                    System.out.println("Ingrese el radio del círculo:");
                                    double radio = scanner.nextDouble();
                                    Circulo circulo = new Circulo(radio);
                                    circulo.calcularArea();
                                    circulo.calcularPerimetro();
                                    circulo.mostrar_Datos();
                                    System.out.print("\n");
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;

                case 2: // Figura 3D
                    System.out.println("1. Cubo");
                    System.out.println("2. Esfera");
                    System.out.print("Seleccione la figura 3D: ");

                    int opcion3D = scanner.nextInt();

                    switch (opcion3D) {
                        case 1:
                            System.out.println("Ingrese la longitud de la arista del cubo:");
                            double aristaCubo = scanner.nextDouble();
                            // volumen del cubo
                            double volumenCubo = Math.pow(aristaCubo, 3);
                            System.out.println("Volumen del cubo: " + volumenCubo+'\n');
                            break;
                        case 2:
                            System.out.println("Ingrese el radio de la esfera:");
                            double radioEsfera = scanner.nextDouble();
                            double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radioEsfera, 3);
                            System.out.println("Volumen de la esfera: " + Math.round(volumenEsfera)+'\n');
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del sistema....");
                    return;
                default:
                    System.out.println("Opción no válida");
            }

        }

    }
}

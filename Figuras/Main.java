package Figuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Menú
        System.out.println("Seleccione la figura:");
        System.out.println("1. Cuadrilátero");
        System.out.println("2. Triángulo");
        System.out.println("3. Otro");
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
                break;
            case 2: // Triángulo
                System.out.println("Ingrese el lado A del triángulo:");
                ladoA = scanner.nextDouble();
                System.out.println("Ingrese el lado B del triángulo:");
                ladoB = scanner.nextDouble();
                Triangulos triangulo = new Triangulos(ladoA, ladoB);
                triangulo.calcularArea();
                triangulo.calcularPerimetro();
                triangulo.mostrar_Datos();
                break;
            case 3: // Otro
                System.out.println("Seleccione el tipo de figura:");
                System.out.println("1. N Lados");
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
                        break;
                    case 2: // Círculo
                        System.out.println("Ingrese el radio del círculo:");
                        double radio = scanner.nextDouble();
                        Circulo circulo = new Circulo(radio);
                        circulo.calcularArea();
                        circulo.calcularPerimetro();
                        circulo.mostrar_Datos();
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

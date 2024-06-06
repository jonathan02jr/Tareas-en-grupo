package Figuras;
//Evelyn
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
                Cuadrilateros cuadrilatero = new Cuadrilateros();
                cuadrilatero.ladoA = ladoA;
                cuadrilatero.ladoB = ladoB;
                cuadrilatero.area = cuadrilatero.calcularArea();
                cuadrilatero.perimetro = cuadrilatero.calcularPerimetro();
                cuadrilatero.mostrarDatos();
                break;
            case 2: // Triángulo
                System.out.println("Ingrese el lado A del triángulo:");
                ladoA = scanner.nextDouble();
                System.out.println("Ingrese el lado B del triángulo:");
                ladoB = scanner.nextDouble();
                Triangulos triangulo = new Triangulos();
                triangulo.ladoA = ladoA;
                triangulo.ladoB = ladoB;
                triangulo.area = triangulo.calcularArea();
                triangulo.perimetro = triangulo.calcularPerimetro();
                triangulo.mostrarDatos();
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
                        poligono.area = poligono.calcularArea();
                        poligono.perimetro = poligono.calcularPerimetro();
                        poligono.mostrarDatos();
                        break;
                    case 2: // Círculo
                        System.out.println("Ingrese el radio del círculo:");
                        double radio = scanner.nextDouble();
                        Circulo circulo = new Circulo(radio);
                        circulo.area = circulo.calcularArea();
                        circulo.perimetro = circulo.calcularPerimetro();
                        circulo.mostrarDatos();
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

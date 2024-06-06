package Figuras;

public class Triangulos extends Regulares {
    public double ladoA;
    public double ladoB;

    public Triangulos() {
    }

    public Triangulos(double ladoA, double ladoB) {
        super(3, "Triángulo");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        area = (ladoA * ladoB) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 3 * ladoA;
        return perimetro;
    }

    @Override
    public void mostrar_Datos() {
        super.mostrar_Datos();
        System.out.println("Base = " + ladoA);
        System.out.println("Altura = " + ladoB);
        System.out.println("Área = " + calcularArea());
        System.out.println("Perímetro = " + calcularPerimetro());
    }
}

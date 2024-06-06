package Figuras;

public class Triangulos extends Regulares {
    public double ladoA;
    public double ladoB;
    public double ladoC;
    public Triangulos() {
    }

    public Triangulos(double ladoA, double ladoB, double ladoC) {
        super(3, "Triángulo");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        area = (ladoA * ladoB) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = ladoB + ladoC + ladoA;
        return perimetro;
    }

    @Override
    public void mostrar_Datos() {
        super.mostrar_Datos();
        System.out.println("Base = " + ladoA);
        System.out.println("Altura = " + ladoB);
    }
}

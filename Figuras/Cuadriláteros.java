package Figuras;

public class Cuadrilateros extends DosD {
    public double ladoA;
    public double ladoB;

    public Cuadrilateros() {
    }

    public Cuadrilateros(double ladoA, double ladoB) {
        super(4, "Cuadrilátero");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        area = ladoA * ladoB;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * (ladoA + ladoB);
        return perimetro;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lado A = " + ladoA);
        System.out.println("Lado B = " + ladoB);
        System.out.println("Área = " + calcularArea());
        System.out.println("Perímetro = " + calcularPerimetro());
    }
}
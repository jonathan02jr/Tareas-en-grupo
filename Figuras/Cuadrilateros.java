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
    public void mostrar_Datos() {
        super.mostrar_Datos();
        System.out.println("Lado A = " + ladoA);
        System.out.println("Lado B = " + ladoB);

    }
}
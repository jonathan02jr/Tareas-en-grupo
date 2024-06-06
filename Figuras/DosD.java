package Figuras;

public class DosD extends FigurasGeometricas {
    public double area;
    public double perimetro;

    public DosD() {
    }

    public DosD(int nLados, String nombre) {
        super(nLados, nombre);
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public void mostrar_Datos() {
        super.mostrar_Datos();
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

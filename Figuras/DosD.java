package Figuras;

public class DosD extends Figuras_Geometricas {
    public double area;
    public double perimetro;

    public DosD(int nLados, String nombre, double area, double perimetro) {
        super(nLados, nombre);
        this.area = area;
        this.perimetro = perimetro;
    }
    public double calcularArea() {
        return 0;
    }
    public double calcularPerimetro() {
        return 0;
    }
    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

package Figuras;

public class NLados extends Otros {
    public double longitudLado;

    public NLados() {
    }

    public NLados(int cantidadLados, double longitudLado) {
        super(cantidadLados, "Polígono de " + cantidadLados + " lados");
        this.longitudLado = longitudLado;
    }

    @Override
    public double calcularArea() {
        area = (nLados * longitudLado * longitudLado) / (4 * Math.tan(Math.PI / nLados));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = nLados * longitudLado;
        return perimetro;
    }

    @Override
    public void mostrar_Datos() {
        super.mostrar_Datos();
        System.out.println("Longitud del lado = " + longitudLado);
        System.out.println("Área = " + calcularArea());
        System.out.println("Perímetro = " + calcularPerimetro());
    }
}

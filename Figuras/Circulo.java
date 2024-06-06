package Figuras;

public class Circulo extends Otros {
    public double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        super(0, "Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * radio * radio;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    @Override
    public void mostrar_Datos() {
        super.mostrar_Datos();
        System.out.println("Radio = " + radio);
    }
}

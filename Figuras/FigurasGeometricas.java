package Figuras;

//hola
public class FigurasGeometricas {
    public int nLados;
    public String nombre;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(int nLados, String nombre) {
        this.nLados = nLados;
        this.nombre = nombre;
    }

    public void mostrar_Datos() {
        System.out.println("Figura: " + nombre);
        System.out.println("Número de lados: " + nLados);
    }
}


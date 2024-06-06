package Figuras;

//hola
public class Figuras_Geometricas {
    public int nLados;
    public String nombre;

    public Figuras_Geometricas(int nLados, String nombre){
        this.nLados = nLados;
        this.nombre = nombre;
    }

    public void mostrar_datos(){
        System.out.println("N° Lados: "+nLados);
        System.out.println("Nombre: "+nombre);
    }
}

class DosD extends Figuras_Geometricas{
    public double area;
    public double perimetro;

    public DosD(int nLados,String nombre, double area, double perimetro){
        super(nLados, nombre);
        this.area = area;
        this.perimetro = perimetro;
    }

    /*public double calcular_area(double){
        return calcular_area();
    }
    public double calcular_perimetro(double){
        return calcular_perimetro();
    }*/
}
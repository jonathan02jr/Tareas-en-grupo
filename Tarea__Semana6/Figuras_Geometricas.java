package Tarea__Semana6;

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

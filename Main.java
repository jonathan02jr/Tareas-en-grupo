//Se crea la clase Padre
class Genealogia {
    public String parentesco;
    public String fecha_nac;
    public int telefono;
    //Se crea el método constructor
    public Genealogia (String parentesco, String fecha_nac, int telefono){
        this.parentesco=parentesco;
        this.fecha_nac=fecha_nac;
        this.telefono=telefono;
    }
    //Se crea un método para imprimir
    public void imprimir_datos(){
        System.out.println("Parentesco: "+parentesco);
        System.out.println("Fecha de nacimiento: "+fecha_nac);
        System.out.println("Teléfono: "+telefono);
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println("hola :)");
        System.out.println("mundo :)");
    }
}

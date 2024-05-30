public class Genealogia {
    public String parentesco;
    public String fecha_nac;
    public int telefono;

    public Genealogia (String parentesco, String fecha_nac, int telefono){
        this.parentesco=parentesco;
        this.fecha_nac=fecha_nac;
        this.telefono=telefono;
    }
    public void imprimir_datos(){
        System.out.println("Parentesco: "+parentesco);
        System.out.println("Fecha de nacimiento: "+fecha_nac);
        System.out.println("Teléfono: "+telefono);
    }
}

class Linaje_1 extends Genealogia{

    public int cedula;
    public String nombre;
    public String apellido;

    public Linaje_1 ( String parentesco, String fecha_nac,int cedula, int telefono,String nombre, String apellido ){
        super(parentesco,fecha_nac,telefono);
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;

    }
    public void informacion_completa(){
        System.out.println("La informacion completa es: ");
        System.out.println("La cedula es: "+cedula);
        System.out.println("El nombre es: "+nombre);
        System.out.println("El apellido es: "+apellido);
        super.imprimir_datos();
    }
}
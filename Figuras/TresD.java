package Figuras;

class TresD extends Figuras_Geometricas{
    public int nCaras;
    public double arista;

    public TresD(int nLados, String nombre, int nCaras, double arista){
        super(nLados, nombre);
        this.nCaras=nCaras;
        this.arista=arista;
    }

    public double calcular_volumen(Double, int){
        super.mostrar_datos();
        System.out.println("N° de caras: "+nCaras);
        System.out.println("Arista: "+arista);
    }
}

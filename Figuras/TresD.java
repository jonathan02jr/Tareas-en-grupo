package Figuras;

class TresD extends FigurasGeometricas{
    public int nCaras;
    public double arista;


    public TresD(int nLados, String nombre, int nCaras, double arista){
        super(nLados, nombre);
        this.nCaras=nCaras;
        this.arista=arista;
    }

    public double calcular_volumen(int nCaras, double arista){
        super.mostrar_Datos();
        System.out.println("N° de caras: "+nCaras);
        System.out.println("Logitud de arista: "+arista);

        double volumen = Math.pow(arista,3);
        System.out.println("El volumen del cubo es: "+volumen);
        return volumen;
    }
}

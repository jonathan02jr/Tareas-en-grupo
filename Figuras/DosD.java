package Figuras;

class DosD extends Figuras_Geometricas{
    public double area;
    public double perimetro;

    public DosD(int nLados,String nombre, double area, double perimetro){
        super(nLados, nombre);
        this.area = area;
        this.perimetro = perimetro;
    }
    public Double calcular_area(){
        return null;
    }
    public Double calcular_perimetro(){
        return null;
    }
    //
    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
    }
}

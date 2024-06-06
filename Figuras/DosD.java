package Figuras;

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

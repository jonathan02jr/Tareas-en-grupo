package Figuras;

public class Irregulares extends DosD {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;

    public Irregulares() {}

    public Irregulares(int nLados, String nombre, double ladoA, double ladoB, double ladoC, double ladoD) {
        super(nLados, nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public boolean esIrregular() {
        return ladoA != ladoB || ladoB != ladoC || ladoC != ladoD;
    }
}
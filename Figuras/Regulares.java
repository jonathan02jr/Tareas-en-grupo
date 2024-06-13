package Figuras;

public class Regulares extends DosD {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;

    public Regulares() {}

    public Regulares(int nLados, String nombre, double ladoA, double ladoB, double ladoC, double ladoD) {
        super(nLados, nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public boolean esRegular() {
        return ladoA == ladoB && ladoB == ladoC && ladoC == ladoD;
    }
}

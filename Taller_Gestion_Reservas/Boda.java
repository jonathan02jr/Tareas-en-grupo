package Taller_Gestion_Reservas;

class Boda extends Evento{
    double valorDecoracionFloral;
    double valorMusicaEnVivo;
    double sumaBoda;


    public Boda(int idCliente, String nomCliente,
                     String emailCliente, String fechaCliente, String tipoEvento, double costoEvento,
                     double valorDecoracionFloral, double valorMusicaEnVivo){
        super(idCliente, nomCliente, emailCliente, fechaCliente, tipoEvento, costoEvento);
        this.valorDecoracionFloral = valorDecoracionFloral;
        this.valorMusicaEnVivo = valorMusicaEnVivo;
    }

    public double getValorDecoracionFloral() {
        return valorDecoracionFloral;
    }

    public double getValorMusicaEnVivo() {
        return valorMusicaEnVivo;
    }

    public void mostrarDatos(){
        System.out.println("El valor del evento es: "+getCostoEvento());
        super.mostrarDatos();
    }

    public double calcularCosto( double opcion )
    {

        if (opcion==1) {
            sumaBoda = getCostoEvento() + getValorDecoracionFloral();
            super.mostrarDatos();
            System.out.println("Valor total: " + sumaBoda);

        } else if (opcion==2) {
            sumaBoda = getCostoEvento() + getValorMusicaEnVivo();
            super.mostrarDatos();
            System.out.println("Valor total: " + sumaBoda);

        } else if (opcion==3) {
            sumaBoda = getCostoEvento() + 800;
            super.mostrarDatos();
            System.out.println("Valor total: " + sumaBoda);
        }
        return sumaBoda;
    }
}

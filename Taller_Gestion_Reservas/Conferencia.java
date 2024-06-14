package Taller_Gestion_Reservas;

class Conferencia extends Evento{
    double valorServicioCatering;
    double valorEquipoAudiovisual;
    double sumaConferencia;


    public Conferencia(int idCliente, String nomCliente,
                String emailCliente, String fechaCliente, String tipoEvento, double costoEvento,
                double valorServicioCatering, double valorEquipoAudiovisual){
        super(idCliente, nomCliente, emailCliente, fechaCliente, tipoEvento, costoEvento);
        this.valorServicioCatering = valorServicioCatering;
        this.valorEquipoAudiovisual = valorEquipoAudiovisual;
    }

    public double getValorServicioCatering() {
        return valorServicioCatering;
    }

    public double getValorEquipoAudiovisual() {
        return valorEquipoAudiovisual;
    }

    public void mostrarDatos(){
        System.out.println("El valor del evento es: "+getCostoEvento());
        super.mostrarDatos();
    }

    public double calcularCosto( double opcion )
    {

        if (opcion==1) {
            sumaConferencia = getCostoEvento() + getValorServicioCatering();
            super.mostrarDatos();
            System.out.println("Valor total: " + sumaConferencia);

        } else if (opcion==2) {
            sumaConferencia = getCostoEvento() + getValorEquipoAudiovisual();
            super.mostrarDatos();
            System.out.println("Valor total: " + sumaConferencia);

        } else if (opcion==3) {
            sumaConferencia = getCostoEvento() + 300;
            super.mostrarDatos();
            System.out.println("Valor total: " + sumaConferencia);
        }
        return sumaConferencia;
    }
}

package Taller_Gestion_Reservas;
class Evento extends Reserva{
    private String tipoEvento;
    private double costoEvento;

    public Evento(){}

    public Evento(String tipoEvento,double costoEvento){
        this.tipoEvento=tipoEvento;
        this.costoEvento=costoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public double getCostoEvento() {
        return costoEvento;
    }

    public void setCostoEvento(double costoEvento) {
        this.costoEvento = costoEvento;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Tipo de Evento: "+tipoEvento);
    }
    public void servicios( ) {
        System.out.println("El valor total de los servicios es: "+costoEvento);
    }
}

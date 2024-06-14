package Taller_Gestion_Reservas;
class Evento extends Reserva{
    private String tipoEvento;
    private double costoEvento;

    public Evento(){}

    public Evento(int idCliente, String nomCliente, String emailCliente, String fechaCliente,String tipoEvento,double costoEvento){
        super(idCliente, nomCliente, emailCliente, fechaCliente);
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

}

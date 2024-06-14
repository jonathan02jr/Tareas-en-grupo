package Taller_Gestion_Reservas;

class Concierto extends Evento{
    private double valorSeguridad;
    private double valorComida;


    public Concierto(int idCliente, String nomCliente,
                     String emailCliente, String fechaCliente, String tipoEvento, double costoEvento,
                     double valorSeguridad, double valorComida){
        super(idCliente, nomCliente, emailCliente, fechaCliente, tipoEvento, costoEvento);
        this.valorSeguridad=valorSeguridad;
        this.valorComida=valorComida;
    }

    public double getValorComida() {
        return valorComida;
    }

    public double getValorSeguridad() {
        return valorSeguridad;
    }

    public void mostrarDatos(){
    }
    public void calcularCosto(){
        System.out.println("El costo total es de: ");
    }
}

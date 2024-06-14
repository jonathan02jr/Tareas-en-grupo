package Taller_Gestion_Reservas;

class Boda extends Evento {


    public Boda (int idCliente, String nomCliente, String emailCliente,
                 String fechaCliente,String tipoEvento,double costoEvento) {
        super(idCliente, nomCliente, emailCliente, fechaCliente, tipoEvento, costoEvento);

    }
    /*@Override
    public double calcularCosto(double servicios, double evento) {
        return super.calcularCosto(servicios, evento);
    }*/

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}

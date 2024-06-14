package Taller_Gestion_Reservas;

class Concierto extends Evento{
    private double valorSeguridad;
    private double valorComida;
    public double suma1;


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
        System.out.println("El valor del evento es: "+getCostoEvento());
        super.mostrarDatos();
    }

    public double calcularCosto( double opcion )
    {

        if (opcion==1) {
            suma1 = getCostoEvento() + getValorSeguridad();
            super.mostrarDatos();
            System.out.println("Valor total: " + suma1);

        } else if (opcion==2) {
            suma1 = getCostoEvento() + getValorComida();
            super.mostrarDatos();
            System.out.println("Valor total: " + suma1);

        } else if (opcion==3) {
            suma1 = getCostoEvento() + 550;
            super.mostrarDatos();
            System.out.println("Valor total: " + suma1);
        }
        return suma1;
    }

}

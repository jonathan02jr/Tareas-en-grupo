package Taller_Gestion_Reservas;

public class Reserva {
    private int idCliente;
    private String nomCliente;
    private String emailCliente;
    private String fechaCliente;

    public Reserva(){}

    public Reserva (int idCliente, String nomCliente, String emailCliente, String fechaCliente){
        this.idCliente=idCliente;
        this.nomCliente=nomCliente;
        this.emailCliente=emailCliente;
        this.fechaCliente=fechaCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getFechaCliente() {
        return fechaCliente;
    }

    public void setFechaCliente(String fechaCliente) {
        this.fechaCliente = fechaCliente;
    }
    public void mostrarDatos(){
        System.out.println("Datos de la reserva: ");
        System.out.println("Número de cédula "+idCliente);
        System.out.println("Nombre: "+nomCliente);
        System.out.println("Email: "+emailCliente);
        System.out.println("Fecha de la reserva: "+fechaCliente);
    }
    public double calcularCosto(double servicios, double evento){
        double total;
        total = servicios+evento;
        System.out.println("Total: "+total);
        return total;
    }
}

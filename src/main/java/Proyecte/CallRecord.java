package Proyecte;

public class CallRecord {
    Client clienteOrigen;
    Client clienteDestino;
    String fecha;
    String horarioInicio;
    String duracion;
    Integer costo;

    public CallRecord(Client clienteOrigen, Client clienteDestino, String fecha, String horarioInicio, String duracion){
        this.clienteOrigen = clienteOrigen;
        this.clienteDestino = clienteDestino;
        this.fecha = fecha;
        this.horarioInicio = horarioInicio;
        this.duracion = duracion;
        costo = calculateCosto();
    }

    private Integer calculateCosto(){
        return 0;
    }
}
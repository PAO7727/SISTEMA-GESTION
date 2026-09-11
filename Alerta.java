package objetos;

public class Alerta {

    private int idAlerta;
    private int idEquipo;
    private String tipoAlerta;
    private String fechaGeneracion;
    private String mensaje;
    private String fechaAtencion;
    private String prioridad;
    private String estado;

    public Alerta(int idAlerta, int idEquipo,
                  String tipoAlerta, String fechaGeneracion,
                  String mensaje, String fechaAtencion,
                  String prioridad, String estado) {

        this.idAlerta = idAlerta;
        this.idEquipo = idEquipo;
        this.tipoAlerta = tipoAlerta;
        this.fechaGeneracion = fechaGeneracion;
        this.mensaje = mensaje;
        this.fechaAtencion = fechaAtencion;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Alerta del equipo: " + idEquipo);
        System.out.println("Tipo: " + tipoAlerta);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Estado: " + estado);
    }
}

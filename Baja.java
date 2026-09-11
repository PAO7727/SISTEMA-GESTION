package objetos;

public class Baja {

    private int idBaja;
    private int idEquipo;
    private String fechaBaja;
    private String motivo;
    private String observaciones;
    private String responsable;
    private String estado;

    public Baja(int idBaja, int idEquipo, String fechaBaja,
                String motivo, String observaciones,
                String responsable, String estado) {

        this.idBaja = idBaja;
        this.idEquipo = idEquipo;
        this.fechaBaja = fechaBaja;
        this.motivo = motivo;
        this.observaciones = observaciones;
        this.responsable = responsable;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Equipo dado de baja: " + idEquipo);
        System.out.println("Fecha: " + fechaBaja);
        System.out.println("Motivo: " + motivo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Estado: " + estado);
    }
}

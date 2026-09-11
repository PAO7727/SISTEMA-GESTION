package objetos;

public class Garantia {

    private int idGarantia;
    private int idEquipo;
    private String proveedor;
    private String fechaInicio;
    private String fechaFin;
    private String duracion;
    private String condiciones;
    private String estado;

    public Garantia(int idGarantia, int idEquipo,
                    String proveedor, String fechaInicio,
                    String fechaFin, String duracion,
                    String condiciones, String estado) {

        this.idGarantia = idGarantia;
        this.idEquipo = idEquipo;
        this.proveedor = proveedor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracion = duracion;
        this.condiciones = condiciones;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Garantía del equipo: " + idEquipo);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Inicio: " + fechaInicio);
        System.out.println("Fin: " + fechaFin);
        System.out.println("Estado: " + estado);
    }
}

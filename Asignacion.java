package objetos;

public class Asignacion {

    private int idAsignacion;
    private int idEquipo;
    private int idEmpleado;
    private int idArea;
    private String fechaAsignacion;
    private String fechaDevolucion;
    private String observaciones;
    private String estado;

    public Asignacion(int idAsignacion, int idEquipo,
                      int idEmpleado, int idArea,
                      String fechaAsignacion,
                      String fechaDevolucion,
                      String observaciones,
                      String estado) {

        this.idAsignacion = idAsignacion;
        this.idEquipo = idEquipo;
        this.idEmpleado = idEmpleado;
        this.idArea = idArea;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaDevolucion = fechaDevolucion;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Equipo asignado: " + idEquipo);
        System.out.println("Empleado: " + idEmpleado);
        System.out.println("Área: " + idArea);
        System.out.println("Fecha de asignación: " + fechaAsignacion);
        System.out.println("Estado: " + estado);
    }
}

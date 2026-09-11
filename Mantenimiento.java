package objetos;

public class Mantenimiento {

    private int idMantenimiento;
    private int idEquipo;
    private String tipoMantenimiento;
    private String fechaMantenimiento;
    private String fechaProximoMantenimiento;
    private String descripcion;
    private String tecnicoResponsable;
    private double costo;
    private String estado;

    public Mantenimiento(int idMantenimiento, int idEquipo,
                         String tipoMantenimiento,
                         String fechaMantenimiento,
                         String fechaProximoMantenimiento,
                         String descripcion,
                         String tecnicoResponsable,
                         double costo,
                         String estado) {

        this.idMantenimiento = idMantenimiento;
        this.idEquipo = idEquipo;
        this.tipoMantenimiento = tipoMantenimiento;
        this.fechaMantenimiento = fechaMantenimiento;
        this.fechaProximoMantenimiento = fechaProximoMantenimiento;
        this.descripcion = descripcion;
        this.tecnicoResponsable = tecnicoResponsable;
        this.costo = costo;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Mantenimiento del equipo: " + idEquipo);
        System.out.println("Tipo: " + tipoMantenimiento);
        System.out.println("Fecha: " + fechaMantenimiento);
        System.out.println("Próximo mantenimiento: "
                           + fechaProximoMantenimiento);
        System.out.println("Técnico: " + tecnicoResponsable);
        System.out.println("Costo: Q" + costo);
    }
}

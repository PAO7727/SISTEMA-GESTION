package objetos;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String dpi;
    private String telefono;
    private String correo;
    private String cargo;
    private String estado;

    public Empleado(int idEmpleado, String nombre, String apellido,
                    String dpi, String telefono, String correo,
                    String cargo, String estado) {

        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.telefono = telefono;
        this.correo = correo;
        this.cargo = cargo;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("Cargo: " + cargo);
        System.out.println("Correo: " + correo);
        System.out.println("Estado: " + estado);
    }
}

package objetos;

public class Proveedor {

    private int idProveedor;
    private String nombre;
    private String nit;
    private String telefono;
    private String correo;
    private String direccion;
    private String estado;

    public Proveedor(int idProveedor, String nombre, String nit,
                     String telefono, String correo,
                     String direccion, String estado) {

        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Proveedor: " + nombre);
        System.out.println("NIT: " + nit);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Estado: " + estado);
    }
}

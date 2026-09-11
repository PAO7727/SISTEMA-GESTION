package objetos;

public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String correo;
    private String contraseña;
    private String rol;
    private String fechaRegistro;
    private String ultimoAcceso;
    private String estado;

    public Usuario(int idUsuario, String nombreUsuario,
                   String correo, String contraseña,
                   String rol, String fechaRegistro,
                   String ultimoAcceso, String estado) {

        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
        this.ultimoAcceso = ultimoAcceso;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Correo: " + correo);
        System.out.println("Rol: " + rol);
        System.out.println("Estado: " + estado);
    }
}

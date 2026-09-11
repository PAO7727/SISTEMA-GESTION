package objetos;

public class Equipo {

    private int idEquipo;
    private String nombre;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private String fechaCompra;
    private String estado;
    private double precio;

    public Equipo(int idEquipo, String nombre, String tipo,
                  String marca, String modelo, String numeroSerie,
                  String fechaCompra, String estado, double precio) {

        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.fechaCompra = fechaCompra;
        this.estado = estado;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println("Estado: " + estado);
    }
}

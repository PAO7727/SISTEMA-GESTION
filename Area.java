package objetos ;

public class Area {
  private int idArea;
  private String nombre;
  private String descripcion;
  private String ubicacion;
  private String responsable;
  private String estado;

  public Area(int idArea, String nombre, String descripcion, String ubicacion, String responsable, String estado){

    this.idArea = idArea;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.ubicacion = ubicacion; 
    this.responsable =responsable;
    this.estado = estado;
  }
  public void mostrarInformacionn (){
    System.out.println("Area: " + nombre);
    System.out.println("Ubicacion: " + ubicacion);
    System.out.println("Responsable: " + responsable;
    System.out.printl("Estado: " + estado);
  }
  
}

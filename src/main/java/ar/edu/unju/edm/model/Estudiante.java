package ar.edu.unju.edm.model;

public class Estudiante {
  private String dni;
  private String Nombre;
  private String apellido;
  private float peso;
  private char genero;

  //constructor por defecto
  /*comentario */
  /**Documetacion Describir **/
  public Estudiante() {

  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    this.Nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }
}

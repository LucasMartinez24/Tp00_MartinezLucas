package ar.edu.unju.edm.model;

public class Calculadora {
  private int numero1;
  private int numero2;

  public int getNumero1() {
    return numero1;
  }
  public int getNumero2() {
    return numero2;
  }
  public void setNumero2(int numero2) {
    this.numero2 = numero2;
  }
  public void setNumero1(int numero1) {
    this.numero1 = numero1;
  }
  public int SumaNumeros(){
    int resultado=numero1+numero2;
    return resultado;
  }
  public int restaNumeros(){
    int resultado=numero1-numero2;
    return resultado;
  }
  public int MultiplicarNumeros(){
    int resultado=numero1*numero2;
    return resultado;
  }
  public int DivisionNumeros(){
    int resultado;
    if(numero2==0){
      System.out.println("NO SE PUEDE DIVIDIR");
      resultado=0;
    }else{
      resultado=numero1/numero2;
    }
    return resultado;
  }
}

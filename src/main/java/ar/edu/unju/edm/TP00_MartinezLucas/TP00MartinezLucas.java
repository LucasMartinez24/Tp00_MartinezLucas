package ar.edu.unju.edm.TP00_MartinezLucas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class TP00MartinezLucas {

	public static void main(String[] args) {
		SpringApplication.run(TP00MartinezLucas.class, args);
		String nombre= "Aldanuki";
		System.out.println("Hola edm, dice "+ nombre + " " + darNombre());
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("44769386");
		unEstudiante.setNombre("Lucas");

		System.out.println("El estudiante "+ unEstudiante.getNombre()+" dice HOLA!!");

		Calculadora UnaCalculadora = new Calculadora();//metodo constructor
		UnaCalculadora.setNumero1(3);
		UnaCalculadora.setNumero2(0);
		System.out.println("El resultado de la suma es: "+ UnaCalculadora.SumaNumeros());
		System.out.println("El resultado de la resta es: "+ UnaCalculadora.restaNumeros());
		System.out.println("El resultado de la multiplicacion es: "+ UnaCalculadora.MultiplicarNumeros());
		System.out.println("El resultado de la division es: "+ UnaCalculadora.DivisionNumeros());
	}

	public static String darNombre(){
		String nuevoNombre = "y Lu";
		return nuevoNombre;
	}

}

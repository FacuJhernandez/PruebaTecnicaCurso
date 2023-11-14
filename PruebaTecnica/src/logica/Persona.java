package logica;
import java.util.ArrayList;

public class Persona {

	private String nombre;
	private int edad;
	private ArrayList<Libro> libroPrestados;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.libroPrestados= new ArrayList<Libro>();
	}

	public void tomarPrestadoLibro(Libro l) {
		this.libroPrestados.add(l);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Libro> getLibroPrestados() {
		return libroPrestados;
	}

	public void setLibroPrestados(ArrayList<Libro> libroPrestados) {
		this.libroPrestados = libroPrestados;
	}

}

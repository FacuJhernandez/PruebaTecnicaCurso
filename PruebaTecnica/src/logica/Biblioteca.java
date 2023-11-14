package logica;
import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> listaDeLibrosDisponibles;
	private ArrayList<Libro> listaDeLibrosPrestados;

	public Biblioteca() {
		this.listaDeLibrosDisponibles = new ArrayList<Libro>();
		this.listaDeLibrosPrestados = new ArrayList<Libro>();
	}

	public void agregarLibro(Libro l) {
		if(this.listaDeLibrosDisponibles.contains(l)) {
			System.out.println("libro ya esta ingresado");
		}
		else if (l.getEstadoLibro().equals(estadoLibroEnum.PRESTADO)) {
					System.out.println("No se puede añadir a la biblioteca un libro prestado");
			} else  {
					this.listaDeLibrosDisponibles.add(l);
				}

	}

	public void prestarLibro(Libro l) {
		if (!this.listaDeLibrosDisponibles.contains(l)) {
			System.out.println("El libro no esta disponible en la biblioteca");
		} else {
		
			for (Libro libro: this.listaDeLibrosDisponibles) {
				if(libro.equals(l)) {
					libro.prestarLibro();
				}
				
			}
			this.listaDeLibrosDisponibles.remove(l);
			this.listaDeLibrosPrestados.add(l);
		}

	}

	public void devolverLibro(Libro l) {
		if (!this.listaDeLibrosPrestados.contains(l)) {
			System.out.println("El libro no ha sido prestado");
		} else {
			
			this.listaDeLibrosPrestados.remove(l);
			this.listaDeLibrosDisponibles.add(l);
		}

	}

	public void MostrarLibroDisponible() {
		System.out.println("Libro disponibles");
		for (Libro libro : this.listaDeLibrosDisponibles) {
			libro.ObtenerInformacion();
		}
		System.out.println("fin de libros disponibles");
	}

	public void MostrarLibroPrestados() {
		System.out.println("Libro Prestados");
		for (Libro libro : this.listaDeLibrosPrestados) {
			libro.ObtenerInformacion();
		}
		System.out.println("fin de libros prestados");
	}

}

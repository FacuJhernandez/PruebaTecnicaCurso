package logica;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// Creamos los objetos
		Persona persona1 = new Persona("Nicolas", 23);
		Persona persona2 = new Persona("Fausto", 21);

		Libro libro1 = new Libro("El mago de Oz", "Daniel", "21/12/2002", "fantastico", 200);
		Libro libro2 = new Libro("Alicia en el pais de las maravillas", "Facundo", "20/12/2002", "terror", 230);
		Libro libro3 = new Libro("El extraño mundo de Gonbal", "Candela", "26/12/2002", "fantasia", 260);

		Biblioteca biblio = new Biblioteca();

		// Añadimos los libros a la biblioteca
		biblio.agregarLibro(libro1);
		biblio.agregarLibro(libro2);
		biblio.agregarLibro(libro3);

		biblio.MostrarLibroDisponible();

		persona1.tomarPrestadoLibro(libro1);
		biblio.prestarLibro(libro1);
		
		biblio.MostrarLibroPrestados();
		System.out.println("-------------------------------------");
		System.out.println("Libro que tiene prestada personas");
		persona1.getLibroPrestados().get(0).ObtenerInformacion();
		
		

		
	

	}

}

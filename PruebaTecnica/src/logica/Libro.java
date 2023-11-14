package logica;


public class Libro {

	private String titulo;
	private String autor;
	private String AnioDePublicacion;
	private String genero;
	private int numeroDePaginas;
	private estadoLibroEnum estadoLibro;

	public Libro(String titulo, String autor, String AnioDePublicacion, String genero, int numeroDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.AnioDePublicacion = AnioDePublicacion;
		this.genero = genero;
		this.numeroDePaginas = numeroDePaginas;
		this.estadoLibro = estadoLibroEnum.NO_PRESTADO;
	}

	public void ObtenerInformacion() {
		System.out.println("Titulo del libro: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Titulo del libro " + getAñoDePublicacion().toString());
		System.out.println("Genero: " + getGenero());
		System.out.println("Numero de paginas: " + getNumeroDePaginas());
		System.out.println("Estado Libro: " + getEstadoLibro());
	}

	public void prestarLibro() {
		this.estadoLibro = estadoLibroEnum.PRESTADO;
	}

	public void devolverLibro() {
		this.estadoLibro = estadoLibroEnum.NO_PRESTADO;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAñoDePublicacion() {
		return this.AnioDePublicacion;
	}

	public void setAñoDePublicacion(String añoDePublicacion) {
		this.AnioDePublicacion = añoDePublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public estadoLibroEnum getEstadoLibro() {
		return estadoLibro;
	}

	public void setEstadoLibro(estadoLibroEnum estadoLibro) {
		this.estadoLibro = estadoLibro;
	}

}

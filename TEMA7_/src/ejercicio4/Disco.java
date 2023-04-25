package ejercicio4;

/**
 * Guarda datos de discos
 * @author Rexil
 *
 */
public class Disco {
	/**
	 * Codigo por defecto
	 */
	private String codigo = "LIBRE";
	/**
	 * Almacena el autor
	 */
	private String autor = "";
	/**
	 * Almacena el título
	 */
	private String titulo = "";
	/**
	 * Almacena el género
	 */
	private String generostr = "";
	/**
	 * Almacena la duracion
	 */
	private int duracion = 0;
	/**
	 * Almacena el género
	 */
	enum Genero {
		Rock, Pop, Electrónica, Reggaeton
	};

	Genero genero;
	public Disco() {

	}
/**
 * Constructor por parámetros
 * @param codigo
 * @param autor
 * @param titulo
 * @param genero
 * @param duracion
 */
	public Disco(String codigo, String autor, String titulo, String generoStr, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = Genero.valueOf(generoStr);
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}
	/**
	 * Constructor copia
	 * 
	 * @param d
	 */
	public Disco(Disco d) {
		this.codigo = d.codigo;
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;
		this.duracion = d.duracion;
	}
/**
 * Consigue el código 
 * @return
 */
	public String getCodigo() {
		return codigo;
	}
/**
 * Da valor al código
 * @param codigo
 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
/**
 * Consigue el autor
 * @return autor
 */
	public String getAutor() {
		return autor;
	}
/**
 * Da valor al autor
 * @param autor
 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
/**
 * Consigue el título
 * @return titulo
 */
	public String getTitulo() {
		return titulo;
	}
/**
 * Da valor al título
 * @param titulo
 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
/**
 * Consigue el género
 * @return genero
 */
	public Genero getGenero() {
		return genero;
	}
/**
 * Da valor al genero
 * @param genero
 */
	public void setGenero(String generoStr) {
		this.genero = Genero.valueOf(generoStr);
	}
/**
 * Consigue la duracion
 * @return duracion
 */
	public int getDuracion() {
		return duracion;
	}
/**
 * Da valor a la duracion
 * @param duracion
 */
	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		} 
	}
	
/**
 * Pasa a string el resultado
 */
	public String toString() {
		
		
		String result = "";
		result += "CÓDIGO: " + this.codigo + "\n";
		
		result += "AUTOR: " + this.autor + "\n";
		
		result += "TÍTULO: " + this.titulo + "\n";
		
		result += "GÉNERO: " + this.genero + "\n";
		
		result += "DURACIÓN: " + this.duracion + "\n";
		return result;
	}

}
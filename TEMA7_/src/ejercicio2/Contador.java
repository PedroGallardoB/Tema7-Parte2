package ejercicio2;

public class Contador {
	/**
	 * Variable que guarda el valor del contador
	 */
	private int cont;

	/**
	 * Constructor por defecto
	 */
	public Contador() {
		this.cont = 0;
	}

	/**
	 * Constructor por parámetros
	 * 
	 * @param valorInicial
	 */
	public Contador(int valorInicial) {
		if (valorInicial < 0) {
			this.cont = 0;
		} else {
			this.cont = valorInicial;
		}
	}

	/**
	 * Constructor copia
	 * 
	 * @param otroContador
	 */
	public Contador(Contador Contador2) {
		this.cont = Contador2.cont;
	}

	/**
	 * Consigue el valor del contador
	 * 
	 * @return contador
	 */
	public int getCont() {
		return this.cont;
	}

	/**
	 * Da valor al contador
	 */
	public void setCont(int nuevoValor) {
		if (nuevoValor < 0) {
			this.cont = 0;
		} else {
			this.cont = nuevoValor;
		}
	}
/**
 * Incrementa el contador
 */
	public void incrementar() {
		this.cont++;
	}
	/**
	 * Decrementa el contador
	 */
	public void decrementar() {
		this.cont--;
		if (this.cont < 0) {
			this.cont = 0;
		}
	}
}
package ejercicio1;
/**
 * Controla las horas
 * @author Rexil
 *
 */
public class Hora {
	/**
	 * Indica la hora
	 */
	private int hora;
	/**
	 * Indica el minuto
	 */
	private int minuto;
	/**
	 * Indica los segundos
	 */
	private int segundo;

	/**
	 * Constructor por defecto
	 */
	public Hora() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}
/**
 * Constructor por parámetros
 * @param hora
 * @param minuto
 * @param segundo
 */
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
/**
 * Getter de hora (devuelve hora)
 * @return hora
 */
	public int getHora() {
		return this.hora;
	}
/**
 * Setter de hora (introduce hora)
 * @param hora
 */
	public void setHora(int hora) {
		this.hora = hora;
	}
	/**
	 * Getter de minuto (devuelve minuto)
	 * @return minuto
	 */
	public int getMinuto() {
		return this.minuto;
	}
	/**
	 * Setter de minuto (devuelve minuto)
	 * @return hora
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
/**
 * Devuelve los segundos al main 
 * @return segundo
 */
	public int getSegundo() {
		return this.segundo;
	}
/**
 * Da valor a los segundos
 * @param segundo
 */
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
/**
 * Incrementa un segundo a la hora
 */
	public void incrementaSegundo() {
		this.segundo++;
		if (this.segundo == 60) {
			this.segundo = 0;
			this.minuto++;
			if (this.minuto == 60) {
				this.minuto = 0;
				this.hora++;
				if (this.hora == 24) {
					this.hora = 0;
				}
			}
		}
	}

}

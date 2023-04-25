package ejercicio3;
/**
 * Valida fechas
 * @author Rexil
 *
 */
public class Fecha {
	/**
	 * Indica el dia
	 */
	private int dia;
	/**
	 * Indica el mes
	 */
	private int mes;
	/**
	 * Indica el año
	 */
	private int año;
/**
 * Valida fechas
 */
	public Fecha() {

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * Consigue el día para el main
	 * 
	 * @return día
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Da valor a día
	 * 
	 * @param dia
	 */
	public void setDia(int dia) {
		if (dia>=1&&dia<=31) {
			this.dia = dia;
		}
	}

	/**
	 * Consigue el año
	 * 
	 * @return año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Da valor al año
	 * 
	 * @param año
	 */
	public void setAño(int año) {
		if (fechaCorrecta()) {
			this.año = año;
		}
	}

	/**
	 * Consigue el mes
	 * 
	 * @return mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Da valor al mes
	 * 
	 * @param mes
	 */
	public void setMes(int mes) {
		if (mes>=1&&mes<=12) {
			this.mes = mes;
		}
	}

	/**
	 * Comprueba si el año es bisiesto
	 * 
	 * @return año
	 */
	public boolean Bisiesto() {
		boolean bisiesto = false;
		if (año % 4 == 0 || (año % 100 == 0 && año % 400 == 0)) {
			bisiesto = true;
		}

		return bisiesto;
	}

	/**
	 * Comprueba que la fecha sea correcta
	 * 
	 * @return correcta
	 */
	public boolean fechaCorrecta() {
		boolean correcta = false;

		if (dia > 0 && dia <= 31) {
			if (mes == 2 && dia <= 28) {// Excepción para febrero
				correcta = true;
			} else if (mes == 2 && dia <= 29 && Bisiesto()) {// Caso bisiesto
				correcta = true;
			} else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8|| mes == 10 || mes == 12) && dia <= 31) {
				correcta = true;
			} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 31)) {

			}
		}

		if (mes < 0 || mes > 12) {
			correcta = false;
		}

		if (año < 0 || año > 2023) {
			correcta = false;
		}

		return correcta;
	}

}
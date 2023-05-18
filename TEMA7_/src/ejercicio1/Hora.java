package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Controla las horas
 * 
 * @author Rexil
 *
 */
public class Hora {
	public static double readDouble(Scanner sc) {
		double doub = 0;
		try {
			doub = sc.nextDouble();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor introducido no es de tipo double");
			System.out.println(e.getMessage());
		}
		return doub;
	}

	public static int readInt(Scanner sc) {
		int entero = 0;
		try {
			entero = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor introducido no es de tipo int");
			System.out.println(e.getMessage());
		}
		return entero;
	}

}

package ejercicio4;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Disco[] arrayDiscos = new Disco[10];
		int posicion = 0;
		int opcion;
		boolean salir = false;

		for (int i = 0; i < arrayDiscos.length; i++) {
			arrayDiscos[i] = new Disco();
		}
		while (!salir) {

			menu();
			System.out.println("INTRODUZCA OPCIÓN:");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				listado(arrayDiscos);
				break;
			case 2:
				posicion = posicionLibre(arrayDiscos);
				if (posicion < 0) {
					System.out.println("No hay hueco");
				} else {
					nuevoDisco(arrayDiscos, posicion);
				}
				break;
			case 3:
				modificar(arrayDiscos);
				break;
			case 4:
				borrar(arrayDiscos);
				break;
			case 5:
				System.out.println("Programa terminado");
				salir=true;
				break;
			default:
				System.out.println("Opción no válida");
			}
			
		} 
		sc.close();
	}
/**
 * Menu del programa
 */
	private static void menu() {
		System.out.println("COLECCIÓN DE DISCOS");
		System.out.println("===================");

		System.out.println("1. Listado");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	private static void listado(Disco[] array) {
		for (Disco disco : array) {
			if (!disco.getCodigo().equals("LIBRE")) {
				System.out.println(disco);
			}
		}
	}
/**
 * Añade un disco
 * @param array
 * @param contador
 */
	private static void nuevoDisco(Disco[] array, int contador) {
		String codigo;
		String autor, titulo, genero;
		int duracion;

		codigo = String.valueOf(contador);
		System.out.println("AUTOR DISCO:");
		autor = sc.nextLine();
		System.out.println("TÍTULO DISCO:");
		titulo = sc.nextLine();
		System.out.println("GÉNERO DISCO:");
		System.out.println("OPCIONES: Rock, Pop, Electrónica, Reggaeton");
		genero = sc.nextLine();
		System.out.println("DURACIÓN DISCO:");
		duracion = sc.nextInt();
		array[contador] = new Disco(codigo, autor, titulo, genero, duracion);

	}

	private static int posicionLibre(Disco[] array) {
		int posicion = 0;

		while (posicion < array.length && !array[posicion].getCodigo().equals("LIBRE")) {
			posicion++;
		}

		if (posicion == array.length) {
			posicion = -1;
		}

		return posicion;
	}
/**
 * Modifica un disco
 * @param array
 */
	private static void modificar(Disco[] array) {
		String autor, titulo, genero;
		int codigo, duracion;

		System.out.println("CÓDIGO DEL DISCO A MODIFICAR:");
		codigo = sc.nextInt();
		sc.nextLine();

		if (!array[codigo].getCodigo().equals("LIBRE")) {
			System.out.println("INTRODUZCA AUTOR:");
			autor = sc.nextLine();
			array[codigo].setAutor(autor);

			System.out.println("INTRODUZCA TÍTULO:");
			titulo = sc.nextLine();
			array[codigo].setTitulo(titulo);

			System.out.println("INTRODUZCA GÉNERO:");
			System.out.println("OPCIONES: Rock, Pop, Electrónica, Reggaeton");
			genero = sc.nextLine();
			array[codigo].setGenero(genero);

			System.out.println("INTRODUZCA DURACION:");
			duracion = sc.nextInt();
			array[codigo].setDuracion(duracion);
		} else {
			System.out.println("NO HAY DISCO EN LA POSICIÓN");
		}
	}
/**
 * Borra un disco
 * @param array
 */
	public static void borrar(Disco[] array) {
		System.out.println("CÓDIGO DEL DISCO A BORRAR:");
		int posicion = sc.nextInt();
		sc.nextLine();

		if (posicion >= 0 && posicion < array.length) {
			array[posicion].setCodigo("LIBRE");
		} else {
			System.out.println("ERROR CON EL CÓDIGO");
		}
	}
}
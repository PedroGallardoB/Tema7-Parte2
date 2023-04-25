package ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Fecha fecha = new Fecha(13, 7, 2003);//Creamos objeto fecha
		int año;//Variable que guardará el año
		int mes;//Variable que guardará el mes
		int dia;//Variable que guardará el dia

		Scanner sc = new Scanner(System.in);
		fecha.setAño(1405);//Da valor al año
		año = fecha.getAño();//Guarda el valor del año
		fecha.setMes(3);//Da valor al mes
		mes = fecha.getMes();//Guarda el valor del mes
		fecha.setDia(1);//Da valor al día
		dia = fecha.getDia();//Consigue el valor del dia
		//Imprime fecha
		System.out.println("DÍA: " + dia);
		System.out.println("MES: " + mes);
		System.out.println("AÑO: " + año);
	//Comprueba que la fechan esté bien
if(fecha.fechaCorrecta()) {
	System.out.println("La fecha es correcta");
}else {
	System.out.println("La fecha es incorrecta");
}
		sc.close();
	}

}

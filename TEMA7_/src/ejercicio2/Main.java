package ejercicio2;

public class Main {
    public static void main(String[] args) {
    	
        Contador cont1 = new Contador(); //Creamos objeto por defecto
        Contador cont2 = new Contador(5); //Creamos objeto por parámetros
        Contador cont3 = new Contador(cont2); //Constructor copia del contador dos
        
        cont1.incrementar();//Incrementamos
        cont2.decrementar();//Decrementamos
        cont3.setCont(10);//Damos valor 10 al contador
        
        //IMPRIMIMOS LOS CONTADORES
        System.out.println("Cont1: " + cont1.getCont());
        System.out.println("Cont2: " + cont2.getCont()); 
        System.out.println("Cont3: " + cont3.getCont()); 
    }
}
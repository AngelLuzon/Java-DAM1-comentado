import java.util.Scanner;

public class E6X01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
//		Leer nº chicos y nº chicas y calcular % con 2 decimales
		 
		double  numChicos, numChicas, porcentajeChicos, porcentajeChicas;
		
//		visualizamos los numeros que metemos en teclado
		System.out.println("¿Número de Chicos? ");
		numChicos = teclado.nextInt();
		System.out.println("¿Número de Chicas? ");
		numChicas = teclado.nextInt();
		
		//ponemos que saque el porcentaje
		porcentajeChicos = (numChicos / (numChicos + numChicas)) * 100;
		
		porcentajeChicas = (numChicas / (numChicas + numChicos)) * 100;
//		hacemos print con dos  decimales y para poner porcentaje ponemos despues de f%%
		System.out.printf("Porcentaje de Chicos: %.2f%%\n", porcentajeChicos);
		
		System.out.printf("Porcentaje de Chicas: %.2f%%\n", porcentajeChicas);
		
//		cerramos teclado 
		teclado.close();
		
		
//		tiene que ser double
//		acordarse de crear porcentajeChicos y porcentajeChicas
//		acordarse de poner %% para que se convierta en porcentaje
		
		
		
		
		
	}

}

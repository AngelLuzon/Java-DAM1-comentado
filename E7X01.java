import java.util.Scanner;

public class E7X01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
//		LEER ALTURA Y RADIO Y SACAR EL VOLUMEN
		double altura, radio, volumen;
//		visualizamos los numeros que metemos en teclado		
		System.out.print("¿Radio (en metros)? ");
		radio = teclado.nextDouble();
		System.out.print("¿Altura (en metros)? ");
		altura = teclado.nextDouble();
//		pi = 3.14159265359
//		hacemos la operación para sacar el volumen
		volumen = 3.14159265359 * (radio * radio) * altura;
		System.out.printf("Volumen = %.3f\n", volumen);
		
//	cerramos teclado
		teclado.close();
		
		
		
		
		
		
	}

}

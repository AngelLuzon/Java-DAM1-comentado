import java.util.Scanner;

public class E5X01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
//inicializamos dos numeros reales
		double numeroA, numeroB;
		
//		visualizamos los numeros que metemos en teclado
		System.out.print("¿Número Real A? ");
		numeroA = teclado.nextDouble();
		System.out.print("¿Número Real B? ");
		numeroB = teclado.nextDouble();
		
//	NUMEROS CON  2 DIGITOS DECIMALES
		System.out.printf("A = %.2f\n", numeroA);
		System.out.printf("A = %.2f\n", numeroB);
//		NUMEROS CON 1 DIGITOS DECIMAL
		System.out.printf("A = %.1f\n", numeroA);
		System.out.printf("A = %.1f\n", numeroB);
//		NUMEROS CON 0 DIGITOS DECIMALES
		System.out.printf("A = %.0f\n", numeroA);
		System.out.printf("A = %.0f\n", numeroB);
		
//		CERRAMOS TECLADO
		teclado.close();
	}	
}

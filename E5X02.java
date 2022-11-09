import java.util.Scanner;

public class E5X02 {

	public static void main(String[] args) {
//		LEA 3 NUMEROS REALES
//		INDIQUE CUAL ES MAYOR DE ELLOS
//		NO INTRODUCIRA DOS VECES EL MISMO NUMERO
		double numeroA, numeroB, numeroC;
		
		Scanner teclado = new Scanner(System.in);
		
		
//		VISUALIZAMOS QUE SE LEA POR TECLADO
		System.out.print("¿Número Real A? ");
		numeroA = teclado.nextDouble();
		System.out.print("¿Número Real B? ");
		numeroB = teclado.nextDouble();
		System.out.print("¿Número Real C? ");
		numeroC = teclado.nextDouble();
		
//		HACEMOS CONDICIONES
		if(numeroA > numeroB && numeroA > numeroC) {
			System.out.printf("El numero %f es el mayor", numeroA);
		}
		else if(numeroB > numeroA && numeroB > numeroC) {
			System.out.printf("El numero %f es el mayor", numeroB);
		}
		else {
			System.out.printf("El numero %f es el mayor", numeroC);
		}
//		cerramos teclado
		teclado.close();
	}

}

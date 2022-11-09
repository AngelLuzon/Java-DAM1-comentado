import java.util.Scanner;

public class E4X02 {

	public static void main(String[] args) {
		double numeroA, numeroB;
		Scanner teclado = new Scanner(System.in);
		
//		lEER 2 NUEVOS REALES 
//		SABER CUAL ES MAYOR O IGUALES

		
		
//		VISUALIZAMOS LOS NUMERO POR TECLADO
		System.out.print("¿Número Real A? ");
		numeroA = teclado.nextDouble();
		System.out.print("¿Número Real B? ");
		numeroB = teclado.nextDouble();
		
//		condiciones saber para saber cual es mayor
		if(numeroA > numeroB ) {
			System.out.printf("El numero real %f es mayor", numeroA);
		}
		else if(numeroA < numeroB) {
				System.out.printf("El numero real %f es mayor", numeroB);
		}
		else {
			System.out.printf("%f y %f son iguales", numeroA, numeroB);
		}
//		cerramos teclado
		teclado.close();
	}

}

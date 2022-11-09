import java.util.Scanner;

public class E3X02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
//		LEER UN NUMERO REAL
//		DEBE SER 0 POSITIVO
//		CALCLAR EL CUADRADO DEL NUMERO Y SU RAIZ CUADRADA

		double numero, cuadrado;
//		visulizamos lo que metemos por teclado
		System.out.println("¿Número real? ");
		numero = teclado.nextDouble();
//		
		if(numero >= 0) {
			cuadrado = numero * numero;
			System.out.printf("Cuadrado de %f : %.4f\n", numero, cuadrado);
//			// math.sqrt sirve para hacer la raiz cuadrada
			System.out.printf("Raiz cuadrada de %f : %.1f", numero, Math.sqrt(numero));
			
		}
		else {
			System.out.print("El número real debe ser cero o positivo.");
				
			
		}
		
//		cerramos teclado
		teclado.close();

	}

}

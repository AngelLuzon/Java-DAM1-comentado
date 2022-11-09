import java.util.Scanner;

public class E1X02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
//		calcular entero si es par o impar
		int numero;
//		visualizamos los numeros que metemos en teclado			
		System.out.print("Introduzca número: ");
		numero = teclado.nextInt();
		
//		hacemos la operacion para saber si es par o impar
		if((numero % 2) == 0) {
			System.out.printf("El número %d es par", numero);
		} 
			else {
				System.out.printf("El número %d es impar", numero);
			
			}
//		cerramos teclado
		teclado.close();
	}

}

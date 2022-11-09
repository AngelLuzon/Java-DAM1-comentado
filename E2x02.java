import java.util.Scanner;

public class E2x02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
//		lea un número entero y diga si es positivo, negativo o neutro
		int numero;
		
//		visulizamos el numero que metemos por teclado
		System.out.print("Escribe un número: ");
		numero = teclado.nextInt();
		
//		hacemos las condiciones
		if(numero < 0) {
			System.out.print("El número es negativo.");
		}
			else if(numero == 0) {
				System.out.print("El número es neutro.");
			}
		else {
			System.out.print("El número es positivo.");
		}
		
		
//		cerramos teclado
		teclado.close();
		
		
		
		
	}

}

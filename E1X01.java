import java.util.Scanner;
public class E1X01 {

	public static void main(String [] args) {
	
		Scanner teclado = new Scanner(System.in);
	
		//inicializo 3 numeros enteros
		int numeroA, numeroB, numeroC;
		//visualizamos los numeros que metemos en teclado
		System.out.print("¿NúmeroA? ");
		numeroA = teclado.nextInt();
		System.out.print("¿NúmeroB? ");
		numeroB = teclado.nextInt();
		System.out.print("¿NúmeroC? ");
		numeroC = teclado.nextInt();
		
		
		//hacemos que salgan en consola en una unica línea de texto
		System.out.print("El númeroA es " + numeroA + ", el númeroB es " + numeroB + " y el númeroC es " + numeroC);
//		cerramos teclado
		teclado.close();
	
	
	
	
	}
}

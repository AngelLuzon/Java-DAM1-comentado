import java.util.Scanner;
public class E2X01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//inicializa los 3 numeros enteros
		int numeroA, numeroB, numeroC;
		
		//visualizamos los numeros que ponemos por el teclado
		System.out.print("¿Número Entero A? ");
		numeroA = teclado.nextInt();
		System.out.print("¿Número Entero B? ");
		numeroB = teclado.nextInt();
		System.out.print("¿Número Entero C? ");
		numeroC = teclado.nextInt();
		
		
		//Escribimos si numeros alineados a la derecha 5 DIGITOS
//		printf ("X = %5(longitud)d(entero)\n(salto de linea)
		System.out.println("NÚMEROS ALINEADOS POR LA DERECHA: ");
		System.out.printf("A = %5d\n" , numeroA);
		System.out.printf("A = %5d\n" , numeroB);
		System.out.printf("A = %5d\n" , numeroC);
		
		//Escribimos si numeros alineados a la izquierda 5 DIGITOS
		System.out.println("NÚMEROS ALINEADOS POR LA IZQUIERDA: ");
		System.out.printf("A = %d\n" , numeroA);
		System.out.printf("A = %d\n" , numeroB);
		System.out.printf("A = %d\n" , numeroC);
//		Copnclusion si para print ponemos "valor = %(numero si queremos que empiece por la derecha)d(entero, f es double) y \n (saltar línea)
//		cerramos teclado
		teclado.close();
	}

}

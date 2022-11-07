import java.util.Scanner;

public class E3X01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
//		inicializamos dos numeros enteros
		int numeroA, numeroB, numeroAyudante;
		//visualizamos los numeros que metemos en teclado
		System.out.print("¿Número Entero A? ");
		numeroA = teclado.nextInt();
		System.out.print("¿Número Entero B? ");
		numeroB = teclado.nextInt();
		
//		antes del intercambio
		System.out.println("Antes del intercamnio: ");
//		escribes el texo del print f y luego pones los valores en el orden correspondiente
		System.out.printf("A = %d y B = %d\n", numeroA, numeroB);
		
//		DESPUES del intecambio añadimos variable para cambiar valores
		System.out.println("Despues del intercamnio: ");
//		creas numeroAyudante y le das el valor del numeroA
		numeroAyudante = numeroA;
//		El valor del numero A tiene el valor del numero B
		numeroA = numeroB;
//		numeroB obtiene el valor de numeroAyudante que era el del valor A
		numeroB = numeroAyudante;
//		Conclusion sustituir para que intercambiar valores
		System.out.printf("A = %d y B = %d\n", numeroA, numeroB);
		
//		cerramos teclado
		teclado.close();
	}

}

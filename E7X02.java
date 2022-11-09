import java.util.Scanner;

public class E7X02 {

	public static void main(String[] args) {
		
//		3 NUMEROS REALES
//		HACER ECUACIÓN
		double numeroA, numeroB, numeroC, x1, x2;
		Scanner teclado = new Scanner(System.in);
		
//		visualizamos lo que metemos por teclado		
		System.out.print("¿Coeficiente A? ");
		numeroA = teclado.nextDouble();
		System.out.print("¿Coeficiente B? ");
		numeroB = teclado.nextDouble();
		System.out.print("Coeficiente C? ");
		numeroC = teclado.nextDouble();
		
//		Hacemos las condiciones de la ecuacion
		if ((numeroB*numeroB) - 4 * (numeroA * numeroC) > 0) {
			x1 = ((-numeroB + Math.sqrt((numeroB * numeroB) - 4 * (numeroA * numeroC)))/ (2* numeroA));
			x2 = ((-numeroB - Math.sqrt((numeroB * numeroB) - 4 * (numeroA * numeroC)))/ (2* numeroA));
			System.out.println("La ecuacion tiene dos soluciones reales:");
			System.out.printf("X1 = %.1f\n", x1);
			System.out.printf("X2 = %.1f", x2);
		} 
		else if ((numeroB*numeroB) - 4 * (numeroA * numeroC) == 0) {
			x1 = ((-numeroB + Math.sqrt((numeroB * numeroB) - 4 * (numeroA * numeroC)))/ (2* numeroA));
			System.out.println("La ecuacion tiene una unica solucion real:");
			System.out.printf("X1 = %.1f", x1);
		} 
		else {
			System.out.println("La ecuacion no tiene ninguna solucion real.");
		}
		
//		cerramos teclado
		teclado.close();
	}

}

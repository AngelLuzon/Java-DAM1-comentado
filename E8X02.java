import java.util.Scanner;

public class E8X02 {

	public static void main(String[] args) {
		// valor double
//		condicion < 200, condicion 200>= 800>= 10% descuento
//		>800 descuento 15%
		double importe;
		Scanner teclado = new Scanner(System.in);
		
//		visualizamos lo que metemos por teclado
		System.out.print("¿Importe de la Compra? ");
		importe = teclado.nextDouble();
		
		if(importe < 0) {
			System.out.print("El importe de la compra debe ser positivo");
		}
		else if(importe >= 200 && importe <= 800) {
			System.out.printf("Descuento: %.2f€\n", importe * 0.10);
			System.out.printf("Importe con descuento: %.2f€", importe - (importe * 0.10));
		}
		else if(importe > 800) {
			System.out.printf("Descuento: %.2f€\n", importe * 0.15);
			System.out.printf("Importe con descuento: %.2f€", importe - (importe * 0.15));
		}
//		cerramos teclado
		teclado.close();
	}

}

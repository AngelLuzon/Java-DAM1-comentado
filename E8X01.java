import java.util.Scanner;

public class E8X01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
//		LEER VELOCIDAD INICIAL, ACELARACION DEL COHETE Y TIEMPO TRANSCURRIDO = DISTANCIA RECORRIDA
//		3 DECIMALES
		double velocidadInicial, aceleracionCohete, tiempoTranscurrido, distanciaRecorrida;
		
//		visualizamos los numeros que metemos en teclado	
		System.out.print("¿Velocidad Inicial (en metros/segundo)? ");
		velocidadInicial = teclado.nextDouble();
		System.out.print("¿Aceleración (en metros/segundo*segundo)? ");
		aceleracionCohete = teclado.nextDouble();
		System.out.print("¿Tiempo transcurrido (en /segundos)? ");
		tiempoTranscurrido = teclado.nextDouble();
//		calculamos la distancia según la formula, decimales con.
		distanciaRecorrida = (velocidadInicial * tiempoTranscurrido + 0.5 * aceleracionCohete * (tiempoTranscurrido * tiempoTranscurrido));
//		hacemos el printf con 3 decimales
		System.out.printf("Distancia recorrida: %.3f metros", distanciaRecorrida);
		
//		cerramos teclado
		teclado.close();
	}

}



//ambito pregunta teoría
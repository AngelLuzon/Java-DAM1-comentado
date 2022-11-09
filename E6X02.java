import java.util.Scanner;

public class E6X02 {

	public static void main(String[] args) {
//		1 NUMERO ENTERO(SEGUNDOS) que debe ser positivo
//		convertir horas, minutos, segundos
		int segundos, convertirSegundos, convertirMinutos, convertirHoras;
		Scanner teclado = new Scanner(System.in);
//		visualizamos lo que metemos por teclado
		System.out.print("¿Tiempo en segundos? ");
		segundos = teclado.nextInt();
//		hacemos condicion de ser positivo
		if(segundos < 0) {
			System.out.println("El tiempo en segundos debe ser mayor o igual que 0.");
		}
//		condicion sabiendo que son positivos
		else {
//			1 hora = 3600 segundos.
			convertirHoras = (segundos / 3600);
//			1 minuto = 60 segundos es mas de 60 segundos menos que 1 hora
			convertirMinutos = ((segundos - ( convertirHoras * 3600)) / 60);
//			si no se convierte ni en horas ni minutos, será segundos
			convertirSegundos = ((segundos  - (convertirHoras * 3600)) - (convertirMinutos * 60));
//			hacemos el print para sacar resultado
			System.out.printf("%d horas %d minutos %d segundos", convertirHoras, convertirMinutos, convertirSegundos);
//			cerramos teclado
			teclado.close();
		}
	
		
		
		
		
	}

}

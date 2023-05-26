package unlam.paradigmas.tp.hogwarts;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		char respuesta;
		
		do {
			System.out.println("¿Acepta sugerencia? Ingrese S o N: ");
			respuesta = entrada.nextLine().charAt(0);
			respuesta = Character.toUpperCase(respuesta); 
			
			
		}while(respuesta != 'S' && respuesta !='N');
		
		if(respuesta == 'S')
		System.out.println("La sugerencia ha sido aceptada!");
		else
			System.out.println("La sugerencia NO ha sido aceptada. :(");
	}
	
	
}

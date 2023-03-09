import java.util.*;
public class Condicional_if {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad por favor");
		int edad=entrada.nextInt();
		
		if(edad>=18) {
			System.out.println("Tu eres mayor de edad");
		}else {
			System.out.println("Tu eres menor de edad");
		}
		
		
		if(edad<18) {
			System.out.println("Tu eres un adolescente");
		}else if(edad<40){
			System.out.println("Tu eres joven");
		}else if(edad<65) {
			System.out.println("Tu eres maduro");
		}else {
			System.out.println("cuidate");
		}
	}

}

import javax.swing.JOptionPane;

public class Bucle_for {

	public static void main(String[] args) {
		//Imprimir con el bucle for 10 veces
		for(int i=0;i<=10;i++) {
			System.out.println(i + " wilson");
		}
		//Con el bucle for verificar la validez de un correo electronico
		//Declaro e inicializo variables
		int arroba=0;
		boolean punto=false;
		//Declaro un objeto string y lo igualo con lo que introduce el usuario por medio del metodo showinputDialog de la clase JOptionPane
		String mail=JOptionPane.showInputDialog("Introduce tu email por favor");
		//Por medio del bucle for evaluo si el correo ingresado cuenta con el caracter arroba y al menos un punto
		for(int i=0; i<mail.length(); i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				punto=true;
			}
		}
		//por medio del if y else coorobore si el email es correcto o no
		if(arroba==1 && punto==true) {
			System.out.println("El email es correcto");
		}else {		
		System.out.println("El email no es correcto");
		}
		
		//bucle for para hallar factorial de un numero
		long resultado=1L;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero por favor"));
		for(int i=numero; i>0; i--) {
			resultado=resultado*i;
		}
		System.out.println("El factorial de " + numero + " es igual a " + resultado);
		
	}
	
}

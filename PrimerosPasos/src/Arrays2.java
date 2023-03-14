import javax.swing.*;
public class Arrays2 {

	public static void main(String[] args) {
		/* Declaracion de arrays, llenado del array e impresion de cada uno de los elementos del array con un bucle for*/
		String [] paises = new String[8];
		paises[0]="Colombia";
		paises[1]="España";
		paises[2]="Mexico";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Ecuador";
		paises[6]="Argenetina";
		paises[7]="Venezuela";		
		for(int i=0; i<paises.length; i++) {
			System.out.println("pais " + (i+1) + " " + paises[i]);
		}
		
		/* Declaracion y llenado de array en una sola linea, impresion de cada elemento con bucle for each*/		
		String [] paises2= {"Colombia", "España", "Mexico", "Peru", "Chile", "Ecuador", "Argenetina", "Venezuela"};
		for(String elemento:paises2) {
			System.out.println("Pais: " + elemento);
		}
		
		/*Declaracion de array llenado por medio de bucle for e impresion de cada posicion con bucle for each*/
		String [] paises3 = new String[8];
		for(int i=0; i<8; i++) {
			paises3[i]=JOptionPane.showInputDialog("Introduce el nombre del pais " + (i+1));
		}		
		for(String elemento:paises3) {
			System.out.println("Pais: " + elemento);
		}
		
		/*Declaracion de array, llenado del array automaticamente con bucle for e impresion del array por medio de bucle for each*/
		int[] matriz_aleatorios=new int[150];
		for(int i=0; i<matriz_aleatorios.length; i++) {
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		for (int numeros:matriz_aleatorios){
			System.out.print(numeros + ", s");
		}

	}

}

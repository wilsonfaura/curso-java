package poo;
import javax.swing.*;
public class Uso_Coche {
	
	public static void main(String[] args) {
		Coche micoche=new Coche(); //Instanciar una clase, ejemplar de clase
		micoche.establece_color(JOptionPane.showInputDialog("Introduce el color del coche"));//Uso de metodo setter
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());//Uso de metodo getter
		micoche.establece_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		System.out.println(micoche.dime_asientos());
		micoche.establece_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.print("El precio final del coche es: " + micoche.precio_coche());
	}

}

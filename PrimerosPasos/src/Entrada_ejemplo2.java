import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años");
	}
}


public class Manipulacion_cadenas {

	public static void main(String[] args) {
		String nombre="Wilson Ernesto Faura Estupiñan";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length()+ " letras");
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1));
	}

}

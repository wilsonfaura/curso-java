package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {
	public static void main(String[] args) {
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]= new Empleado2("Sandra", 50000, 2008,8,18);
		lasPersonas[1]= new Alumno("Ana lopez", "Biologicas");
		
		for(Persona p: lasPersonas) {
			System.out.println(p.dameNombre()+ ", " + p.dameDescripcion());
		}
	}
}


abstract class Persona{//Definicion de clase abstracta
	public Persona(String nom) {//Metodo constructor de la clase Persona
		nombre=nom;
	}
	
	public String dameNombre() {//metodo getter en la clase Persona
		return nombre;
	}
	
	public abstract String dameDescripcion();//Definicion de metodo abstracto
	
	private String nombre;
}



class Empleado2 extends Persona{
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {//Metodo constructor de la clase empleado2
		super(nom);//con super llamamos al constructor de la clase padre osea Persona
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un ID = " + Id + " con un sueldo = " + sueldo;
	}

	public double dameSueldo() {//getter
		return sueldo;//podemos poner el modificador final para que este metodo no pueda ser reescritomas adelante en este caso seria dameSueldo de la clase jefatura
	}
	public Date dameFecha() {//getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {//Setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	//Declaración de variables
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}

class Alumno extends Persona{
	public Alumno(String nom, String car) {
		super(nom);
		carrera=car;
	}
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	private String carrera;
}

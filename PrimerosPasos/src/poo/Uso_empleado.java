package poo;
import java.util.*;
public class Uso_empleado {
	public static void main(String[] args) {
	  /*Empleado empleado1=new Empleado("Yeison Gomez", 85000, 2004, 04, 15);
		Empleado empleado2=new Empleado("Andrea Lopez", 95000, 1995, 06, 01);
		Empleado empleado3=new Empleado("Santiago faura", 105000, 2010, 01, 01);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de alta: " + empleado1.dameFecha());
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de alta: " + empleado2.dameFecha());
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de alta: " + empleado3.dameFecha());*/
		Jefatura jefe_RRHH=new Jefatura("Wilson", 55000, 2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Yeison Gomez", 85000, 2004, 04, 15);
		misEmpleados[1]=new Empleado("Andrea Lopez", 95000, 1995, 06, 01);
		misEmpleados[2]=new Empleado("Santiago faura", 105000, 2010, 01, 01);
		misEmpleados[3]=new Empleado("Milena Pedraza");
		misEmpleados[4]=jefe_RRHH;//Polimorfismo en accion
		misEmpleados[5]=new Jefatura("Maria", 95000, 1999,5,26);
		Jefatura jefe_finanzas=(Jefatura) misEmpleados[5];//Refundicion o casting de objetos
		jefe_finanzas.estableceIncentivo(55000);
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		for(Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
	  /*for(int i=0; i<3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de alta: " + misEmpleados[i].dameFecha());
		}*/
		for(Empleado e: misEmpleados) {
			System.out.println(" Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: " + e.dameFecha());
		}
	}
}

class Empleado{//podemos poner el modificador final adelante de la clase para no permitir que esta clase siga heredando a otras clases como la clase Jefatura
	public Empleado(String nom, double sue, int agno, int mes, int dia) {//Metodo constructor de la clase empleado
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	public Empleado(String nom) {//Metodo constructor de la clase empleado
		this(nom, 30000, 2000,01,01);
	}
	
	public String dameNombre() {//getter
		return nombre + " Id: " + Id;
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
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}

class Jefatura extends Empleado{
	public Jefatura(String nom, double sue, int agno, int mes, int dia){//Metodo constructor d ela clase jefatura
		super(nom, sue, agno, mes, dia);
	}
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();		
		return sueldoJefe + incentivo;
	}
	private double incentivo;
}




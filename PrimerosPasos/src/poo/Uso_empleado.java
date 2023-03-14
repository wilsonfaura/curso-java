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
		
		Empleado[] misEmpleados=new Empleado[3];
		misEmpleados[0]=new Empleado("Yeison Gomez", 85000, 2004, 04, 15);
		misEmpleados[1]=new Empleado("Andrea Lopez", 95000, 1995, 06, 01);
		misEmpleados[2]=new Empleado("Santiago faura", 105000, 2010, 01, 01);
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
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: " + e.dameFecha());
		}
	}
}

class Empleado{
	public Empleado(String nom, double sue, int agno, int mes, int dia) {//Metodo constructor de la clase empleado
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
	}
	
	public String dameNombre() {//getter
		return nombre;
	}
	public double dameSueldo() {//getter
		return sueldo;
	}
	public Date dameFecha() {//getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	//Declaración de variables
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}


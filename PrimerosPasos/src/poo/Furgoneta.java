package poo;

public class Furgoneta extends Coche {
	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta(int plazasExtra, int capacidadCarga) {
		super();//LLamar al constructor de la clase padre
		this.capacidadCarga=capacidadCarga;
		this.plazasExtra=plazasExtra;
	}
	public String dimeDatosFurgoneta() {
		return " La capacidad de carga es: " + capacidadCarga + " y las plazas son: " + plazasExtra;
	}
}

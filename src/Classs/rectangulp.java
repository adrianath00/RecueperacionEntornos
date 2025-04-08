package Classs;

public class rectangulp {
	private int id;
	private String nombre;
	private double ladoA;
	private double ladoB;


	//Contructor por defecto
	public rectangulp() {
	super();
	}
	
	//Constructor 
	public rectangulp(int id, String nombre, double ladoA, double ladoB) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	//Getter y setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	//Mostrar informacion
	@Override
	public String toString() {
		return "rectangulp [id=" + id + ", nombre=" + nombre + ", ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
	}
	public static double CalcularAreaRectangulo(rectangulp rectangulo1) {
		// Calcular area rectangulo: ladoA*ladoB 
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double areaRectangulo = ladoA+ladoB;
		return areaRectangulo;
	}
 
}



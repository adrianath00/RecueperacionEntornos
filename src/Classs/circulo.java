package Classs;

public class circulo {
	private int id;
	private double radio;
	private String color;
}
	//Constructor 
	public circulo(int id, double radio, String color) {
	super();
	this.id = id;
	this.radio = radio;
	this.color = color;
}
	//Constructor por defecto
	public circulo() {
		super();
	}
	
	
	//Getter y setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Mostrar informacion
	@Override
	public String toString() {
	return "circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}
}
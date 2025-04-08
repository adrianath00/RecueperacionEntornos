package Classs;

public class Main {
	public static void main(String[] args) {
		circulo circulo1 = new circulo (1, 3, "Naranja");
		rectangulp rectangulo1 = new rectangulp(1, null, 3, 5);
		double areacirculo = Calcularareacirculo(circulo1);
		double arearectangulp = Calculararearectangulp(rectangulo1);

		imprimir(circulo1, rectangulo1, areacirculo, arearectangulp);
	}


	private static double Calculararearectangulp(rectangulp rectangulo1) {
		return rectangulo1.getLadoA()*rectangulo1.getLadoB();
	}


	private static double Calcularareacirculo(circulo circulo1) {
		return circulo1.getRadio()*circulo1.getRadio()*3.1416;
	}


	/**
	 * Este metodo lo utilizamos para imprimir resultados
	 * @param circulo1 ira en centimetros cuadros
	 * @param rectangulo1
	 * @param areacirculo
	 * @param arearectangulp
	 */
	private static void imprimir(circulo circulo1, rectangulp rectangulo1, double areacirculo, double arearectangulp) {
		System.out.println(circulo1);
		System.out.println(rectangulo1);
		System.out.println("Area Circulo"+areacirculo);
		System.out.println("Area Rectangulo"+arearectangulp);
	}
}

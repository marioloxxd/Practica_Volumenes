package Clases;

public class Cubo {
	int lado;
	
	public Cubo (int lado) {
		this.lado = lado;
	}
	
	public Cubo() {
		this.lado = 1;
	}
	
	/**
	 * 
	 * Calcula la superficie de un cubo en el cual, calculamos el area para multiplicarlo por 6
	 * @return La superficie en metros
	 */
	public int superficieCubo(int lado) {
		int area = this.lado * this.lado;
		return area * 6;
	}
	
	/**
	 * 
	 * Calcula el volumen del cubo multiplicando base por altura por profundidad
	 * @return el volumen del cubo en metros.
	 */
	public int volumenCubo(int lado) {
		return this.lado * this.lado * this.lado;
	}
	
	
	

}

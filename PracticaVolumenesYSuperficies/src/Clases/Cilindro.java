package Clases;

public class Cilindro {
	int radio;
	int altura;
	
	public Cilindro(int radio, int altura) {
		this.altura = altura;
		this.radio = radio;
	}
	
	public Cilindro() {
		this.altura = 1;
		this.radio = 1;
	}
	
	//Metodos
	
	/**
	 * 
	 * Calculamos la superficie del cilindro usando la altura y el radio
	 * 
	 * @return Recibimos la superficie en metros
	 */
	public int superficieCilindro(int altura, int radio) {
		
		int superficie = 2*(int)Math.PI * this.radio * this.radio + 2*(int)Math.PI * this.radio * this.altura;
		return superficie;
		
	}
	
	
	/**
	 * 
	 * Calculamos el Volumen de un cilindro calculando antes el area de la base
	 * 
	 * @return El volumen en metros
	 */
	public int volumenCilindro(int altura, int radio) {
		int area = (int)Math.PI * this.radio * this.radio;
		
		return area*this.altura;
		
	}

}

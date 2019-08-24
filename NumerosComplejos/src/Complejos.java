import java.util.Scanner;

public class Complejos {

	private double real;
	private double imag;
	
	//contructor con parametros clase complejos
	
	public Complejos(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	
	//contructor vacio clase complejos
	
	public Complejos() {
		super();
		// TODO Auto-generated constructor stub
	}




	public double getReal() {
		return real;
	}


	public void setReal(double real) {
		this.real = real;
	}


	public double getImag() {
		return imag;
	}


	public void setImag(double imag) {
		this.imag = imag;
	}

//to string objetos class complejos
	public String toString() {
		
		String msj="("+real+","+imag+"x)";
		
		return msj;
	}

//METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejos other = (Complejos) obj;
		if (Double.doubleToLongBits(imag) != Double.doubleToLongBits(other.imag))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}
	
	
	//METODO SUMA
	
	public Complejos suma(Complejos  suma) {
		
		return new Complejos(this.real+suma.real, this.imag+suma.imag);
	}

	//METODO RESTA
	public Complejos resta(Complejos resta) {
		
		return new Complejos(this.real-resta.real,this.imag-resta.imag);
	}

	//METODO MULTIPLICACION
	
	public Complejos multiplicar(Complejos multi) {
		
		return new Complejos();
	}
}

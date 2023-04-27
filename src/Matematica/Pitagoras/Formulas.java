package Matematica.Pitagoras;

public class Formulas {

	private double b;
	private double c;
	
	public Formulas(double b, double c) {
		setB(b);
		setC(c);
	}
	
	double a () {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
	}
	
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "O Valor da hipotenusa é: " + a();
	}
}

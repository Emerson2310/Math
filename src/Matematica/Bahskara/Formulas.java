package Matematica.Bahskara;

public class Formulas {

	
	private double a;
	private double b;
	private double c;
	
	public Formulas(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	double delta () {
		return Math.pow(getB(), 2) + (-4 * getA() * getC());
	}
	
	double bahskara1() {
		return (-getB() + Math.sqrt(delta()))/(2*getA());
	}
	
	double bahskara2() {
		return (-getB() - Math.sqrt(delta()))/(2*getA());
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
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
		return "Delta = " +  delta() +
				"\nX1 = " + bahskara1() +
				"\nX2 = " + bahskara2();
	}
	
	
	
}

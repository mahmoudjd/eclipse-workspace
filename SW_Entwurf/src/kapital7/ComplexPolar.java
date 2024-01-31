package kapital7;


public class ComplexPolar {
	private double r;
	private double phi;
	

	//  von auﬂen nicht unterscheidbar! 
	public double getReal() {
		return r * Math.cos(phi);
	}

	public void setReal(double real) {
		/* r, phi neu berechnen */ }

	public double getImag() {
		return r * Math.sin(phi);
	}

	public void setImag(double imag) {
		/* r, phi neu berechnen */ }

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getPhi() {
		return phi;
	}

	public void setPhi(double phi) {
		this.phi = phi;
	}
}

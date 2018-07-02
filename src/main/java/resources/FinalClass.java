package resources;

public final class FinalClass {
	private final double re;
	private final double im;

	public FinalClass(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public String toString() {
		return "(" + re + " + " + im + "i)";
	}
}

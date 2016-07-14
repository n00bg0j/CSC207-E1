package e1;

public class GaussInteger {
	private int real, imag;
	
	// default constructor in a way
	GaussInteger() {
		this.real = 0;
		this.imag = 0;
	}
	
	// my constructor, which allows for initilization of values
	GaussInteger(int real, int imag) {
		// set the real component
		this.real = real;
		// set the imaginary component
		this.imag = imag;
	}
	
	// setters and getters for the instance variables
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	// returns the sum of operand and current GaussInteger
	public GaussInteger add(GaussInteger operand) {
		this.real += operand.real;
		this.imag += operand.imag;
		return this;
	}
	
	// returns the sum of squares of real and imaginary parts
	public Integer moduleSquared() {
		int tempR = this.real ** 2;
		int tempI = this.imag ** 2;
		return tempR + tempI;
	}
	
	// returns invertibility
	public boolean isInvertible() {
		return 1 == this.moduleSquared();
	}
	
	// Add the necessary formal parameter
	public boolean equals(GaussInteger other) {
	   boolean result = true;
	   return (this.real == other.real) && (this.imag == other.imag)
	}
	
	public String toString() {
		String result = "";
		// your code goes here
		return result;
	}

}

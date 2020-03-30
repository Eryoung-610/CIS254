/*
 * Eric Young
 * CIS254
 * April 22, 2019
 * Professor Harden
 * Assignment 9
 * 
 * This assignment is designated to go through arithmetic operations that add, subtract, multiply and divide fractions. Several methods are used to complete this assignment as operations with different denominators
 * does not compute. Those methods (add,subtract,divide, multiply, reduce) involve the private integers designated as the numerator and denominator. This program also includes a test class that will ensure that the
 * arithmetic operations are indeed accurate.
 * 
 */

public class Fraction {
	private int num;
	private int denom;

	Fraction(int n, int d) {
		num = n;
		denom = d;
	}

	public Fraction() {
		num = 0;
		denom = 1;
	}

	// String that would return the general output format for results.
	public String String() {
		return (num + "/" + denom);
	}

	// Turns numerators or denominators into doubles if they are containing decimal
	// places.
	public double Decimal() {
		double numerator = num;
		double denominator = denom;

		return (numerator / denominator);
	}

	// Reduce utilizes the gcd method that reduces the current numerator and
	// denominator.
	public String Reduce() {
		int g = gcd(num, denom);
		num = num / g;
		denom = denom / g;

		return String();
	}

	//
	public void invert() {
		int g = num;
		num = denom;
		denom = g;
	}

	// GCD(Greatest Common Denominator) method. Used to help the mathematical
	// operations involving fractions.
	int gcd(int x, int y) {
		if (x == 0)
			return y;
		return gcd(y % x, x);
	}

	// Addedto fraction. Adds fractions together using the given numerator and
	// denominator of fractions. Also utilizes the reduce method.
	public Fraction addedTo(Fraction f) {
		int num = this.num * f.denom + this.denom * f.num;
		int den = this.denom * f.denom;

		Fraction x = new Fraction(num, den);
		x.Reduce();
		return x;
	}

	// Subtract fraction methods. Subtracts fractions given that they are of the
	// same denominator. Also utilizes the reduce method.
	public Fraction subtract(Fraction f) {
		int num = this.num * f.denom - this.denom * f.num;
		int denom = this.denom * f.denom;

		Fraction x = new Fraction(num, denom);
		x.Reduce();
		return x;
	}

	// Multiplication Method. Multiplies fractions while also utilizing the reduce
	// method.
	public Fraction multipliedBy(Fraction f) {
		int num = this.num * f.num;
		int denom = this.denom * f.denom;

		Fraction x = new Fraction(num, denom);
		x.Reduce();
		return x;
	}

	// Division method. Divides fractions while using the reduce method.
	public Fraction dividedBy(Fraction f) {
		int num = this.num * f.denom;
		int denom = this.denom * f.num;

		Fraction x = new Fraction(num, denom);
		x.Reduce();
		return x;
	}

	// Print method, standard/generic output statements when called.
	public void print() {
		this.Reduce();

		System.out.print(this.num + "/" + this.denom);
	}

	public boolean isEqualTo(Fraction f) {
		return this.num == f.num && this.denom == f.denom;
	}
}

/*
 * OUTPUT
 * 
 * The result starts off at 0/1 The product of 9/8 and 2/3 is 3/4 The quotient
 * of 9/8 and 2/3 is 27/16 The sum of 9/8 and 2/3 is 43/24 The difference of 9/8
 * and 2/3 is 11/24 The two Fractions are not equal. The product of 3/2 and 2/3
 * is 1/1
 * 
 */

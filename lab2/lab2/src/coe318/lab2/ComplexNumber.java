package coe318.lab2;
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts).
* * It is an <em>immutable</em> object.
*
* @author Your Name
*/
public class ComplexNumber {
//Instance variable declarations
    double real;
    double imaginary;
/**
* Construct a ComplexNumber given its
* real and imaginary parts.
* @param re The real component
* @param im The imaginary component
*/
public ComplexNumber(double re, double im) {
    //Initialize the instance variables
    this.real = re;
    this.imaginary = im;
    }
    /**
    * Returns the real component.
    * @return the real
    */
    public double getReal() {
    return this.real; //A stub: to be fixed
    }
    /**
    * Returns the imaginary component.
    * @return the imaginary
    */
    public double getImaginary() {
    return this.imaginary; //A stub: to be fixed
    }
    /**
    * Returns a new ComplexNumber number that is
    * the negative of <em>this</em>. Note: the
    * original ComplexNumber is <b>NOT</b>
    * modified.
    * @return -this
    */
    public ComplexNumber negate(){
        return new ComplexNumber((this.real*-1), (this.imaginary*-1)); //A stub: to be fixed
    }
    /**
    * Returns a new ComplexNumber that is the
    * sum of <em>this</em> and <em>z</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this + z
    */
    public ComplexNumber add(ComplexNumber z) {
    return new ComplexNumber((this.real + z.real), (this.imaginary + z.imaginary)); //A stub: to be fixed
    }
    /**
    * Returns a new ComplexNumber that is the
    * difference of <em>this</em> and <em>z</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this + z
    */
    public ComplexNumber subtract(ComplexNumber z) {
    return this.add(z.negate());
    }
    /**
    * Returns a new ComplexNumber that is the
    * product of <em>this</em> and <em>z</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this * z
    */
    public ComplexNumber multiply(ComplexNumber z) {
    return new ComplexNumber(this.real* z.real - this.imaginary * z.imaginary, this.imaginary * z.real + this.real * z.imaginary); //A stub: to be fixed
    }
    /**
    * Returns a new ComplexNumber that is
    * the reciprocal of <em>this</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @return 1.0 / this
    */
    public ComplexNumber reciprocal() {
    return new ComplexNumber((this.real/(this.real*this.real + this.imaginary*this.imaginary)), (-this.imaginary/(this.real*this.real + this.imaginary*this.imaginary))); //A stub: to be fixed
    }
    /**
    * Returns a new ComplexNumber that is
    * <em>this</em> divided by <em>z</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this / z
    */
    public ComplexNumber divide(ComplexNumber z){ 
    return this.multiply(z.reciprocal());
    }
    /**
    * Returns a String representation of
    * <em>this</em> in the format:
    * <pre>
    * real +-(optional) i imaginary
    * </pre>
    * If the imaginary part is zero, only the
    * real part is converted to a String.
    * A "+" or "-" is placed between the real
    * and imaginary parts depending on the
    * the sign of the imagrinary part.
    * <p>
    * Examples:
    * <pre>
    * ..println(new ComplexNumber(0,0); -> "0.0"
    * * ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
    * ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
    * </pre>
    * @return the String representation.
    */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
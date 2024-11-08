class Rational {
    private int numerator, denominator;

    
    public Rational(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Denominator cannot be zero");
        int gcdValue = gcd(numerator, denominator); 
        this.numerator = numerator / gcdValue;
        this.denominator = denominator / gcdValue;
    }

   
    public Rational() { this(0, 1); }

    
    private int gcd(int a, int b) { return (b == 0) ? a : gcd(b, a % b); }

    
    public Rational add(Rational other) {
        return new Rational(
            this.numerator * other.denominator + other.numerator * this.denominator,
            this.denominator * other.denominator);
    }

    
    public Rational subtract(Rational other) {
        return new Rational(
            this.numerator * other.denominator - other.numerator * this.denominator,
            this.denominator * other.denominator);
    }

   
    public Rational multiply(Rational other) {
        return new Rational(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    
    public Rational divide(Rational other) {
        return new Rational(this.numerator * other.denominator, this.denominator * other.numerator);
    }

   
    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

   
    public void printDecimal() {
        System.out.println((double) numerator / denominator);
    }
}

public class RationalMain {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4);  
        Rational r2 = new Rational(3, 6); 
        System.out.print("Fraction is  "); 
        r1.printFraction();
        System.out.print("Decimal is  ");  
        r1.printDecimal();  

        Rational add = r1.add(r2); 
        System.out.print("r1 + r2 = ");
        add.printFraction();
        
        Rational subtract =r1.subtract(r2);
        System.out.print("r1 - r2 = ");
        subtract.printDecimal();

        Rational multiply =r1.multiply(r2);
        System.out.print("r1 * r2 = ");
        multiply.printFraction();

        Rational divide =r1.divide(r2);
        System.out.print("r1 / r2 = ");
        divide.printDecimal();
    }
}

public class Complex {
    private int real, img;

    // Constructor 1: Default constructor that initializes real and img to 0
    public Complex() {
        this.real = 0;
        this.img = 0;
    }

    // Constructor 2: Initializes real and img with the given parameters
    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    // Constructor 3: Copy constructor that copies values from another Complex object
    public Complex(Complex c) {
        this.real = c.real;
        this.img = c.img;
    }

    // A method to display the complex number
    public void display() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String[] args) {
        // Using constructor 1
        Complex c1 = new Complex();
        c1.display(); // Output: 0 + 0i

        // Using constructor 2
        Complex c2 = new Complex(5, 10);  
        c2.display(); // Output: 5 + 10i

        // Using constructor 3
        Complex c3 = new Complex(c2);
        c3.display(); // Output: 5 + 10i
    }
}

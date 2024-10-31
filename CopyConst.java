class A {
    int x;
    A(int y) { x = y; }     // Normal constructor
    A(A z) { x = z.x; }     // Copy constructor
    public static void main(String[] args) {
        A a1 = new A(10);    // Create object using normal constructor
        A a2 = new A(a1);    // Create object using copy constructor
        System.out.println(a2.x);  // Output: 10
    }
}

class Student {
    Student(String name, int age) {
        System.out.println(name + " " + age);
    }

    Student() {
        this("Unknown", 18); // Default values
    }

    public static void main(String[] args) {
        new Student();              // Default values: Unknown 18
        new Student("John", 20);    // Custom values: John 20
    }
}

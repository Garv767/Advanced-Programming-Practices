class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", 85.5);
        Student student2 = new Student(2, "Bob", 92.0);

        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println("\nStudent 2 Details:");
        student2.display();
    }
}
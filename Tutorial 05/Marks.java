class Student {
    private int marks;  // Private: cannot access directly
    private String name;

    public Student(String name){ this.name=name; }

    // Teacher can update marks
    public void setMarks(int marks, boolean isTeacher){
        if(isTeacher) this.marks = marks;
        else System.out.println("Only teachers can update marks!");
    }

    // Students can only view
    public void viewMarks(){
        System.out.println(name+"'s Marks: "+marks);
    }
}

public class Marks {
    public static void main(String[] args){
        Student s1=new Student("Alice");
        s1.setMarks(85,true);  // Teacher updates
        s1.viewMarks();        // Student views
        s1.setMarks(90,false); // Student tries to update
        s1.viewMarks();
    }
}

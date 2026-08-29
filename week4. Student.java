class Student {
    String name;

    static String college;

    static {
        college = "SRM Institute of Science and Technology";
        System.out.println("College info loaded");
    }

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student record created: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = {
            new Student("Ravi"),
            new Student("Meera"),
            new Student("Karthik"),
            new Student("Divya"),
            new Student("Anitha")
        };

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
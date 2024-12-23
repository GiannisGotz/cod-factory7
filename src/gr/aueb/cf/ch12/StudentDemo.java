package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student(); // Invoke default constructor
        Student bob = new Student(2,"Bob", "D."); // Invoke overloaded constructor and populate instance with values

        bob.setLastname("Dylan");


        student.setId(1);  // student.id = 1;
        student.setFirstname("Alice"); // student.firstname = "Alice";
        student.setLastname("W."); // student.lastname = "W.";

        System.out.println("Id: " +student.getId());  // System.out.println("Id: " +student.id);
        System.out.println("Firstname: " +student.getFirstname());
        System.out.println("Lastname: " +student.getLastname());

        System.out.println("Id: " +bob.getId());
        System.out.println("Firstname: " +bob.getFirstname());
        System.out.println("Lastname: " +bob.getLastname());

        System.out.println("Students instances' count: " + Student.getStudentCount());
    }
}

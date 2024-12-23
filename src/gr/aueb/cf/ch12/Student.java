package gr.aueb.cf.ch12;

/**
 * Data Class.
 * Encapsulation Applied.
 * P0J0 ( Plain Old Java Objects)
 */
public class Student {
    public static int studentCount = 0;
    private int id;
    private String firstname;
    private String lastname;

    static {
        studentCount = 0;
    }

    public Student () {

    }
    public int getId() {
        return id;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}





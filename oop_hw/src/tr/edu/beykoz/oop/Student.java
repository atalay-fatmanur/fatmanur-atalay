package tr.edu.beykoz.oop;

public class Student {

    // Private fields
    private String name;
    private String surname;
    private int grade;
    private String department;

    // Constructor
    public Student(String name, String surname, int grade, String department) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.department = department;
    }

    // Private method
    private String getFullName() {
        return name + " " + surname;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 4) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade!");
        }
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Public method
    public void printStudentInfo() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Grade: " + grade);
        System.out.println("Department: " + department);
    }
}
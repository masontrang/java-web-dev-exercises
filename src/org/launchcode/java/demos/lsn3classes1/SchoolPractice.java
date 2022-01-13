package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student name = new Student();
        name.setName("Mason");
        name.setStudentId(12345);
        name.setNumberOfCredits(1);
        name.setGPA(4.0);


        System.out.println("Name: " + name.getName());
        System.out.println("Student ID: " + name.getStudentId());
        System.out.println("Num of Credits: " + name.getNumberOfCredits());
        System.out.println("GPA: " + name.getGPA());

    }
}

package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        return  "Topic: " + topic + ", Teacher: " + instructor + ", Students: " + enrolledStudents + ")";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public void equals(Course toBeCompared){
//        if (toBeCompared == this){
//            return true;
//        }
//        if (toBeCompared == null){
//            return false;
//        }
//        if (toBeCompared.getClass() != getClass()){
//            return false;
//        }
//        Course theCourse = (Course) toBeCompared;
//        return theCourse.instructor == topic && theCourse.topic == topic;

    }
}

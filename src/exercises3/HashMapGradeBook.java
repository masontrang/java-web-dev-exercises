package exercises3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapGradeBook {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(513544, "Mason");
        students.put(658665, "Bob");
        students.put(355665, "George");
        students.put(658456, "Fred");



        for (Integer studentID : students.keySet()) {
            System.out.println(students);
        }



    }
}

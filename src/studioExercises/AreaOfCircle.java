package studioExercises;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the radius? ");

        Double radius;
        radius = input.nextDouble();

        Double pi = 3.14;

        Double result = pi * radius * radius;
        System.out.println("Area of a circle of radius " + radius + " is " + Circle.getArea(radius));

//        if (input.hasNextDouble()) {
//            radius = input.nextDouble();
//            System.out.println("Area of a circle of radius " + radius + " is " + Circle.getArea(radius));
//        } else {
//            while (radius > 0) {
//                System.out.println("enter a valid number");
//                radius = input.nextDouble();
//            } else{
//                System.out.println("Enter a valid number");
//            }
//        }
//        else{
//            System.out.println("Enter a  number");
//        }
    }
}


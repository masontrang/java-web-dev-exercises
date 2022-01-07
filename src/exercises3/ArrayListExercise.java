package exercises3;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        Integer sum = 0;

        for (int i =0; i < integers.size(); i++) {
            sum += integers.get(i);
        }
        System.out.println("Sum of integers: " + sum);

//        ArrayList<String> words = new ArrayList<>(
//                Arrays.aslist("word",
//                        "word2",
//                        "word3")
//        );

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("bye");
        words.add("java");
        words.add("cool");
        words.add("neato");
        System.out.println("arraylist words: " + words);

        Scanner input = new Scanner(System.in);
        System.out.println("Length of words? ");
        int length = input.nextInt();

        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length()==length){
                System.out.println("words of character length " + length +": " + words.get(i));
            }
        }


    }
}
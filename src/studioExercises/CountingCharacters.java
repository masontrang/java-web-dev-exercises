package studioExercises;
import java.sql.SQLOutput;
import java.util.*;


public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> tony = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String");
        String myString = input.nextLine();
        myString = myString.toLowerCase();

//        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
//                " So if you move all the terms over to one side," +
//                " you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that," +
//                " it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        for(int i=0; i<myString.length(); i++) {
            int asciiValue = myString.charAt(i);
            if (asciiValue > 96 && asciiValue < 123) {
//                for (char ch : charactersInString) {
                    if (!tony.containsKey(myString.charAt(i))) {
                        tony.put(myString.charAt(i), 1);
                    } else if (tony.containsKey(myString.charAt(i))) {
                        tony.put(myString.charAt(i), tony.get(myString.charAt(i)) + 1);
                    }
//                }
            }
        }

        for (Map.Entry<Character, Integer> entry : tony.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }
    }
}

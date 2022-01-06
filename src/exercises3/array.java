package exercises3;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 5, 8};

        for (int i : array) {
            System.out.println(i);
        }

        for (int i = 0; i < 6; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }


        String newString = "I would not, could not," +
                " in a box. I would not, could not with a fox." +
                " I will not eat them in a house." +
                " I will not eat them with a mouse.";
        String[] split = newString.split(" ");
        System.out.println(Arrays.toString(split));
//        for (String a : split) {
//            System.out.println(a);
//        }

        String[] split2 = newString.split("\\.");
        System.out.println(Arrays.toString(split2));
//



    }
}
package exercises;

import  java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it," +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowercasedText = firstLine.toLowerCase();
        System.out.println(lowercasedText);
        Scanner input = new Scanner(System.in);

        System.out.println("What word are you searching for?");
        String search = input.nextLine().toLowerCase();

        Boolean searchResult = lowercasedText.contains(search);
        System.out.println("The first line contains your search: " + searchResult);

        Integer index = lowercasedText.indexOf(search);
        Integer length = search.length();
        System.out.println("The search term is at the " + index + "index of the sentence; it's length is " + length + " characters")
        String moddedString = lowercasedText.replace(search, "" );
        System.out.println(moddedString);
    }
}
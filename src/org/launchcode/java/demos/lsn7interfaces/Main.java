package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Flavors Comparator---");
        System.out.println(flavors);



        Comparator comparator2 = new ConeComparator();

        cones.sort(comparator2);
        System.out.println("Cone Comparator---");
        System.out.println(cones);
    }
}

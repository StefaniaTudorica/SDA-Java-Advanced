package ro.sda.stefania.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Create a set consisting of colors - given from the user.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("blue");
        colors.add("blue");
        colors.add("green");
        colors.add("pink");
        colors.add("pink");
        System.out.println(colors);

        String color = "violet";
        if (colors.contains(color)) {
            System.out.println(color);
        }
        for (String color1 : colors) {
            if (color1.startsWith("p")) {
                System.out.println(color1);
            }
        }
        colors.remove("green");
        if (colors.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("list is not empty");
        }

        Set<String> otherColors = new HashSet<>();
        otherColors.add ("brown");
        otherColors.add ("orange");
        colors.addAll(otherColors);
        System.out.println(colors);
        otherColors.containsAll(colors);
        System.out.println(otherColors.containsAll(colors));
        otherColors.removeAll(colors);
        System.out.println(otherColors);
        otherColors.containsAll(colors);
    }
}

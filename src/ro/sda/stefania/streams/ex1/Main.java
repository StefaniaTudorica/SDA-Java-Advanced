package ro.sda.stefania.streams.ex1;

/**
 * 1. Using streams, for a given lists:
 * - [„John”, „Sarah”, „Mark”, „Tyla”, „Ellisha”, „Eamonn”]
 * - [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
 * a) Sort the list.
 * b) Print only those names, that start with „E” letter.
 * c) Print values greater than 30 and lower than 200.
 * d) Print names uppercase.
 * e) Remove first and last letter, sort and print names.
 * f) *Sort backwards by implementing reverse Comparator and using lambda expression.
 * white_check_mark
 * eyes
 * raised_hands
 */

import javax.xml.namespace.QName;
import java.util.*;

public class Main {
    private static final List<String>  NAMES = new ArrayList<>();
    static {
        NAMES.add("Andreea");
        NAMES.add("Mihai");
        NAMES.add("Ioana");
        NAMES.add("Gigel");
        NAMES.add("Maria");

    }
    private static final List<Integer> NUMBERS = Arrays.asList(
            1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50
    );
    public static void main(String[] args) {
    NAMES.stream()
            .sorted()
            .forEach(System.out::println);

        System.out.println("=============");
    NUMBERS.stream()
            .sorted()
            .forEach(System.out::println);
        System.out.println("=============");
        NAMES.stream()
                .filter(name -> name.startsWith("M"))
                .forEach(name -> System.out.println(name));
        NUMBERS.stream()
                .filter(number -> number>30 && number<200)
                .forEach(number -> System.out.println(number));
        System.out.println("=================");
        NAMES.stream()
                .map(name -> name.toUpperCase(Locale.ROOT))
                .forEach(name -> System.out.println(name));
        System.out.println("=================");
        NAMES.stream()
                .map(name -> name.substring(1, name.length()-1))
                .sorted()
                .forEach(System.out::println);
        System.out.println("=================");
        NUMBERS.stream()
                .filter(number -> number != 0)
                .sorted((number1, number2) -> number1.compareTo(number2)) // Comparator.reverseOrder()
                .forEach(number -> System.out.println(number));
        System.out.println("=================");
        NUMBERS.stream()
                .filter(number -> number == 50)
                .findAny()
                .ifPresent(number -> System.out.println(number));
        System.out.println("=================");
        boolean exists = NUMBERS.stream()
                .anyMatch(number -> number == 50);
        System.out.println(exists);
    }

}

package ro.sda.stefania.enums.ex1;

import java.util.Scanner;

/**1. Create enum Planets.
 a) Override toString method. It should print relative size of a planet and it’s name.
 E.g. „Huge Jupiter”, „Small Pluto”.
 b)  Create distanceFromEarth method.
 c) Verify both methods for multiple planets.
 */

public class Main {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (Planet planet: planets){
            System.out.println(planet.name());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert planet:");
        String planetName = scanner.nextLine().toUpperCase().trim();
        Planet planet = Planet.valueOf(planetName);
        System.out.println(planet);
        System.out.println(planet.getDistanceFromEarth());
    }
}

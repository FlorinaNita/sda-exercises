package enums.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert the name of the planet ");

        Scanner scanner = new Scanner(System.in);
        String planetName = scanner.nextLine().toUpperCase(Locale.ROOT);

        try {
            Planets planet = Planets.valueOf(planetName);
            System.out.println(planet);
            System.out.println("The distance from Earth to planet is " + planet.distanceFromEarth());
        } catch (IllegalArgumentException exception) {
            for(Planets planet : Planets.values()){
                System.out.println(planet);
            }
        }
    }
}

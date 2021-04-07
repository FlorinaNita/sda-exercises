package enums.exercises;

public enum Planets {

    JUPITER("Jupiter", 135),
    PLUTO("Pluto", 124),
    EARTH("Earth", 115);

    private String name;
    private double dimension;
    private double distanceFromEarth;


    Planets(String name, double dimension) {
        this.name = name;
        this.dimension = dimension;
    }

    public double distanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return "Planets name is " + name +
                " and dimension: " + dimension;
    }
}

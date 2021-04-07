package abstractclassexercises;

public abstract class Shape {

    private int numberSides;

    public Shape(int numberSides){
        this.numberSides = numberSides;
    }

    public int getNumberSides() {
        return numberSides;
    }

    public abstract int getArea();

    public abstract int getPerimeter();


}

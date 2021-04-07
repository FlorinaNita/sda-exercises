package inheritance.exercise1;

public final class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super(length * width, (2 * (length + width)));
        this.length = length;
        this.width = width;
//        super.area = length * width;   daca sunt in clasa parinte variabile cu protected
//        super.perimeter = 2 * (length + width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

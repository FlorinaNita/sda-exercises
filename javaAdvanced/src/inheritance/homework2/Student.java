package inheritance.homework2;

public class Student {
    private final int ticks;

    public Student(int ticks) {
        this.ticks = ticks;
    }

    public boolean pass(int numberOfCredits) {
        if(numberOfCredits == ticks) {
            return true;
        } else {
            return false;
        }
    }
}

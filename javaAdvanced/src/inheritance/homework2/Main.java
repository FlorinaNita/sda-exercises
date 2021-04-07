package inheritance.homework2;

public class Main {

    public static void main(String[] args) {
        Student student1 = new ComputerScience(6);
        Student student2 = new NS(4);

        System.out.println( "This student from CS will pass " + student1.pass(6));
        System.out.println("This student from NS will pass " + student2.pass(6));
    }
}

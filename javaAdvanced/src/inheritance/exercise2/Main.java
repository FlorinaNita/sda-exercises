package inheritance.exercise2;

public class Main {

    public static void main(String[] args) {

        Animals[] animals = new Animals[4];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Animals();
        animals[3] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal at index " + i + " yieldVoice is " + animals[i].yieldVoice());
        }

    }
}

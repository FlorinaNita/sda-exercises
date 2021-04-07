package inheritance.homework1;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(25632.25,2010,"2542658412");
        Employee employee2 = new Employee(5000,2012,"35648569");

        employee1.setName("George");
        employee2.setName("Alina");

        System.out.println(employee1);
        System.out.println(employee2);
    }



}

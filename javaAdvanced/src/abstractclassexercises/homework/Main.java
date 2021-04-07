package abstractclassexercises.homework;

public class Main {
    public static void main(String[] args) {
        Bank[] bank = new Bank[] {
                new BankA(),
                new BankB(),
                new BankC()
        };

        for(Bank b : bank) {
            System.out.println("Bank " + b + b.getBalance());
        }
    }
}

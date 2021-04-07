package inheritance.homework1;

public class Employee extends Person{
    private double annualSalary;
    private int startingWorkYear;
    private String insuranceNumber;


    public Employee(double annualSalary, int startingWorkYear, String insuranceNumber) {
        super("default");
        this.annualSalary = annualSalary;
        this.startingWorkYear = startingWorkYear;
        this.insuranceNumber = insuranceNumber;
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartingWorkYear() {
        return startingWorkYear;
    }

    public void setStartingWorkYear(int startingWorkYear) {
        this.startingWorkYear = startingWorkYear;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: " + getName() +
                " annualSalary = " + annualSalary +
                ", startingWorkYear = " + startingWorkYear +
                ", insuranceNumber ='" + insuranceNumber + '\'' +
                '}';
    }
}

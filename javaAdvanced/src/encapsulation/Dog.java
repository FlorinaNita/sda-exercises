package encapsulation;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;

    public Dog(String name, int age, String gender, String race) {
        this.name = name;
        this.age = age;
        if(gender == "f" || gender == "M"){
            this.gender = gender;
        } else {
           //System.out.println("Invalid gender");
            throw new IllegalStateException("Invalid gender");
        }
        this.race = race;
    }

    public Dog(String gender, String race) {
        this("Azorica",12, gender, race);
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }
}

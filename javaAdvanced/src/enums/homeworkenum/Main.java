package enums.homeworkenum;

public class Main {
    public static void main(String[] args) {

        Weekday[] weekday = Weekday.values();

        for (Weekday day:weekday) {
            if(day.isHoliday(day)){
                System.out.println(day + " is holiday");
            } else {
                System.out.println(day + "is weekday");
            }
        }
    }
}

package enums.homeworkenum;

import java.lang.reflect.Modifier;

public enum Weekday {

    MONDAY("Monday", true),
    TUESDAY("Tuesday", true),
    WEDNESDAY("Wednesday", true),
    THURSDAY("Thursday", true),
    FRIDAY("Friday", true),
    SATURDAY("Saturday", false),
    SUNDAY("Sunday", false);

    private String weekDay;
    private boolean isWeekDay;

    Weekday(String weekDay, boolean isWeekDay) {
        this.weekDay = weekDay;
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }

    public boolean isHoliday(Weekday weekday) {
       return !isWeekDay;
    }

    @Override
    public String toString() {
        return "Weekday{" +
                "weekDay='" + weekDay + '\'' +
                '}';
    }
}

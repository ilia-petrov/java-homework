import java.util.Date;

public class Time {
    private int hour, minute, second;

    public Time() {
        Date currentTime = new Date();
        hour = currentTime.getHours();
        minute = currentTime.getMinutes();
        second = currentTime.getSeconds();
    }

    public Time(long time) {
        Date currentTime = new Date(time);
        hour = currentTime.getHours();
        minute = currentTime.getMinutes();
        second = currentTime.getSeconds();
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        Date currentTime = new Date(elapseTime);
        hour = currentTime.getHours();
        minute = currentTime.getMinutes();
        second = currentTime.getSeconds();
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(12, 40, 5);
        Time t3 = new Time(555550000);

        System.out.printf("%d %d %d\n", t1.getHour(), t1.getMinute(), t1.getSecond());
        System.out.printf("%d %d %d\n", t2.getHour(), t2.getMinute(), t2.getSecond());
        System.out.printf("%d %d %d\n", t3.getHour(), t3.getMinute(), t3.getSecond());
        t2.setTime(555550000);
        System.out.printf("%d %d %d\n", t2.getHour(), t2.getMinute(), t2.getSecond());
    }
}

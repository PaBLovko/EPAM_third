package by.epam.intro.task4;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    private boolean trueHour(int hour){
        return hour <= 24;
    }
    private boolean trueMinute(int minute){
        return minute <= 60;
    }
    private boolean trueSecond(int second){
        return second <= 60;
    }

    public void setHour(int hour) {
        this.hour=trueHour(hour) ? hour : 0;
    }

    public void setMinute(int minute) {
        this.minute=trueMinute(minute) ? minute : 0;
    }

    public void setSecond(int second) {
        this.second=trueSecond(second) ? second : 0;
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

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
}
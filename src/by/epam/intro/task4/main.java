package by.epam.intro.task4;

public class main {
    public static void main(String[]args){
        Clock clock = new Clock(24, 60, 60);
        System.out.println(clock.getHour()+" "+clock.getMinute()+" "+clock.getSecond());
        clock.setTime(25,60,49);
        System.out.println(clock.getHour()+" "+clock.getMinute()+" "+clock.getSecond());
    }
}

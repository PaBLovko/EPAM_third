package by.epam.intro.task3;

import java.util.Random;

public class Counter
{
    private int lowLimit = 1;
    private int upLimit = 60;
    private int number = 30;

    public Counter(int lowLimit, int upLimit, int current) {
        this.lowLimit = lowLimit;
        this.upLimit = upLimit;
        number = current;
    }
    public Counter() {
        lowLimit = 3;
        upLimit = 50;
        number = new Random().nextInt(upLimit - lowLimit);
    }
    public void increaseNumber() {
        if (number < upLimit) number++;
    }
    public void decreaseNumber() {
        if (number > lowLimit) number--;
    }

    int getLowLimit(){
        return lowLimit;
    }
    int getUpLimit(){
        return upLimit;
    }
    int getNumber(){
        return number;
    }
}

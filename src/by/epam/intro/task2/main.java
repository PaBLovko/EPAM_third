package by.epam.intro.task2;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        TrainArray trainArray = new TrainArray();
        trainArray = trainArray.sortByNumber();
        trainArray = trainArray.sortByDestination();
        System.out.println("Введите номер поезда");
        int trainNumber = in.nextInt();
        Train foundTrain = trainArray.findTrain(trainNumber);
        System.out.println(foundTrain.getTrainNumber() + " " + foundTrain.getDestination() + " " + foundTrain.getDepartureTime());
    }
}

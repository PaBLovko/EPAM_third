package by.epam.intro.task2;

import java.util.Arrays;
import java.util.Comparator;

public class TrainArray {
    private Train[] trainArray = new Train[5];

    public TrainArray() {
        trainArray[0] = new Train("Витебск", 703, 160);
        trainArray[1] = new Train("Гродно", 701, 200);
        trainArray[2] = new Train("Минск", 702, 240);
        trainArray[3] = new Train("Гомель", 705, 230);
        trainArray[4] = new Train("Минск", 706, 10);
    }

    public  TrainArray(Train[] trainArray, int length){
        this.trainArray = new Train[length];
        for(int i = 0; i < length; i++){
            this.trainArray[i] = trainArray[i];
        }
    }

    public Train findTrain(int trainNumber) {
        for (int i = 0; i < trainArray.length; i++) {
            if (trainArray[i].getTrainNumber() == trainNumber)
                return trainArray[i];
        }
        return null;
    }

    public TrainArray sortByNumber() {
        Train trainBuffer = new Train();
        for (int i = 0; i < trainArray.length - 1; i++) {
            if (trainArray[i].getTrainNumber() > trainArray[i+1].getTrainNumber()){
                trainBuffer = trainArray[i];
                trainArray[i] = trainArray[i+1];
                trainArray[i+1] = trainBuffer;
            }
        }
        return new TrainArray(trainArray, trainArray.length);
    }

    public TrainArray sortByDestination() {
        Arrays.sort(trainArray, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())) {
                    Integer x1 = ((Train) o1).getDepartureTime();
                    Integer x2 = ((Train) o2).getDepartureTime();
                    return x1.compareTo(x2);
                } else
                    return o1.getDestination().compareTo(o2.getDestination());
            }
        });
        return new TrainArray(trainArray, trainArray.length);
    }
}

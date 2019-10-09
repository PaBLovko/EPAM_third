package by.epam.intro.task2;

public class Train {
    private String destination;
    private int trainNumber;
    private int departureTime;

    public Train() {}

    public Train(String destination, int trainNumber, int departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getDepartureTime() {
        return departureTime;
    }
}

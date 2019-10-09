package by.epam.intro.task1;

public class Student {
    private String secondName;
    private String initials;
    private int groupNumber;
    private int[] performance;

    public Student(String secondName, String initials, int groupNumber, int[] performances) {
        this.groupNumber = groupNumber;
        this.initials = initials;
        this.secondName = secondName;
        this.performance = performances;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getInitials(){
        return initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }

    public boolean excellentStudent(){
        for (int i = 0; i < performance.length; i++)
            if(performance[i] < 9) return false;
        return true;
    }
}

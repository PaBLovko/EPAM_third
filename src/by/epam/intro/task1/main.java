package by.epam.intro.task1;

public class main {
    public static void main(String[]args){
        Student[] studentArray = new Student[10];
        studentArray[0] = new Student("Кожемякин", "П.Н.", 750504, new int[]{1,1,1,1,1});
        studentArray[1] = new Student("Кожемякин", "П.Н.", 750504, new int[]{2,2,2,2,2});
        studentArray[2] = new Student("Кожемякин", "П.Н.", 750504, new int[]{3,3,3,3,3});
        studentArray[3] = new Student("Кожемякин", "П.Н.", 750504, new int[]{4,4,4,4,4});
        studentArray[4] = new Student("Кожемякин", "П.Н.", 750504, new int[]{5,5,5,5,5});
        studentArray[5] = new Student("Кожемякин", "П.Н.", 750504, new int[]{6,6,6,6,6});
        studentArray[6] = new Student("Кожемякин", "П.Н.", 750504, new int[]{7,7,7,7,7});
        studentArray[7] = new Student("Кожемякин", "П.Н.", 750504, new int[]{8,8,8,8,8});
        studentArray[8] = new Student("Кожемякин", "П.Н.", 750504, new int[]{9,9,9,9,9});
        studentArray[9] = new Student("Кожемякин", "П.Н.", 750504, new int[]{10,10,10,10,10});
        for (int i = 0; i < 10; i++) {
            if (studentArray[i].excellentStudent()) {
                System.out.println(studentArray[i].getSecondName()+" "+studentArray[i].getGroupNumber());
            }
        }
    }
}

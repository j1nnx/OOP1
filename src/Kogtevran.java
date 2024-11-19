public class Kogtevran extends Hogwarts{
    private int smart;
    private int mudras;
    private int witty;
    private int full_of_creativity;

    public Kogtevran
            (String fullname, int magicPower, int transgretionDistance, int smart, int mudras, int witty, int full_of_creativity){
        super(fullname, magicPower, transgretionDistance);
        this.smart = smart;
        this.mudras = mudras;
        this.witty = witty;
        this.full_of_creativity = full_of_creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getMudras() {
        return mudras;
    }

    public int getWitty() {
        return witty;
    }

    public int getFull_of_creativity() {
        return full_of_creativity;
    }

    public static void comparingStudents(Kogtevran firstStundent, Kogtevran secondStudent){
        int totalFirst = 0;
        int totalSecond = 0;
        totalFirst += firstStundent.smart + firstStundent.mudras + firstStundent.witty + firstStundent.full_of_creativity;
        totalSecond += secondStudent.smart + secondStudent.mudras + secondStudent.witty + secondStudent.full_of_creativity;
        if (totalFirst > totalSecond){
            System.out.println(firstStundent.getFullname() + " лучше чем, " + secondStudent.getFullname());
        } else if (totalFirst < totalSecond){
            System.out.println(secondStudent.getFullname() + " лучше чем, " + firstStundent.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }

    }
}
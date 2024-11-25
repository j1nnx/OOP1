import java.sql.SQLOutput;
import java.util.Random;


public abstract class Hogwarts {
    private final String fullname;
    private final int magicPower;
    private final int transgretionDistance;

    public Hogwarts(String fullname) {
        this.fullname = fullname;
        Random random = new Random();
        magicPower = random.nextInt(100);
        transgretionDistance = random.nextInt(100);
    }


    public Hogwarts(String fullname, int magicPower, int transgretionDistance){
        this.fullname = fullname;
        this.magicPower = magicPower;
        this.transgretionDistance = transgretionDistance;
    }

    public String getFullname() {
        return fullname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgretionDistance() {
        return transgretionDistance;
    }

    public int getScore(){
        return magicPower + transgretionDistance;
    }
    public void comparingStudents(Hogwarts student) {
        if (this.getScore() > student.getScore()){
            System.out.println(this.fullname + " сильнее " + student.getFullname());
        } else {
            System.out.println(student.getFullname() + " сильнее чем, " + this.fullname);
        }
    }

    public void describeStudent() {
        System.out.println(magicPower + " " + transgretionDistance);
    }
}
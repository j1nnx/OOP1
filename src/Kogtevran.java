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

    @Override
    public int getScore() {
        return smart + mudras + witty + full_of_creativity;
    }

    @Override
    public void describeStudent() {
        System.out.println("Kogtevran " + getScore());;
    }

    public void comparingStudents(Kogtevran student){
        if (this.getScore() > student.getScore()){
            System.out.println(this.getFullname() + " лучший когтевранец, чем  " + student.getFullname());
        } else {
            System.out.println(student.getFullname() + " лучший когтевранец, чем " + this.getFullname());
        }
    }
}
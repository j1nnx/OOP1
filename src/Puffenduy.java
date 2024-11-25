public class Puffenduy extends Hogwarts{
    private int hardworking;
    private int faithful;
    private int honest;

    public Puffenduy
            (String fullname, int magicPower, int transgretionDistance, int hardworking, int faithful, int honest){
        super(fullname, magicPower, transgretionDistance);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public int getScore() {
        return hardworking + faithful + honest;
    }

    @Override
    public void describeStudent() {
        System.out.println("Puffenduy " + getScore());;
    }

    public void comparingStudents(Puffenduy student){
        if (this.getScore() > student.getScore()){
            System.out.println(this.getFullname() + " лучший пофендуй, чем  " + student.getFullname());
        } else {
            System.out.println(student.getFullname() + " лучший пофендуй, чем " + this.getFullname());
        }
    }
}
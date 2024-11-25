public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor
            (String fullname, int magicPower, int transgretionDistance, int nobility, int honor, int bravery) {
        super(fullname, magicPower, transgretionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public int getScore() {
        return nobility + honor + bravery;
    }

    @Override
    public void describeStudent() {
        System.out.println("Grifindor " + getScore());;
    }

    public void comparingStudents(Griffindor student){
        if (this.getScore() > student.getScore()){
            System.out.println(this.getFullname() + " лучший грифиндорец, чем  " + student.getFullname());
        } else {
            System.out.println(student.getFullname() + " лучший грифиндорец, чем " + this.getFullname());
        }
    }
}

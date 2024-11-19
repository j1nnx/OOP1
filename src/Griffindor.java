public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor
            (String fullname, int magicPower, int transgretionDistance, int nobility, int honor, int bravery){
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

    public static void comparingStudents(Griffindor firstStudents, Griffindor secondStudents){
        int totalFirst = 0;
        int totalSecond = 0;
        totalFirst += firstStudents.honor + firstStudents.bravery + firstStudents.nobility;
        totalSecond += secondStudents.honor + secondStudents.bravery + secondStudents.nobility;
        if (totalFirst > totalSecond){
            System.out.println(firstStudents.getFullname() + " лучше грифиндорец чем, " + secondStudents.getFullname());
        } else if (totalFirst < totalSecond) {
            System.out.println(secondStudents.getFullname() + " лучше грифиндорец чем, " + firstStudents.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
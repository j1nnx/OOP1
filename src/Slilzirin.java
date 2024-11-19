public class Slilzirin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lust_for_power;

    public Slilzirin
            (String fullname, int magicPower, int transgretionDistance, int cunning, int determination, int ambition, int resourcefulness, int lust_for_power){
        super(fullname, magicPower, transgretionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lust_for_power = lust_for_power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLust_for_power() {
        return lust_for_power;
    }

    public static void comparingStudents(Slilzirin firstStudent, Slilzirin secondStudent){
        int totalFirst = 0;
        int totalSecond = 0;
        totalFirst += firstStudent.cunning + firstStudent.determination + firstStudent.ambition + firstStudent.resourcefulness + firstStudent.lust_for_power;
        totalSecond += secondStudent.cunning + secondStudent.determination + secondStudent.ambition + secondStudent.resourcefulness + secondStudent.lust_for_power;
        if (totalFirst > totalSecond){
            System.out.println(firstStudent.getFullname() + " лучше чем, " + secondStudent.getFullname());
        } else if (totalFirst < totalSecond) {
            System.out.println(secondStudent.getFullname() + " лучше чем, " + secondStudent.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}

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

    @Override
    public int getScore() {
        return cunning + determination + ambition + resourcefulness + lust_for_power;
    }

    @Override
    public void describeStudent() {
        System.out.println("Slizirin " + getScore());;
    }

    public void comparingStudents(Slilzirin student){
        if (this.getScore() > student.getScore()){
            System.out.println(this.getFullname() + " лучший слизирин, чем  " + student.getFullname());
        } else {
            System.out.println(student.getFullname() + " лучший слизирин, чем " + this.getFullname());
        }
    }
}

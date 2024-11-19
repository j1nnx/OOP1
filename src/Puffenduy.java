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

    public static void comparingStudents(Puffenduy firstStudents, Puffenduy secondStudents){
        int totalFirst = 0;
        int totalSecond = 0;
        totalFirst += firstStudents.faithful + firstStudents.honest + firstStudents.hardworking;
        totalSecond += secondStudents.faithful + firstStudents.honest + firstStudents.hardworking;
        if (totalFirst > totalSecond){
            System.out.println(firstStudents.getFullname() + " лучше Пуффендуй чем, " + secondStudents.getFullname());
        } else if (totalFirst < totalSecond) {
            System.out.println(secondStudents.getFullname() + " лучше Пуффендуй чем, " + firstStudents.getFullname());

        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
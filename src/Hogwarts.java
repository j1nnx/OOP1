public class Hogwarts {
    private final String fullname;
    private final int magicPower;
    private final int transgretionDistance;

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

    public static void comparisonHogwartsStudents(Hogwarts firstsStudent, Hogwarts secondStudent) {

        if (firstsStudent.magicPower > secondStudent.magicPower) {
            System.out.println(firstsStudent.fullname + " сильнее чем " + secondStudent.fullname + " в магической силе");
        } else if (secondStudent.magicPower > firstsStudent.magicPower) {
            System.out.println(secondStudent.fullname + " сильнее чем " + firstsStudent.fullname + " в магической силе");
        } else {
            System.out.println("силы " + firstsStudent.fullname + " такие же как у  " + secondStudent.fullname);
        }

        if (firstsStudent.transgretionDistance > secondStudent.transgretionDistance) {
            System.out.println(firstsStudent.fullname + " сильнее чем  " + secondStudent.fullname + " в трансгрессии");
        } else if (secondStudent.transgretionDistance > firstsStudent.transgretionDistance) {
            System.out.println(secondStudent.fullname + " сильнее чем " + firstsStudent.fullname + " в трансгрессии");
        } else {
            System.out.println("силы у  " + firstsStudent.fullname + "в трансгрессии такие же как " + secondStudent.fullname);
        }
    }

    public static void describeStudent(Hogwarts Student){
        if (Student instanceof Griffindor){
            Griffindor student = (Griffindor) Student;
            System.out.println("У студента " + student.getFullname() + " " + student.getMagicPower()
                    + " магической силы и " + student.getTransgretionDistance() + " расстояние трансгресии и " + " столько благородства, чести и храбрости " +
                    student.getHonor() + ", " + student.getBravery() + ", " + student.getNobility());
        } else if (Student instanceof Puffenduy) {
            Puffenduy students = (Puffenduy) Student;
            System.out.println("У студента " + students.getFullname() + " " + students.getMagicPower()
                    + " магической силы и " + students.getTransgretionDistance() + " расстояние трансгресии и " + " трудолюбивы, верны, честны " +
                    students.getHardworking() + ", " + students.getFaithful() + ", " + students.getHonest());
        } else if (Student instanceof Kogtevran) {
            Kogtevran students = (Kogtevran) Student;
            System.out.println("У студента " + students.getFullname() + " " + students.getMagicPower()
                    + " магической силы и " + students.getTransgretionDistance() + " расстояние трансгресии и " + " умны, мудры, остроумны и полны творчества " +
                    students.getSmart() + ", " + students.getMudras() + ", " + students.getWitty() + ", " + students.getFull_of_creativity());
        } else if (Student instanceof Slilzirin) {
            Slilzirin students = (Slilzirin) Student;
            System.out.println("У студента " + students.getFullname() + " " + students.getMagicPower()
                    + " магической силы и " + students.getTransgretionDistance() + " расстояние трансгресии и " + " хитрость, решительность, амбициозность, находчивость и жажда власти " +
                    students.getCunning() + ", " + students.getDetermination() + ", " + students.getAmbition() + ", " + students.getResourcefulness() + ", " + students.getLust_for_power());
        }
    }
}
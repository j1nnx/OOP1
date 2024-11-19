public class Main {
    public static void main(String[] args) {
        Griffindor hermoine = new Griffindor("Гермиона Грейнджер", 70, 35, 7, 6, 6);
        Griffindor poter = new Griffindor("Гарри Поттер", 85, 45, 8, 9, 5);
        Hogwarts.describeStudent(hermoine);
        Hogwarts.comparisonHogwartsStudents(hermoine, poter);
        Griffindor.comparingStudents(hermoine, poter);
        Puffenduy cedric = new Puffenduy("Седрик Диггори", 88, 55, 6, 7, 8);
        Hogwarts.comparisonHogwartsStudents(cedric, poter);
    }
}
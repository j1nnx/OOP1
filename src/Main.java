public class Main {
    public static void main(String[] args) {
        Griffindor hermoine = new Griffindor("Гермиона Грейнджер", 70, 35, 7, 6, 6);
//        Hogwarts johnCivilskiy = new Hogwarts("John Civilskiy");
//        Hogwarts anna = new Hogwarts("Anna Ruzenshtein");
//        johnCivilskiy.comparingStudents(anna);
//        johnCivilskiy.describeStudent();
        Griffindor poter = new Griffindor("Гарри Поттер", 85, 45, 8, 9, 5);
        hermoine.comparingStudents(poter);
        poter.comparingStudents((Hogwarts) hermoine);
        Puffenduy cedric = new Puffenduy("Седрик Диггори", 88, 55, 6, 7, 8);
        cedric.comparingStudents(poter);
    }
}
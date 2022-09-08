public class App {
    public static void main(String[] args) {

        Student cyn = new Student();

        cyn.surname = " Rigor";
        cyn.firstname = "Francyne ";
        cyn.middleInitial = "W.";
        cyn.dateOfBirth = "August 16, 2004";
        cyn.studentNumber = 2022103324;
        cyn.studentEmailAddress = "rigorfw@students.national-u.edu.ph";
        cyn.iAmAwesome = true;
        cyn.sayMyName();
        cyn.sayMyStudentNumber();
        cyn.sayMyEmailAddress();
        cyn.sayiAmAwesome();

    }
}

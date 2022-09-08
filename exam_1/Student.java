public class Student {
    String surname;
    String firstname;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyName() {
        System.out.println("My name is " + firstname + surname);
    }

    public void sayMyStudentNumber() {
        System.out.println("My student number is " + studentNumber);
    }

    public void sayMyEmailAddress() {
        System.out.println("My student email address is " + studentEmailAddress);
    }

    public void sayiAmAwesome() {
        System.out.println("I'm awesome. " + iAmAwesome);
    }
}

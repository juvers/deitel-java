package Chapter4;

public class StudentTest {
    public static void main(String[] args) {
        Student Jude = new Student("Jude", 75);
        Student Simon = new Student("Simon", 96);

        System.out.printf("%s has a score of %.2f and has a grade of %s%n", Jude.getName(), Jude.getAverage(),
                Jude.getLetterGrade());

        System.out.printf("%s has a score of %.2f and has a grade of %s%n", Simon.getName(), Simon.getAverage(),
                Simon.getLetterGrade());
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(new Student(1, "A", 77.5));
        studentManager.addStudent(new Student(2, "B", 65.0));
        studentManager.addStudent(new Student(3, "C", 55.0));
        studentManager.addStudent(new Student(4, "D", 92.3));
        studentManager.addStudent(new Student(5, "Aa", 74.0));

        System.out.println("Students with average greater than 75:");
        studentManager.getStudents(s -> s.getAverageScore() > 75).forEach(System.out::println);

        System.out.println("\nStudent with name 'A':");
        studentManager.getStudents(s -> s.getName().startsWith("A")).forEach(System.out::println);

        System.out.println("\nStudents with average less than 60:");
        studentManager.getStudents(s -> s.getAverageScore() < 60).forEach(System.out::println);
    }
}
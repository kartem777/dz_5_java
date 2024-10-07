import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentManager {
    private Map<Integer, Student> studentsMap;

    public StudentManager() {
        studentsMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentsMap.put(student.getId(), student);
    }

    public List<Student> getStudents(Predicate<Student> predicate) {
        return studentsMap.values().stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

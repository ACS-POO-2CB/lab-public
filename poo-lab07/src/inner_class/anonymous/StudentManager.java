/**
 * UPB, ACS, POO CB 2022-2023
 * @author Gabriel Gutu-Robu
 *
 * YOU MAY MODIFY THIS FILE TO RUN MORE TESTS
 */
package inner_class.anonymous;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private IDatabase database;
    private List<Student> students;

    public StudentManager(IDatabase database) {
        this.students = new ArrayList<>();
        this.database = database;
    }

    public boolean insertStudent(Student student) {
        boolean result;
        this.database.connect();
        this.database.insert(student);
        if (students.contains(student)) result = false;
        else result = students.add(student);
        this.database.disconnect();
        return result;
    }

    public boolean updateStudent(Student student, Student newStudent) {
        boolean result;
        this.database.connect();
        this.database.update(student);
        if (!students.contains(student)) result = false;
        else {
            Student oldStudent = students.set(students.indexOf(student), newStudent);
            result = oldStudent == student;
        }
        this.database.disconnect();
        return result;
    }

    public boolean deleteStudent(Student student) {
        boolean result;
        this.database.connect();
        this.database.delete(student);
        if (!students.contains(student)) result = false;
        else result = students.remove(student);
        this.database.disconnect();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students)
        {
            sb.append(student + "\t");
        }
        return "StudentManager contains " +
                "students: " + sb.toString();
    }

    public void runSomeTests() {
        Student studentVasile = new Student("Vasile");
        Student studentGigel = new Student("Gigel");
        Student studentFlorina = new Student("Florina");

        this.insertStudent(studentVasile);
        System.out.println(this);
        this.deleteStudent(studentGigel);
        System.out.println(this);
        this.updateStudent(studentVasile, studentFlorina);
        System.out.println(this);
        this.insertStudent(studentVasile);
        System.out.println(this);
        this.deleteStudent(studentFlorina);
        System.out.println(this);
        this.insertStudent(studentGigel);
        System.out.println(this);

    }

}

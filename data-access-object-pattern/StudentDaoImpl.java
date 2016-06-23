import java.util.List;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao {
    List<Student> students;


    public StudentDaoImpl(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("Jonh", 1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public void deleteStudent(Student student){
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    @Override
    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public void updateStudent(Student student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No" + student.getRollNo()
                           + ", updated in the database");
    }
}

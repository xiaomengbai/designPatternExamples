import java.util.List;
import java.util.ArrayList;

public class StudentBO {
    List<StudentVO> students;

    public StudentBO(){
        students = new ArrayList<StudnetVO>();
        StudentVO student1 = new StudentVO("Robert", 0);
        StudnetVO studnet2 = new StudentVO("John", 1);
        studnets.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student){
        studnets.remove(student.getRollNo());
        System.out.println("Studnet: Roll No "
                           + student.getRollNo() + ", deleted from database");
    }

    public List<StudentVO> getAllStudents(){
        return students;
    }

    public StudentVO getStudent(int rollNo){
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + studnet.getRollNo()
                           + ", updated in the database");
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student firststudent = new Student("Василий","Иванов","3A",5);
        Aspirant secondstudent = new Aspirant("Фракталы","Иван","Петров","3B",5);
        Student thirdtstudent = new Student("Пётр","Сидоров","3A",4.9);
        Aspirant fourthstudent = new Aspirant("Алгоритмы","Станислав","Михайлов","3B",2.2);

        students.add(firststudent);
        students.add(secondstudent);
        students.add(thirdtstudent);
        students.add(fourthstudent);



        for (Student student:students){
            student.getScholarship();
        }
    }
}

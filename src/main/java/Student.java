public class Student implements Scholarship {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }



    @Override
    public void getScholarship() {
     double sum;
     if (averageMark < 5) {
         sum = 80;
     } else {
         sum = 100;
     }

        //System.out.println("Размер степендии " + sum);

        System.out.println("Имя студента - " + firstName + ";" + " Размер стерендии " + sum + ";");

    }
}


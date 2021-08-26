public class Aspirant extends Student {
    String scientificWork;
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Aspirant(String scientificWork, String firstName, String lastName, String group, double averageMark) {
        this.scientificWork = scientificWork;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    @Override
    public void getScholarship() {
        double sum;
        if (averageMark < 5) {
            sum = 180;
        } else {
            sum = 200;
        }

        System.out.println("Имя студента - " + firstName + ";" + " Размер стерендии " + sum + ";");
        //System.out.println("Размер степендии " + sum);

    }



}

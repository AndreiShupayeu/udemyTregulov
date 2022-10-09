package home_work22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
       StringBuilder name2=new StringBuilder(name);
        return name2;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4)
            this.course = course;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10)
            this.grade = grade;
    }
    public void showInfo(){
        System.out.println("Student's name: "+getName());
        System.out.println("Student's course: "+getCourse());
        System.out.println("Student's grade: "+ getGrade());
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student student=new Student();
        student.setCourse(4);
        student.setGrade(10);
        student.setName(new StringBuilder("Konstantin"));
        student.showInfo();
    }
}

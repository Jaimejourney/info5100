public class Course {
    private int Max_Number = 10;
    private String name;
    private int numberOfStudents;
    private Student[] students;

    public Course(String name) {
        this.name = name;
        students = new Student[Max_Number];
    }

    public Student[] getStudents(){
        Student[] curr = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            curr[i] = students[i];
        }
        return curr;
    }

    public Boolean isFull(){
        return numberOfStudents == Max_Number;
    }

    public void registerStudent(Student student){
        if(!isFull()){
            students[numberOfStudents++] =student;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudents;
    }

}

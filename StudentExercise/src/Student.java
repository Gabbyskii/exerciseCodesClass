import java.util.ArrayList;

public class Student {
    private String name; //get + set
    private int age; //get + set
    private String id; //get only
    private ArrayList<Integer> grades = new ArrayList<>(); //get only

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void getGrades(){

    }

    public void addGrade(int grade) {

    }

    public double calculateAverageGrade(){
        double sum = 0;
        for(Integer grade: grades){
            sum += grade;
        }
        return sum/grades.size();
    }
}


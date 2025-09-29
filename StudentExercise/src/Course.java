import java.util.ArrayList;

 public class Course {
        private String name; //get + set
        private ArrayList<Student> students = new ArrayList<>(); //get only
        private Teacher teacher; //get + set

        public Course(String name, Teacher teacher) {
            this.name = name;
            this.teacher = teacher;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void getTeacher() {
           //????
        }

}

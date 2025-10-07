//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Student student = new Student("Peter", 42, "cph-petl");
         System.out.println("Student hedder: "+ student.getName()+ " og er "+ student.getAge()+ " år gammel.");

        //giv student tre karakterer, og beregn gennemsnittet og udskriv det
         student.addGrade(7);
         student.addGrade(4);
         student.addGrade(2);

        double avg = student.calculateAverageGrade();

        System.out.println("Karaktergennemsnit: " + avg);
        }


    }
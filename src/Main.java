import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StudentFactory studentFactory = new StudentFactory();
        Student student1 = studentFactory.getStudent("SCHOOL");
        Student student2 = studentFactory.getStudent("DISTANCE");

        System.out.println("Choose category: DISTANCE/SCHOOL");
        String category = scan.nextLine();
        if(category.equalsIgnoreCase("SCHOOL")) {
            student1.studentRegistration();
        } else if(category.equalsIgnoreCase("DISTANCE")) {
            student2.studentRegistration();
        }
    }
}
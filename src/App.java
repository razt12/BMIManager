import java.util.Scanner;

/**
 * Created by jc260754 on 16/03/15.
 */

public class App {
    public static void main(String[] args) {
        Patient patient = new Patient();
        running: while (true) {
        System.out.println("BMI Manager");
        System.out.println("Please select from the " +
            "following menu options:\n" +
            "\t(1) Add new patient\n" +
            "\t(2) View patient\n" +
            "\t(3) Exit\n");
        System.out.println("Enter choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1: {
                System.out.println("Please enter the patients name: ");
                String name = scanner.next();
                patient.setName(name);
                System.out.println("Please enter the patients age: ");
                int age = scanner.nextInt();
                patient.setAge(age);
                System.out.println("Please enter the patients height: ");
                double height = scanner.nextDouble();
                System.out.println("Please enter the patients weight: ");
                double weight = scanner.nextDouble();
                patient.setDetails(height, weight);
                break;
            }
            case 2: {
                System.out.println("Name: "+ patient.getName() + "\nAge: "+ patient.getAge()+ "\nBMI: "+ patient.getBMI()+"\n");
                break;
            }
            case 3: {
                System.out.println("Goodbye!");
                break running;
            }
            }
        }
    }
}

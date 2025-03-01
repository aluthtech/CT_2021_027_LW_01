package Q_03;
import java.util.Scanner;
public class question_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        String middleInitial = middleName.isEmpty() ? "" : middleName.substring(0, 1).toUpperCase() + ".";

        System.out.println(firstName + " " + middleInitial + " " + lastName);

        input.close();
    }
}

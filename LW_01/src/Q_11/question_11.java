package Q_11;
import java.util.Scanner;
public class question_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name (first middle last):");
        String input = scanner.nextLine();

        String[] nameParts = input.split(" ");
        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];
            String middleInitial = middleName.substring(0, 1);

            System.out.printf("%s, %s %s.%n", lastName, firstName, middleInitial);
        } else {
            System.out.println("Please enter your full name in the format first middle last.");
        }
    }

}

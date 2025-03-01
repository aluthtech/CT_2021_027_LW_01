package Q_08;
import java.util.Scanner;
public class question_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string that contains a single exclamation mark:");
        String input = scanner.nextLine();

        int exclamationIndex = input.indexOf('!');
        if (exclamationIndex != -1) {
            String beforeExclamation = input.substring(0, exclamationIndex).trim();
            String afterExclamation = input.substring(exclamationIndex + 1).trim();
            System.out.println(beforeExclamation);
            System.out.println(afterExclamation);
        } else {
            System.out.println("The input string does not contain an exclamation mark.");
        }
    }

}

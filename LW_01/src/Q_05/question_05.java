package Q_05;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class question_05 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.US);
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}

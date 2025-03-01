package Q_07;
import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class question_07 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = currentTime.format(formatter).toLowerCase();
        JFrame frame = new JFrame();
        frame.setTitle(formattedTime);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

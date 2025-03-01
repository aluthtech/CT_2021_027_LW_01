package Q_06;
import javax.swing.*;
public class question_06 {
    public static void main(String[] args) {
        int Width = Integer.parseInt(JOptionPane.showInputDialog("Enter Width"));
        int Height = Integer.parseInt(JOptionPane.showInputDialog("Enter Height"));
        String Title = JOptionPane.showInputDialog("Enter a Title");

        JFrame frame = new JFrame();
        frame.setTitle(Title);
        frame.setSize(Width, Height);
        frame.setVisible(true);

    }
}

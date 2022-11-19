import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class CustomerFormGUI extends JPanel {

    public static void main(String args[]) {

        JFrame frame = new JFrame("Customer Form");

        frame.setPreferredSize(new Dimension(800, 800));
        frame.setBackground(Color.RED);
        frame.setResizable(false);

        show(frame);
        
    }

    private static void show(JFrame frame) {
        ContentPanel content = new ContentPanel(frame);
        frame.getContentPane().add(content);

        //setting background colors to gold
        Color customColor = new Color(140, 29, 64);
        content.setBackground(customColor);

        frame.pack();
        frame.setVisible(true);
    }
}
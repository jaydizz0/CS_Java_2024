package GUI;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class GUI{
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Layout Demo");
        JPanel pane = new JPanel();
        pane.setPreferredSize(new Dimension(300,300));
        frame.getContentPane().add(pane, BorderLayout.CENTER);
        pane.setLayout(new FlowLayout());

        JPanel blue = new JPanel();
        blue.setPreferredSize(new Dimension(140, 100));
        blue.setBackground(Color.blue);
        pane.add(blue);

        JPanel red = new JPanel();
        red.setPreferredSize(new Dimension(140, 100));
        red.setBackground(Color.red);
        pane.add(red);
        
        JPanel yellow = new JPanel();
        yellow.setPreferredSize(new Dimension(140, 100));
        yellow.setBackground(Color.yellow);
        pane.add(yellow);

        JPanel green = new JPanel();
        green.setPreferredSize(new Dimension(140, 100));
        green.setBackground(Color.green);
        pane.add(green);

        frame.pack();
        frame.setVisible(true);
    }
}
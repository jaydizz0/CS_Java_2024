package GUI;

import javax.swing.*; 
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;  


public class MyProgram  implements ActionListener{
    

    private JButton start, stop;
    private JCheckBox cb1, cb2, cb3;
    private JRadioButton b1, b2, b3, b4, b5, b6;
    JPanel pane;
    public void createAndShowGUI(){
        JFrame frame = new JFrame("Button Demo");
        
        // Add a title in the Page Start section
        JLabel title = new JLabel("Button Demo", SwingConstants.CENTER);
        Font heading = new Font("Times Roman", Font.BOLD, 20);
        title.setFont(heading);
        title.setPreferredSize(new Dimension(300, 50));
        title.setOpaque(true);
        title.setBackground(Color.decode("#f0e9e9"));
        frame.getContentPane().add(title, BorderLayout.PAGE_START);
        
        // Add a flow pane in the main center section
        pane = new JPanel(new FlowLayout());
        pane.setPreferredSize(new Dimension(300, 400));
        pane.setBackground(Color.CYAN);
        pane.setOpaque(true);
        frame.getContentPane().add(pane, BorderLayout.CENTER);
        
        // Add two buttons to our pane
        start = new JButton("Start");
        stop = new JButton("Stop");
        
        // Adjust the size and color of the start button
        start.setPreferredSize(new Dimension(100, 30));
        start.setBackground(Color.GREEN);

        // Adjust the size and color of the stop button
        stop.setPreferredSize(new Dimension(75, 25));
        stop.setBackground(Color.BLUE);

        // Add the button listeners
        start.addActionListener(this);
        stop.addActionListener(this);

        
        pane.add(start);
        pane.add(stop);
        
        // // Create 3 check boxes
        cb1 = new JCheckBox("Option 1");
        cb2 = new JCheckBox("Option 2");
        cb3 = new JCheckBox("Option 3");
        cb1.setOpaque(false);
        cb2.setOpaque(false);
        cb3.setOpaque(false);
        
        // Add check boxes to a seperate panel
        JPanel checkBoxes = new JPanel();
        checkBoxes.setOpaque(false);
        
        checkBoxes.add(cb1);
        checkBoxes.add(cb2);
        checkBoxes.add(cb3);
        
        // Add the new panel into the flow pane
        pane.add(checkBoxes);
        
        // // Create 3 radio buttons
        b1 = new JRadioButton("Option A");
        b2 = new JRadioButton("Option B");
        b3 = new JRadioButton("Option C");
        b1.setOpaque(false);
        b2.setOpaque(false);
        b3.setOpaque(false);
        
        // Create a button group to add buttons into
        ButtonGroup group1 = new ButtonGroup();
        group1.add(b1);
        group1.add(b2);
        group1.add(b3);
        
        // Create a panel to add buttons into
        JPanel radioButtons1 = new JPanel();
        radioButtons1.setOpaque(false);
        
        radioButtons1.add(b1);
        radioButtons1.add(b2);
        radioButtons1.add(b3);
        
        // Add panel to flow pane
        pane.add(radioButtons1);

        // Create a second set of buttons
        b4 = new JRadioButton("Option X");
        b5 = new JRadioButton("Option Y");
        b6 = new JRadioButton("Option Z");
        b4.setOpaque(false);
        b5.setOpaque(false);
        b6.setOpaque(false);
        
        /**
         * Since these buttons go into a different group
         * they are selected seperate of group 1
         */
        ButtonGroup group2 = new ButtonGroup();
        group2.add(b4);
        group2.add(b5);
        group2.add(b6);
        
        JPanel radioButtons2 = new JPanel();
        radioButtons2.setOpaque(false);
        
        radioButtons2.add(b4);
        radioButtons2.add(b5);
        radioButtons2.add(b6);
        
        pane.add(radioButtons2);
        
        // Show the Frame
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * You need to add this method to handle the buuton
     * click events. e is the ActionEvent variable and
     * can tell you which button is pushed.
     */ 
    public void actionPerformed(ActionEvent e) {
        
        // Check if the Start button was pushed
        if (e.getSource() == start) {
            int startButton = 0;
            System.out.println("button Start was pushed");
            pane.setBackground(Color.GREEN);
            if(startButton == 0){
                start.setBackground(Color.BLUE);
                startButton++;
            }
            else if(startButton == 1){
                start.setBackground(Color.YELLOW);
                startButton--;
            }
                
        }
        // Check if the Stoop button was pushed
        else if (e.getSource() == stop) {
            int stopButton = 0;
            System.out.println("Button Stop was pushed");
            pane.setBackground(Color.RED);
            stop.setBackground(Color.GREEN);
            if(stopButton == 0){
                stop.setBackground(Color.BLUE);
                stopButton++;
            }
            else if(stopButton == 1){
                stop.setBackground(Color.YELLOW);
                stopButton--;
            }
        }
    } 
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               MyProgram test = new MyProgram();
                test.createAndShowGUI();
            }
        });
    }
}


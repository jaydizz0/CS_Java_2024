package GUI;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class PictureButton {
  
    public static void main(String[] args) {
      JButton button1 = new JButton("One");
      JButton button2 = new JButton("Two");
      
      
      
      ImageIcon icon1 = new ImageIcon("images/020943d1577ec712e10fb80c75b76c53.jpg");
      ImageIcon icon2 = new ImageIcon("images/Hobgobbler-How-to-Train-Your-Dragon.jpg");
      ImageIcon icon3 = new ImageIcon("images/10a86_sq2301_s38_f326_2k_finalr-2000-8a05008f461c4094829a5e4d88a7e99b.jpg");
      ImageIcon icon4 = new ImageIcon("images/1766d9ecb91d661ae10c54aab4273b16.jpg");
      ImageIcon icon5 = new ImageIcon("images/skullcrusher_gallery.jpg");
      
      JButton button3 = new JButton(scaleIconTo(icon1, 100)); 
      JButton button4 = new JButton(scaleIconTo(icon2, 100)); 
      JButton button5 = new JButton(scaleIconTo(icon3, 100)); 
      JButton button6 = new JButton(scaleIconTo(icon4, 100)); 
      JButton button7 = new JButton(scaleIconTo(icon5, 100)); 
      button7.setBorder(new LineBorder(Color.YELLOW, 4));

       button7.setBorder(new LineBorder(Color.YELLOW,4));
      
      JPanel box = new JPanel();
      box.add(button1);
      box.add(button2);
      box.add(button3);
      box.add(button4);
      box.add(button5);
      box.add(button6);
      box.add(button7);
      JFrame frame = new JFrame();
      frame.add(box);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationByPlatform(true);
      frame.setSize(500, 300);
      frame.setVisible(true);
   }

   public static ImageIcon scaleIconTo(ImageIcon icon, int size){
      Image img = icon.getImage();
      Image scaledImg = img.getScaledInstance(size, size,Image.SCALE_DEFAULT);
      return new ImageIcon(scaledImg);
   }
}

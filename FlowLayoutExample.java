import java.awt.*;
import java.applet.*;
import javax.swing.*;
 
public class FlowLayoutExample extends JApplet {
 
  public void init () {
    getContentPane().setLayout(new FlowLayout ());
    getContentPane().add(new JButton("One"));
    getContentPane().add(new JButton("Two"));
    getContentPane().add(new JButton("Three"));
    getContentPane().add(new JButton("Four"));
    getContentPane().add(new JButton("Five"));
    getContentPane().add(new JButton("Six"));
  }
}

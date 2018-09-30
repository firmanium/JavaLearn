import java.awt.*;
import javax.swing.*;


public class HelloWorldSwing extends JFrame {

        JTextArea m_resultArea = new JTextArea(6, 30);

        //====================================================== constructor
        public HelloWorldSwing() {
            //... Set initial text, scrolling, and border.
            m_resultArea.setText("Enter more text to see scrollbars");
            JScrollPane scrollingArea = new JScrollPane(m_resultArea);
            scrollingArea.setBorder(BorderFactory.createEmptyBorder(10,5,10,5));

            // Get the content pane, set layout, add to center
            Container content = this.getContentPane();
            content.setLayout(new BorderLayout());
            content.add(scrollingArea, BorderLayout.CENTER);
            this.pack();
        }

        public static void createAndViewJFrame() {
            JFrame win = new HelloWorldSwing();
            win.setTitle("TextAreaDemo");
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            win.setVisible(true);
        }

        //============================================================= main
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndViewJFrame();
                }
            });
        }

}
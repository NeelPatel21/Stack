package stack;
import java.awt.Color;
import javax.swing.*;
public class spenal extends JPanel
{
     public JLabel Top=new JLabel("Top-");
     public JTextArea a;
     public spenal()
     {
          a=new JTextArea("",1,1);
          a.setBounds(50,0,50,20);
          a.setBackground(Color.DARK_GRAY);
          a.setForeground(Color.getHSBColor((float) 1.623,1000,1000));
          a.setEditable(false);
          add(a);
          Top.setForeground(Color.BLACK);
          Top.setBounds(0,0,50,20);
          Top.setVisible(false);
          add(Top);
          setSize(100,20);
          setLayout(null);
          setVisible(true);
     }
}
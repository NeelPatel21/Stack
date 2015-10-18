package stack_with_awt;
import stack.*;
import javax.swing.*;
import java.awt.event.*;
public class Stack_with_awt extends JFrame
{
     int l;
     neelst z;
     JTextArea t[];
     JButton pushb,popb;
     Stack_with_awt()
     {
          String b=JOptionPane.showInputDialog("enter size of stack");
          l=Integer.parseInt(b);
          z=new neelst(l);
          t=new JTextArea[l];
          int ii=450/(l+1);
          for(int i=0;i<t.length;i++)
          {
               t[i]=new JTextArea("hello"+i,1,1);
               t[i].setRows(1);
               t[i].setColumns(1);
               t[i].setBounds(25,415-(i+1)*ii,50,20);
               t[i].setEnabled(false);
               t[i].setText("");
               add(t[i]);
          }
          pushb= new JButton("push");
          pushb.setBounds(100,200,100,20);
          pushb.setEnabled(true);
          pushb.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    z.push();
                         popb.setEnabled(true);
                    if(z.t==l)
                         pushb.setEnabled(false);
                    act();
               }               
          });
          add(pushb);
          popb=new JButton("pop");
          popb.setBounds(100,230,100,20);
          popb.setEnabled(false);
          popb.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    t[z.t].setText("");
                    z.pop();
                         pushb.setEnabled(true);
                    if(z.t==-1)
                         popb.setEnabled(false);
                    act();
               }               
          });
          add(popb);
          setSize(300,450);
          setLayout(null);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public static void main(String jarvis[])
     {
          Stack_with_awt m=new Stack_with_awt();
     }
     void act()
     {
          for(int i=0;i<=z.t;i++)
          {
               t[i].setText(Integer.toString(z.s[i]));
          }
     }
     
}
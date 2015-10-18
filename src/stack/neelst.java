package stack;
import javax.swing.JOptionPane;
public class neelst
{
     public int s[],t=-1;
     public neelst(int l)
     {
          s=new int[l];
     }
     public void push()
     {
          if(t==s.length-1)
          {
               JOptionPane.showMessageDialog(null,"stack overflow!!1","error",JOptionPane.PLAIN_MESSAGE);
               return;     
          }
          String x =JOptionPane.showInputDialog("enter element..");
          t++;
          s[t]=Integer.parseInt(x);
     }
     public void pop()
     {
          if(t==-1)
          {
               JOptionPane.showMessageDialog(null,"stack underflow!!","error",JOptionPane.PLAIN_MESSAGE);
               return;
          }
          JOptionPane.showMessageDialog(null,s[t--]+" is deleted","pop",JOptionPane.PLAIN_MESSAGE);
     }
     public void display()
     {
          String d="";
          for(int i=0;i<=t;i++)
               d=d+" "+s[i];
          JOptionPane.showMessageDialog(null,d,"stack contain",JOptionPane.PLAIN_MESSAGE);               
     }
}
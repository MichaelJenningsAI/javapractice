import javax.swing.*;
public class Salarygui
{
    public static void main (String[] args)
    {
            double normalw1,extraw1,normalw2,extraw2,total;
            String bonus, normalw1str, extraw1str, normalw2str,extraw2str,totalstr;
            bonus = "";
            totalstr = "";
            normalw1str = JOptionPane.showInputDialog("Please Enter number of normal hours week 1: ");
            normalw1 = Integer.parseInt(normalw1str);
            extraw1str = JOptionPane.showInputDialog("Please Enter number of extra hours for week 1: ");
            extraw1 = Integer.parseInt(extraw1str);
            total = 10*normalw1+15*extraw1;
            normalw2str = JOptionPane.showInputDialog("Please Enter number of normal hours week 2: ");
            normalw2 = Integer.parseInt(normalw2str);
            extraw2str = JOptionPane.showInputDialog("Please Enter number of extra hours for week 2: ");
            extraw2 = Integer.parseInt(extraw2str);
            total = 10*normalw2+15*extraw2+total;
            JOptionPane.showMessageDialog(null,"Total salary is: "+ total +"\n","Total Salary",JOptionPane.INFORMATION_MESSAGE);
            
            if (total >=500 && total < 1000){
                total = total * 1.05;
                bonus = "5%";
            }
            else if (total < 500){
                total = total * 1.10;
                bonus = "10%";
            }
            else
            bonus = "No Bonus!";
            JOptionPane.showMessageDialog(null,"Bonus is: "+ bonus,"Bonus",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Total salary after bonus is: "+ total +"\n","Total After Salary",JOptionPane.INFORMATION_MESSAGE);
        }   
    }
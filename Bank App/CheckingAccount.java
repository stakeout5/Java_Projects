import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 * Represents a Checking Account
 * 
 * @author Michael Johnson 
 * @1.0  2-24-14
 */
public class CheckingAccount implements Account
{
  private double balance = 3000.00;
  
  public void deposit()
  {
      String input = JOptionPane.showInputDialog("Amount to Deposit");
      double x = Double.parseDouble(input);
      
       if(x<0.00 || x>99999)
       {
         JOptionPane.showMessageDialog(null,"Error, please reenter amount." + "\n" +
         "Balane: " + balance);           
       }
       else
       {
          balance = balance + x;
          JOptionPane.showMessageDialog(null,"Balance: " + balance);
       }
  }    
  public void withdraw()
  {
     String input = JOptionPane.showInputDialog("Amount to withdraw");
     double y = Double.parseDouble(input);
        if(y > balance)
        {
            JOptionPane.showMessageDialog(null,"Error, please enter another amount.");
        }
        else
        {
        if(y < 1000.00)
        {
            balance = balance - y -10.00;
            JOptionPane.showMessageDialog(null,"New balance: " + balance);
        }
        else
        {
            balance = balance - y;
            JOptionPane.showMessageDialog(null,"New balance: " + balance);
        }
    }
  }
  public double getCheBalance()
    {
        return balance;
    }
}

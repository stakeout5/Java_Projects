import java.awt.*;
import javax.swing.*;
/**
 * Represents a Savings Account
 * 
 * @author Michael Johnson 
 * @1.0  2-24-14
 */
public class SavingAccount implements Account
{
    private double balance = 4000.00;
    
    public void deposit()
    {
      String input = JOptionPane.showInputDialog("Amount to Deposit");
      double x = Double.parseDouble(input);
      balance = balance + x;
      JOptionPane.showMessageDialog(null,"New balance: " + balance);
    }    
    public void withdraw()
    {
        String input = JOptionPane.showInputDialog("Amount to Deposit");
        double x = Double.parseDouble(input);
        balance = balance - x;
        JOptionPane.showMessageDialog(null,"New balance: " + balance);
    }      
}

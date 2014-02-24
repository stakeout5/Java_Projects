import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main extends JFrame implements ActionListener{
    Account che = new CheckingAccount();
    Account sav = new SavingAccount();
    public Main(){
        //JFrame.
        JFrame frame = new JFrame("Checking Account");
        frame.setSize(250,250);//Size of JFrame
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);//Sets if its visible.
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        //Checking label
        JLabel check = new JLabel("Checkings");
        check.setBounds(30,10,110,30);
        frame.add(check);
        ////Sav label
        JLabel save = new JLabel("Savings");
        save.setBounds(160,10,110,30);
        frame.add(save);
        ////
        
        JLabel saveAmt = new JLabel();
        saveAmt.setBounds(160,10,110,30);
        frame.add(saveAmt);
               
        //JButton.  
        JButton cdButton = new JButton("Deposit");//The JButton name.
        cdButton.setSize(85,40);
        cdButton.setBounds(20,40,90,30);
        frame.add(cdButton);//Add the button to the JFrame.
        cdButton.addActionListener(this);//Reads the action.
        //JButton 2.  
        JButton cwButton = new JButton("Withdraw");//The JButton name.
        cwButton.setSize(85,40);
        cwButton.setBounds(20,90,90,30);
        frame.add(cwButton);//Add the button to the JFrame.
        cwButton.addActionListener(this);//Reads the action. 
        //////
       
        //JButton.  
        JButton sdButton = new JButton("Deposit ");//The JButton name.
        sdButton.setSize(85,40);
        sdButton.setBounds(140,40,90,30);
        frame.add(sdButton);//Add the button to the JFrame.
        sdButton.addActionListener(this);//Reads the action.
        //JButton 2.  
        JButton swButton = new JButton("Withdraw ");//The JButton name.
        swButton.setSize(85,40);
        swButton.setBounds(140,90,90,30);
        frame.add(swButton);//Add the button to the JFrame.
        swButton.addActionListener(this);//Reads the action. 
        
        
    }
    
    //The main method.
     
    public static void main(String[] args){ 
        new Main();//Reads method main()
    }
    //What the button does.  
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Deposit"))
        {
            che.deposit();
        }
        if(command.equals("Withdraw"))
        {
            che.withdraw();
        }
        if(command.equals("Deposit "))
        {
            sav.deposit();
        }
        if(command.equals("Withdraw "))
        {
            sav.withdraw();
        }
    }
   }

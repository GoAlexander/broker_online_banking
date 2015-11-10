

// Add a scroll bar to Project 2-2. 
   
import java.awt.*;   
import java.awt.event.*;   
import javax.swing.*;
import javax.swing.border.TitledBorder;   
    
class DboBroker {
   
  // A short list of names and phone numbers.  
	
	
	
 
  
  DboBroker() {   
  
    // Create a new JFrame container.   
    JFrame firstDbo = new JFrame("ДБО брокер");
    
    JFrame indFrame = new JFrame("ДБО брокер");
   
    // Give the frame an initial size.   
    firstDbo.setSize(550, 403);   
   
    // Terminate the program when the user closes the application.   
    firstDbo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    // Add radio buttons to button group.  
   
    firstDbo.getContentPane().setLayout(null);
    
    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    panel.setBounds(35, 56, 458, 249);
    firstDbo.getContentPane().add(panel);
    panel.setLayout(null);
    JLabel label_1 = new JLabel();
    label_1.setBounds(230, 7, 0, 0);
    panel.add(label_1);
   
	
    
    
    
    JButton indU = new JButton("\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
    indU.setForeground(Color.DARK_GRAY);
    indU.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		new IndUser();
    		firstDbo.setVisible(false);
    		
    		
    	}
    });
    indU.setBounds(140, 54, 157, 59);
    panel.add(indU);
    
    JButton entityU = new JButton("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
    entityU.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		new EntityUser();
    		firstDbo.setVisible(false);
    		
    	}
    });
    entityU.setForeground(Color.DARK_GRAY);
    entityU.setBounds(140, 134, 157, 59);
    panel.add(entityU);
    
   
    JLabel typeUser = new JLabel("\u0422\u0438\u043F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
    typeUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
    typeUser.setForeground(new Color(0, 139, 139));
    typeUser.setBounds(35, 34, 117, 22);
    firstDbo.getContentPane().add(typeUser);
    
   
    JButton button = new JButton("\u0412\u044B\u0445\u043E\u0434");
    button.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		System.exit(0);
    	}
    });
    button.setBounds(418, 317, 74, 22);
    firstDbo.getContentPane().add(button);
    
   
    // Display the frame.   
    firstDbo.setVisible(true);   
  }   
  
  
  public static void main(String args[]) {   
    // Create the frame on the event dispatching thread.   
    SwingUtilities.invokeLater(new Runnable() {   
      public void run() {   
        new DboBroker();   
      }   
    });   
  }   
}

package frontend;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;

public class IndUser {

	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public IndUser() {
		 // Create a new JFrame container.   
	    JFrame indFrame = new JFrame("ДБО брокер");
	    
	    	
	   
	    // Give the frame an initial size.   
	    indFrame.setSize(550, 403);   
	   
	    // Terminate the program when the user closes the application.   
	    indFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	    // Add radio buttons to button group.  
	   
	    indFrame.getContentPane().setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	    panel.setBounds(35, 57, 458, 249);
	    indFrame.getContentPane().add(panel);
	    panel.setLayout(null);
	    JLabel label_1 = new JLabel();
	    label_1.setBounds(230, 7, 0, 0);
	    panel.add(label_1);
	    
	    JRadioButton radioButton = new JRadioButton("1 \u043A\u0440\u0438\u0442\u0435\u0440\u0438\u0439");
	    radioButton.setBounds(32, 7, 94, 24);
	    panel.add(radioButton);
	    
	    JRadioButton radioButton_1 = new JRadioButton("2 \u043A\u0440\u0438\u0442\u0435\u0440\u0438\u0439");
	    radioButton_1.setBounds(130, 7, 94, 24);
	    panel.add(radioButton_1);
	    
	    JRadioButton radioButton_2 = new JRadioButton("3 \u043A\u0440\u0438\u0442\u0435\u0440\u0438\u0439");
	    radioButton_2.setBounds(230, 7, 88, 24);
	    panel.add(radioButton_2);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBounds(12, 7, 434, 24);
	    panel.add(panel_1);
	    
	    JCheckBox checkBox = new JCheckBox("1 \u043A\u0440\u0438\u0442\u0435\u0440\u0438\u0439");
	    checkBox.setBounds(32, 42, 88, 24);
	    panel.add(checkBox);
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox("2 \u043A\u0440\u0438\u0442\u0435\u0440\u0438\u0439");
	    chckbxNewCheckBox.setBounds(130, 42, 88, 24);
	    panel.add(chckbxNewCheckBox);
	    
	    JCheckBox checkBox_1 = new JCheckBox("3 \u043A\u0440\u0438\u0442\u0435\u0440\u0438\u0439");
	    checkBox_1.setBounds(230, 42, 112, 24);
	    panel.add(checkBox_1);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBounds(12, 42, 434, 24);
	    panel.add(panel_2);
	    panel_2.setLayout(null);
	   
	    JFrame indUser = new JFrame("ДБО брокер");
		indUser.setSize(550, 403);   
		indUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JLabel typeUser = new JLabel("\u0412\u044B\u0431\u043E\u0440 \u0444\u0443\u043D\u043A\u0446\u0438\u0439");
	    typeUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    typeUser.setForeground(new Color(0, 139, 139));
	    typeUser.setBounds(35, 34, 117, 22);
	    indFrame.getContentPane().add(typeUser);
	    
	    // Create radio buttons.  
	    
	    // Add radio buttons to button group.  
	    
	    
	    JButton button = new JButton("\u0412\u044B\u0445\u043E\u0434");
	    button.setForeground(Color.DARK_GRAY);
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.exit(0);
	    	}
	    });
	    button.setBounds(121, 331, 74, 22);
	    indFrame.getContentPane().add(button);
	    
	    JButton btnNewButton = new JButton("\u041D\u0430\u0437\u0430\u0434");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		new DboBroker();
	    		indFrame.setVisible(false);
	    		
	    	}
	    });
	    btnNewButton.setForeground(Color.DARK_GRAY);
	    btnNewButton.setBounds(35, 331, 74, 22);
	    indFrame.getContentPane().add(btnNewButton);
	    
	    JButton button_1 = new JButton("\u0414\u0430\u043B\u0435\u0435");
	    button_1.setBounds(419, 331, 74, 22);
	    indFrame.getContentPane().add(button_1);
	   
	    // Display the frame.   
	    indFrame.setVisible(true);   
	}
}

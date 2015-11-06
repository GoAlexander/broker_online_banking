import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntityUser {



	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public EntityUser() {
		 JFrame entityFrame = new JFrame("ÄÁÎ Áðîêåð");
		 entityFrame.setSize(550, 403);   
		 entityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 entityFrame.getContentPane().setLayout(null);
		 
		 JPanel panel = new JPanel();
		 panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		 panel.setBounds(35, 28, 454, 258);
		 entityFrame.getContentPane().add(panel);
		 panel.setLayout(null);
		 
		 JCheckBox checkBox = new JCheckBox("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u044F");
		 checkBox.setBounds(8, 8, 112, 24);
		 panel.add(checkBox);
		 entityFrame.setVisible(true);
		 
		 JButton btnNewButton = new JButton("\u041D\u0430\u0437\u0430\u0434");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new DboBroker();
		 		entityFrame.setVisible(false);
		 		
		 	}
		 });
		 btnNewButton.setBounds(35, 298, 74, 22);
		 entityFrame.getContentPane().add(btnNewButton);
		 
		 JLabel label = new JLabel("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
		 label.setFont(new Font("Dialog", Font.PLAIN, 12));
		 label.setForeground(new Color(0, 139, 139));
		 label.setBounds(35, 11, 127, 16);
		 entityFrame.getContentPane().add(label);
		 
		 JButton button = new JButton("\u0412\u044B\u0445\u043E\u0434");
		 button.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
	 		System.exit(0);
		 	}
		 });
		 button.setBounds(121, 298, 74, 22);
		 entityFrame.getContentPane().add(button);
		 
	}
}

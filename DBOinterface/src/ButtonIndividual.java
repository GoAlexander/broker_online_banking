import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JComboBox;

public class ButtonIndividual extends RealiseInterface{

	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public JFrame getFrame(){
		return frame;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonIndividual window = new ButtonIndividual();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public ButtonIndividual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0411\u0440\u043E\u043A\u0435\u0440 \u0414\u0411\u041E");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u041D\u0430\u0437\u0430\u0434");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setBounds(10, 212, 89, 23);
		frame.getContentPane().add(button);
		
		String[] functions = {"1", "2", "3"};
		
		JComboBox comboBox = new JComboBox(functions);
		
		comboBox.setBounds(51, 53, 275, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel memory = new JLabel();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String item = (String) comboBox.getSelectedItem();
				//memory.setText("Current selection" + item);
				//comboBox.setSelectedIndex(0);
				
				
			}
		});
		frame.getContentPane().add(comboBox);
		frame.getContentPane().add(memory);
		frame.setVisible(true);
		
		
		
		
	}
}

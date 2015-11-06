import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class RealiseInterface {

	protected JFrame frameMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealiseInterface window = new RealiseInterface();
					window.frameMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RealiseInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMain = new JFrame();
		frameMain.getContentPane().setBackground(SystemColor.menu);
		frameMain.getContentPane().setForeground(new Color(128, 0, 128));
		frameMain.setForeground(new Color(255, 255, 255));
		frameMain.setTitle("\u0411\u0440\u043E\u043A\u0435\u0440 \u0414\u0411\u041E");
		frameMain.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frameMain.setBounds(100, 100, 450, 300);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.getContentPane().setLayout(null);
		
		JButton individual = new JButton("\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
		individual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
							ButtonIndividual window = new ButtonIndividual();
							window.frame.setVisible(true);		
							
							
				
			}
		});
		
		individual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		individual.setBounds(133, 75, 150, 31);
		frameMain.getContentPane().add(individual);
		
		JButton entity = new JButton("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
		entity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		entity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		entity.setBounds(133, 120, 150, 31);
		frameMain.getContentPane().add(entity);
		
		JButton corporation = new JButton("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u044F");
		corporation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		corporation.setBounds(133, 163, 150, 31);
		frameMain.getContentPane().add(corporation);
		
		JLabel label = new JLabel("     \u041A \u043A\u0430\u043A\u043E\u043C\u0443 \u0442\u0438\u043F\u0443 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u0435\u0439 \u0432\u044B \u043E\u0442\u043D\u043E\u0441\u0438\u0442\u0435\u0441\u044C?");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(46, 22, 336, 34);
		frameMain.getContentPane().add(label);
		frameMain.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{individual, entity, corporation, label}));
	}
}

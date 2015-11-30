package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;

import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;

import backend.*;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import java.awt.Choice;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.event.ChangeListener;

public class DboBroker implements ChangeListener{

	public static int price_1;
	public static int price_2;
	private int person;

	private JScrollPane scrollPane;
	private JTextArea textArea;

	static final int SLIDER_MIN = 0;
	static final int SLIDER_MAX = 5000;
	static final int SLIDER_INIT = 5000;
	static final String[] FilterStrings = { "Неважен", "Низкий уровень", "Средний уровень", "Повышенный уровень" };

	// check panel
	private JFrame frmDboBroker;
	private JPanel panelFirstPage;
	private JPanel panelIndividual;
	private JPanel panelSecurityInd;
	private JPanel panelLastPage;
	private JPanel panelEntityUser;
	private JPanel panelEntity2;
	private JPanel EntityChoice;
	private JPanel panelSecurityEntity;
	private JPanel panelCorporations;
	private JPanel panelCorporations2;
	private JPanel panelFilter;

	// check box first page
	private JCheckBox chckbxSetDefault;
	private JCheckBox chcbxSetChange;

	// individ services
	private JCheckBox IndIBcheckBoxVirtCard;
	private JCheckBox IndIBcheckBoxManCalcul;
	private JCheckBox IndIBcheckBoxPayServ;
	private JCheckBox IndIBcheckBoxDeposit;
	private JCheckBox IndIBcheckBoxMoneyTransf;
	private JCheckBox IndIBcheckBoxCardWork;
	private JCheckBox IndIBcheckBoxCreditOperation;
	private JCheckBox IndIBcheckBoxCurrency;
	private JCheckBox IndIBcheckBoxInformationServ;
	private JCheckBox IndcheckBoxInternetBank;
	private JCheckBox IndcheckBoxMobileBank;
	private JCheckBox IndMBcheckBoxInformationAccount;
	private JCheckBox IndMBcheckBoxCardWork;
	private JCheckBox IndMBcheckBoxPayServ;
	private JCheckBox IndMBcheckBoxMoneyTransf;
	private JCheckBox IndMBcheckBoxElwallet;
	private JCheckBox IndMBcheckBoxInformServ;
	private JCheckBox IndMBcheckBoxTelefBank;
	private JCheckBox IndMBcheckBoxSMS;
	private JCheckBox IndcheckBoxATM;

	// entity small business services
	private JCheckBox EntIBcheckBoxMBmanageAccount;
	private JCheckBox EntIBcheckBoxEinv;
	private JCheckBox EntIBcheckBoxCurrency;
	private JCheckBox EntIBcheckBoxElDoc;
	private JCheckBox EntIBcheckBoxCredit;
	private JCheckBox EntIBcheckBoxInfServ;
	private JCheckBox EntIBcheckBoxImpExp1C;
	private JCheckBox EntcheckBoxIntBank;
	private JCheckBox EntMBcheckBoxnIformStateAccount;
	private JCheckBox EntMBcheckBoxFinOperations;
	private JCheckBox EntMBcheckBoxTelefBank;
	private JCheckBox EntMBcheckBoxInfCash;
	private JCheckBox EntMBcheckBoxInfServices;
	private JCheckBox EntMBcheckBoxSmsBank;
	private JCheckBox EntCheckBoxMobBank;
	private JCheckBox EntMBcheckBoxSendingDoc;
	private JCheckBox EntcheckBoxBankClient;
	private JCheckBox EntBCcheckBoxInfAccount;
	private JCheckBox EntBCcheckBoxFinOperations;
	private JCheckBox EntBCcheckBoxElectronDocumentsManage;
	private JCheckBox EntBCcheckBoxCurrencyOperations;
	private JCheckBox EntBCcheckBoxImpExp1C;
	private JCheckBox EntBCcheckBoxSeparatedAccessDocum;
	private JCheckBox EntBCcheckBoxInfServ;
	private JCheckBox EntBCcheckBoxMessageExchange;

	// entity corporations services
	private JCheckBox EntCorpIBcheckBoxManageAccount;
	private JCheckBox EntCorpIBcheckBoxEinv;
	private JCheckBox EntCorpIBcheckBoxCurrency;
	private JCheckBox EntCorpIBcheckBoxPayDocuments;
	private JCheckBox EntCorpIBcheckBoxCredit;
	private JCheckBox EntCorpIBcheckBoxInfServ;
	private JCheckBox EntCorpIBcheckBoxImpExp1C;
	private JCheckBox EntCorpcheckBoxIB;

	private JCheckBox EntCorp2BCcheckBoxInfAccount;
	private JCheckBox EntCorp2BCcheckBoxFinOperations;
	private JCheckBox EntCorp2BCcheckBoxElecDocuments;
	private JCheckBox EntCorp2BCcheckBoxCurOperations;
	private JCheckBox EntCorp2BCcheckBoxImpExp1C;
	private JCheckBox EntCorp2BCcheckBoxSeparAccess;
	private JCheckBox EntCorp2BCcheckBoxInfServ;
	private JCheckBox EntCorp2BCcheckBoxMessExchange;
	private JCheckBox EntCorp2BCcheckBoxCorpCards;

	private JCheckBox EntCorp2BCcheckBoxAcquiring;
	private JCheckBox EntCorp2BCcheckBoxBudgetSub;
	private JCheckBox EntCorp2BCcheckBoxEinv;
	private JCheckBox EntCorp2BCcheckBoxTransferPaySystem;
	private JCheckBox EntCorp2BCcheckBoxWorkNumOrganisations;
	private JCheckBox EntCorp2checkBoxBankClient;

	// security ind
	private JCheckBox chckbxSaveApplication;
	private JCheckBox chckbxSVirtualKeyboard;
	private JCheckBox chckbxSsslSecur;
	private JCheckBox chckbxSAutoExit;
	private JCheckBox chckbxSCheckIp;
	private JCheckBox chckbxS3Dsecure;
	private JCheckBox checkBoxSApparatAuthentication;
	private JCheckBox chckbxSSmsAunt;

	// security entity
	private JCheckBox EntScheckBoxAntivirPO;
	private JCheckBox EntScheckBoxAuthenTrans;
	private JCheckBox EntScheckBoxSecurApplic;
	private JCheckBox EntScheckBoxSSL;
	private JCheckBox EntScheckBoxAutoPowerSession;
	private JCheckBox EntScheckBoxUsingSKZI;
	private JCheckBox EntScheckBoxSmsAuto;
	private JCheckBox EntScheckBoxApparatAuthen;
	private JCheckBox EntScheckBoxCheckIP;

	private JCheckBox FilterCheckBoxComfortFalse;
	private JCheckBox FilterCheckBoxComfortTrue;

	//
	private int flag;

	// text bottom
	private JButton btnIndividual;
	private JButton btnEntity;
	private JButton buttonInext;
	private JButton buttonIback;
	private JButton EntChoicebuttonSmallBusiness;
	private JButton EntChoicebuttonCorporations;

	private JLabel label_6;
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton button_2;
	private JLabel label_7;
	private JButton EntSbuttonBack;
	private JButton EntSbuttonNext;
	private JPanel panel_6;
	private JLabel label_8;
	private JLabel label_9;
	private JPanel panel_7;

	private JButton EntCorpIBbuttonBack;
	private JButton EntCorpIBbuttonNext;
	private JLabel lblNewLabel_2;
	private JLabel label_10;
	private JLabel lblNewLabel_3;
	private JLabel label_11;
	private JSlider sliderConnect;
	private JSlider sliderUse;
	private JLabel label_12;
	private JLabel lblNewLabel_5;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	
	//private static int count = 0;

	// Launch the application.

	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DboBroker window = new DboBroker();
					window.frmDboBroker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DboBroker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();
		if (!source.getValueIsAdjusting()) {
			JSlider source1 = (JSlider) e.getSource();
			if (!source1.getValueIsAdjusting()) {
				int source_new = (int) source1.getValue();
				
			

			}
		}
	}

	private void initializeFirstPage() {

		panelFirstPage = new JPanel();
		panelFirstPage.setBackground(new Color(255, 255, 204));

		panelFirstPage.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFirstPage.setForeground(new Color(0, 128, 128));
		frmDboBroker.getContentPane().add(panelFirstPage, "name_14444956664902");
		panelFirstPage.setLayout(null);

		JLabel labelAppeal = new JLabel(
				"\u0417\u0434\u0440\u0430\u0432\u0441\u0442\u0432\u0443\u0439\u0442\u0435! \r\n");
		labelAppeal.setBackground(UIManager.getColor("textHighlight"));
		labelAppeal.setForeground(new Color(255, 255, 0));
		labelAppeal.setBounds(205, 11, 245, 46);
		labelAppeal.setHorizontalAlignment(SwingConstants.CENTER);
		labelAppeal.setToolTipText("");
		labelAppeal.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelFirstPage.add(labelAppeal);

		JLabel labelAppeal2 = new JLabel(
				"\u0412\u0430\u0441 \u043F\u0440\u0438\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0411\u0440\u043E\u043A\u0435\u0440 \u0414\u0411\u041E, \u0441\u0434\u0435\u043B\u0430\u0439\u0442\u0435 \u0412\u0430\u0448 \u0432\u044B\u0431\u043E\u0440.");
		labelAppeal2.setForeground(new Color(255, 255, 0));
		labelAppeal2.setBounds(97, 46, 515, 35);
		labelAppeal2.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelAppeal2.setHorizontalAlignment(SwingConstants.CENTER);
		panelFirstPage.add(labelAppeal2);

		JPanel panelSeparate2 = new JPanel();
		panelSeparate2.setBackground(UIManager.getColor("Button.background"));
		panelSeparate2.setBounds(117, 311, 450, 122);
		panelSeparate2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelFirstPage.add(panelSeparate2);
		panelSeparate2.setLayout(null);

		chckbxSetDefault = new JCheckBox(
				"\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438 \u043F\u043E \u0443\u043C\u043E\u043B\u0447\u0430\u043D\u0438\u044E");
		chckbxSetDefault.setBackground(UIManager.getColor("Button.background"));
		chckbxSetDefault.setSelected(true);
		chckbxSetDefault.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSetDefault.setBounds(29, 22, 306, 23);
		panelSeparate2.add(chckbxSetDefault);

		chcbxSetChange = new JCheckBox(
				"\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u044C \u043D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
		chcbxSetChange.setBackground(UIManager.getColor("Button.background"));
		chcbxSetChange.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chcbxSetChange.setBounds(29, 58, 306, 23);
		panelSeparate2.add(chcbxSetChange);

		ButtonGroup selectedItems = new ButtonGroup();
		selectedItems.add(chckbxSetDefault);
		selectedItems.add(chcbxSetChange);

		JPanel panelSeparate = new JPanel();
		panelSeparate.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelSeparate.setBackground(UIManager.getColor("Button.background"));
		panelSeparate.setBounds(116, 135, 450, 170);
		panelSeparate.setForeground(new Color(0, 128, 128));
		panelFirstPage.add(panelSeparate);
		panelSeparate.setLayout(null);

		btnEntity = new JButton(
				"\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		btnEntity.setBackground(UIManager.getColor("Button.background"));
		btnEntity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// EntityChoice.setVisible(true);

				if (chckbxSetDefault.isSelected()) {

					EntityChoice.setVisible(true);
					panelFirstPage.setVisible(false);
				} else if (!chckbxSetDefault.isSelected()) {

					panelSecurityEntity.setVisible(true);
					panelFirstPage.setVisible(false);
				}

			}
		});

		btnIndividual = new JButton(
				"\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		btnIndividual.setBackground(UIManager.getColor("Button.background"));
		btnIndividual.setBounds(32, 41, 170, 70);
		panelSeparate.add(btnIndividual);
		btnIndividual.setForeground(new Color(0, 128, 128));
		btnIndividual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (chckbxSetDefault.isSelected()) {

					panelIndividual.setVisible(true);
					panelFirstPage.setVisible(false);
				} else if (!chckbxSetDefault.isSelected()) {

					panelSecurityInd.setVisible(true);
					panelFirstPage.setVisible(false);
				}
				person = 0;
			}
		});

		btnIndividual.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnEntity.setBounds(256, 41, 170, 70);
		panelSeparate.add(btnEntity);
		btnEntity.setForeground(new Color(0, 128, 128));
		btnEntity.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel label = new JLabel("New label");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 684, 502);
		panelFirstPage.add(label);
		label.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));

	}

	private void initializeIndividual() {
		panelIndividual = new JPanel();
		frmDboBroker.getContentPane().add(panelIndividual, "name_14448719491433");
		panelIndividual.setLayout(null);

		JLabel labelName = new JLabel(
				"\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		labelName.setBounds(191, 11, 312, 20);
		labelName.setForeground(new Color(255, 255, 0));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelIndividual.add(labelName);

		buttonInext = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		buttonInext.setBounds(515, 445, 107, 32);
		buttonInext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelFilter.setVisible(true);
				panelIndividual.setVisible(false);
				flag = 1;

			}
		});
		buttonInext.setForeground(new Color(0, 128, 128));
		buttonInext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelIndividual.add(buttonInext);

		buttonIback = new JButton("\u041D\u0430\u0437\u0430\u0434");
		buttonIback.setBounds(74, 445, 107, 32);
		buttonIback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSetDefault.isSelected()) {
					panelFirstPage.setVisible(true);
					panelIndividual.setVisible(false);
				} else {
					panelSecurityInd.setVisible(true);
					panelIndividual.setVisible(false);
				}
			}
		});
		buttonIback.setForeground(new Color(0, 128, 128));
		buttonIback.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelIndividual.add(buttonIback);

		JPanel Ipanel_1 = new JPanel();
		Ipanel_1.setBounds(356, 42, 266, 360);
		Ipanel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelIndividual.add(Ipanel_1);
		Ipanel_1.setLayout(null);

		IndIBcheckBoxVirtCard = new JCheckBox(
				"\u0412\u0438\u0440\u0442\u0443\u0430\u043B\u044C\u043D\u0430\u044F \u043A\u0430\u0440\u0442\u0430");
		IndIBcheckBoxVirtCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (IndIBcheckBoxVirtCard.isSelected()) {
					Parsing.all_user_selection[0] = true;
				}
			}
		});

		IndIBcheckBoxVirtCard.setBounds(25, 57, 179, 23);
		IndIBcheckBoxVirtCard.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxVirtCard);

		IndIBcheckBoxManCalcul = new JCheckBox(
				"\u0423\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u043C\u0438 \u0441\u0447\u0435\u0442\u0430\u043C\u0438");
		IndIBcheckBoxManCalcul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxManCalcul.isSelected()) {
					Parsing.all_user_selection[1] = true;
				}
			}
		});
		IndIBcheckBoxManCalcul.setBounds(24, 297, 220, 23);
		IndIBcheckBoxManCalcul.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxManCalcul);

		IndIBcheckBoxPayServ = new JCheckBox(
				"\u041E\u043F\u043B\u0430\u0442\u0430 \u0443\u0441\u043B\u0443\u0433 \u0441 \u043F\u043E\u043C\u043E\u0449\u044C\u044E \u041F\u0421");
		IndIBcheckBoxPayServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxPayServ.isSelected()) {
					Parsing.all_user_selection[2] = true;
				}
			}
		});
		IndIBcheckBoxPayServ.setBounds(25, 117, 219, 23);
		IndIBcheckBoxPayServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxPayServ);

		IndIBcheckBoxDeposit = new JCheckBox(
				"\u041E\u0444\u043E\u0440\u043C\u043B\u0435\u043D\u0438\u0435 \u0432\u043A\u043B\u0430\u0434\u043E\u0432");
		IndIBcheckBoxDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxDeposit.isSelected()) {
					Parsing.all_user_selection[3] = true;
				}
			}
		});
		IndIBcheckBoxDeposit.setBounds(25, 237, 179, 23);
		IndIBcheckBoxDeposit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxDeposit);

		IndIBcheckBoxMoneyTransf = new JCheckBox(
				"\u0414\u0435\u043D\u0435\u0436\u043D\u044B\u0435 \u043F\u0435\u0440\u0435\u0432\u043E\u0434\u044B");
		IndIBcheckBoxMoneyTransf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxMoneyTransf.isSelected()) {
					Parsing.all_user_selection[4] = true;
				}
			}
		});
		IndIBcheckBoxMoneyTransf.setBounds(25, 147, 179, 23);
		IndIBcheckBoxMoneyTransf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxMoneyTransf);

		IndIBcheckBoxCardWork = new JCheckBox(
				"\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u043A\u0430\u0440\u0442\u0430\u043C\u0438");
		IndIBcheckBoxCardWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxCardWork.isSelected()) {
					Parsing.all_user_selection[5] = true;
				}
			}
		});
		IndIBcheckBoxCardWork.setBounds(25, 177, 179, 23);
		IndIBcheckBoxCardWork.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxCardWork);

		IndIBcheckBoxCreditOperation = new JCheckBox(
				"\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		IndIBcheckBoxCreditOperation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxCreditOperation.isSelected()) {
					Parsing.all_user_selection[6] = true;
				}
			}
		});
		IndIBcheckBoxCreditOperation.setBounds(25, 207, 220, 23);
		IndIBcheckBoxCreditOperation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxCreditOperation);

		IndIBcheckBoxCurrency = new JCheckBox(
				"\u0412\u0430\u043B\u044E\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		IndIBcheckBoxCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxCurrency.isSelected()) {
					Parsing.all_user_selection[7] = true;
				}
			}
		});
		IndIBcheckBoxCurrency.setBounds(25, 87, 179, 23);
		IndIBcheckBoxCurrency.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxCurrency);

		IndIBcheckBoxInformationServ = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		IndIBcheckBoxInformationServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndIBcheckBoxInformationServ.isSelected()) {
					Parsing.all_user_selection[8] = true;
				}
			}
		});
		IndIBcheckBoxInformationServ.setBounds(25, 267, 179, 23);
		IndIBcheckBoxInformationServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxInformationServ);

		// Set InternetBank
		IndcheckBoxInternetBank = new JCheckBox(
				"\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		IndcheckBoxInternetBank.setBounds(6, 19, 179, 23);
		IndcheckBoxInternetBank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Ipanel_1.add(IndcheckBoxInternetBank);

		JPanel Ipanel_2 = new JPanel();
		Ipanel_2.setBounds(74, 42, 265, 307);
		Ipanel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelIndividual.add(Ipanel_2);
		Ipanel_2.setLayout(null);

		IndMBcheckBoxInformationAccount = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438  \u0441\u0447\u0435\u0442\u043E\u0432");
		IndMBcheckBoxInformationAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxInformationAccount.isSelected()) {
					Parsing.all_user_selection[9] = true;
				}
			}
		});

		IndMBcheckBoxInformationAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxInformationAccount.setBounds(22, 57, 223, 23);
		Ipanel_2.add(IndMBcheckBoxInformationAccount);

		IndMBcheckBoxCardWork = new JCheckBox(
				"\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u043A\u0430\u0440\u0442\u0430\u043C\u0438");
		IndMBcheckBoxCardWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxCardWork.isSelected()) {
					Parsing.all_user_selection[10] = true;
				}
			}
		});
		IndMBcheckBoxCardWork.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxCardWork.setBounds(22, 177, 223, 23);
		Ipanel_2.add(IndMBcheckBoxCardWork);

		IndMBcheckBoxPayServ = new JCheckBox(
				"\u041E\u043F\u043B\u0430\u0442\u0430 \u0443\u0441\u043B\u0443\u0433 \u0441 \u043F\u043E\u043C\u043E\u0449\u044C\u044E \u041F\u0421");
		IndMBcheckBoxPayServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxPayServ.isSelected()) {
					Parsing.all_user_selection[11] = true;
				}
			}
		});
		IndMBcheckBoxPayServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxPayServ.setBounds(22, 117, 223, 23);
		Ipanel_2.add(IndMBcheckBoxPayServ);

		IndMBcheckBoxMoneyTransf = new JCheckBox(
				"\u0414\u0435\u043D\u0435\u0436\u043D\u044B\u0435 \u043F\u0435\u0440\u0435\u0432\u043E\u0434\u044B\r\n");
		IndMBcheckBoxMoneyTransf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxMoneyTransf.isSelected()) {
					Parsing.all_user_selection[12] = true;
				}
			}
		});

		IndMBcheckBoxElwallet = new JCheckBox(
				"\u041F\u043E\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435 \u044D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0445 \u043A\u043E\u0448\u0435\u043B\u044C\u043A\u043E\u0432");
		IndMBcheckBoxElwallet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxElwallet.isSelected()) {
					Parsing.all_user_selection[13] = true;
				}
			}
		});
		IndMBcheckBoxElwallet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxElwallet.setBounds(22, 87, 238, 23);
		Ipanel_2.add(IndMBcheckBoxElwallet);
		IndMBcheckBoxMoneyTransf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxMoneyTransf.setBounds(22, 147, 223, 23);
		Ipanel_2.add(IndMBcheckBoxMoneyTransf);

		IndMBcheckBoxInformServ = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		IndMBcheckBoxInformServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxInformServ.isSelected()) {
					Parsing.all_user_selection[14] = true;
				}
			}
		});
		IndMBcheckBoxInformServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxInformServ.setBounds(22, 267, 223, 23);
		Ipanel_2.add(IndMBcheckBoxInformServ);

		IndMBcheckBoxTelefBank = new JCheckBox(
				"\u0422\u0435\u043B\u0435\u0444\u043E\u043D - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		IndMBcheckBoxTelefBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxTelefBank.isSelected()) {
					Parsing.all_user_selection[15] = true;
				}
			}
		});
		IndMBcheckBoxTelefBank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxTelefBank.setBounds(22, 207, 223, 23);
		Ipanel_2.add(IndMBcheckBoxTelefBank);

		IndMBcheckBoxSMS = new JCheckBox("SMS - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		IndMBcheckBoxSMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndMBcheckBoxSMS.isSelected()) {
					Parsing.all_user_selection[16] = true;
				}
			}
		});
		IndMBcheckBoxSMS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxSMS.setBounds(22, 237, 223, 23);
		Ipanel_2.add(IndMBcheckBoxSMS);

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(74, 368, 266, 34);
		panelIndividual.add(panel);
		panel.setLayout(null);

		IndcheckBoxATM = new JCheckBox(
				"\u041D\u0430\u043B\u0438\u0447\u0438\u0435 \u0431\u0430\u043D\u043A\u043E\u043C\u0430\u0442\u043E\u0432/\u0442\u0435\u0440\u043C\u0438\u043D\u0430\u043B\u043E\u0432");
		IndcheckBoxATM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndcheckBoxATM.isSelected()) {
					Parsing.all_user_selection[17] = true;
				}
			}
		});
		IndcheckBoxATM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IndcheckBoxATM.setBounds(9, 4, 251, 23);
		panel.add(IndcheckBoxATM);

		// indServicesCheckBoxMobBankEnabledFalse();

		// Set MobileBank
		IndcheckBoxMobileBank = new JCheckBox(
				"\u041C\u043E\u0431\u0438\u043B\u044C\u043D\u044B\u0439 \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		/*
		 * IndcheckBoxMobileBank.addItemListener(new ItemListener(){ public void
		 * itemStateChanged(ItemEvent ie){
		 * 
		 * if(IndcheckBoxMobileBank.isSelected()) {
		 * 
		 * indServicesCheckBoxMobBankEnabledTrue(); } else{
		 * 
		 * //indServicesCheckBoxMobBankSelectedFalse();
		 * indServicesCheckBoxMobBankEnabledFalse();
		 * indServicesCheckBoxMobBankSelectedFalse();
		 * 
		 * } }
		 * 
		 * 
		 * });
		 */
		IndcheckBoxMobileBank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IndcheckBoxMobileBank.setBounds(6, 19, 180, 23);
		Ipanel_2.add(IndcheckBoxMobileBank);

		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 684, 502);
		panelIndividual.add(label);

		// listenerIndServicesCheckBox();

	}

	private void initializeEntity() {
		panelEntityUser = new JPanel();
		frmDboBroker.getContentPane().add(panelEntityUser, "name_987915577228");
		panelEntityUser.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(42, 107, 279, 275);
		panelEntityUser.add(panel_1);

		EntIBcheckBoxMBmanageAccount = new JCheckBox(
				"\u0423\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u043C\u0438 \u0441\u0447\u0435\u0442\u0430\u043C\u0438");
		EntIBcheckBoxMBmanageAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntIBcheckBoxMBmanageAccount.isSelected()) {
					Parsing.all_user_selection[0] = true;
				}
			}
		});
		EntIBcheckBoxMBmanageAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxMBmanageAccount.setBounds(22, 57, 223, 23);
		panel_1.add(EntIBcheckBoxMBmanageAccount);

		EntIBcheckBoxCredit = new JCheckBox(
				"\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntIBcheckBoxCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntIBcheckBoxCredit.isSelected()) {
					Parsing.all_user_selection[2] = true;
				}
			}
		});
		EntIBcheckBoxCredit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxCredit.setBounds(22, 87, 238, 23);
		panel_1.add(EntIBcheckBoxCredit);

		EntIBcheckBoxCurrency = new JCheckBox(
				"\u0412\u0430\u043B\u044E\u0442\u0433\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntIBcheckBoxCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntIBcheckBoxCurrency.isSelected()) {
					Parsing.all_user_selection[3] = true;
				}
			}
		});
		EntIBcheckBoxCurrency.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxCurrency.setBounds(22, 117, 223, 23);
		panel_1.add(EntIBcheckBoxCurrency);

		EntIBcheckBoxElDoc = new JCheckBox(
				"\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u044D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u043C\u0438 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430\u043C\u0438");
		EntIBcheckBoxElDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntIBcheckBoxElDoc.isSelected()) {
					Parsing.all_user_selection[4] = true;
				}
			}
		});
		EntIBcheckBoxElDoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxElDoc.setBounds(22, 147, 251, 23);
		panel_1.add(EntIBcheckBoxElDoc);

		EntIBcheckBoxEinv = new JCheckBox("E-invoicing");
		EntIBcheckBoxEinv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntIBcheckBoxEinv.isSelected()) {
					Parsing.all_user_selection[5] = true;
				}
			}
		});
		EntIBcheckBoxEinv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxEinv.setBounds(22, 177, 223, 23);
		panel_1.add(EntIBcheckBoxEinv);

		EntIBcheckBoxImpExp1C = new JCheckBox(
				"\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 1\u0421");
		EntIBcheckBoxImpExp1C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntIBcheckBoxImpExp1C.isSelected()) {
					Parsing.all_user_selection[6] = true;
				}
			}
		});
		EntIBcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxImpExp1C.setBounds(22, 207, 244, 23);
		panel_1.add(EntIBcheckBoxImpExp1C);

		EntIBcheckBoxInfServ = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntIBcheckBoxInfServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntIBcheckBoxInfServ.isSelected()) {
					Parsing.all_user_selection[7] = true;
				}
			}
		});
		EntIBcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxInfServ.setBounds(22, 237, 223, 23);
		panel_1.add(EntIBcheckBoxInfServ);

		EntcheckBoxIntBank = new JCheckBox(
				"\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntcheckBoxIntBank.setBounds(6, 18, 179, 23);
		panel_1.add(EntcheckBoxIntBank);
		EntcheckBoxIntBank.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(357, 107, 279, 275);
		panelEntityUser.add(panel_2);

		EntMBcheckBoxnIformStateAccount = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438 \u0441\u0447\u0435\u0442\u043E\u0432");
		EntMBcheckBoxnIformStateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntMBcheckBoxnIformStateAccount.isSelected()) {
					Parsing.all_user_selection[8] = true;
				}
			}
		});
		EntMBcheckBoxnIformStateAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxnIformStateAccount.setBounds(25, 57, 235, 23);
		panel_2.add(EntMBcheckBoxnIformStateAccount);

		EntMBcheckBoxInfCash = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0434\u0432\u0438\u0436\u0435\u043D\u0438\u0438 \u0434\u0435\u043D\u0435\u0436\u043D\u044B\u0445 \u043F\u043E\u0442\u043E\u043A\u043E\u0432");
		EntMBcheckBoxInfCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntMBcheckBoxInfCash.isSelected()) {
					Parsing.all_user_selection[9] = true;
				}
			}
		});
		EntMBcheckBoxInfCash.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxInfCash.setBounds(25, 87, 248, 23);
		panel_2.add(EntMBcheckBoxInfCash);
		EntMBcheckBoxInfCash.setToolTipText("информация о движении денежных потоков");

		EntMBcheckBoxFinOperations = new JCheckBox(
				"\u0424\u0438\u043D\u0430\u043D\u0441\u043E\u0432\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntMBcheckBoxFinOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntMBcheckBoxFinOperations.isSelected()) {
					Parsing.all_user_selection[10] = true;
				}
			}
		});
		EntMBcheckBoxFinOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxFinOperations.setBounds(25, 117, 219, 23);
		panel_2.add(EntMBcheckBoxFinOperations);
		EntMBcheckBoxFinOperations.setToolTipText("налоговые платежи, поручения");

		EntMBcheckBoxTelefBank = new JCheckBox(
				"\u0422\u0435\u043B\u0435\u0444\u043E\u043D - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntMBcheckBoxTelefBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntMBcheckBoxTelefBank.isSelected()) {
					Parsing.all_user_selection[11] = true;
				}
			}
		});
		EntMBcheckBoxTelefBank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxTelefBank.setBounds(25, 147, 179, 23);
		panel_2.add(EntMBcheckBoxTelefBank);

		EntMBcheckBoxInfServices = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntMBcheckBoxInfServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntMBcheckBoxInfServices.isSelected()) {
					Parsing.all_user_selection[12] = true;
				}
			}
		});
		EntMBcheckBoxInfServices.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxInfServices.setBounds(25, 237, 179, 23);
		panel_2.add(EntMBcheckBoxInfServices);

		EntMBcheckBoxSmsBank = new JCheckBox("SMS - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntMBcheckBoxSmsBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntMBcheckBoxSmsBank.isSelected()) {
					Parsing.all_user_selection[13] = true;
				}
			}
		});
		EntMBcheckBoxSmsBank.setBounds(25, 177, 223, 23);
		panel_2.add(EntMBcheckBoxSmsBank);
		EntMBcheckBoxSmsBank.setFont(new Font("Tahoma", Font.PLAIN, 12));

		EntCheckBoxMobBank = new JCheckBox(
				"\u041C\u043E\u0431\u0438\u043B\u044C\u043D\u044B\u0439 \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntCheckBoxMobBank.setBounds(6, 19, 180, 23);
		panel_2.add(EntCheckBoxMobBank);
		EntCheckBoxMobBank.setFont(new Font("Tahoma", Font.PLAIN, 14));

		EntMBcheckBoxSendingDoc = new JCheckBox(
				"\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430 \u0432 \u0431\u0430\u043D\u043A \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432");
		EntMBcheckBoxSendingDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntMBcheckBoxSendingDoc.isSelected()) {
					Parsing.all_user_selection[14] = true;
				}
			}
		});
		EntMBcheckBoxSendingDoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxSendingDoc.setBounds(25, 207, 223, 23);
		panel_2.add(EntMBcheckBoxSendingDoc);

		JLabel label = new JLabel(
				"\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(185, 21, 312, 20);
		panelEntityUser.add(label);

		JButton EntButtonNext = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		EntButtonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelEntity2.setVisible(true);
				panelEntityUser.setVisible(false);
				flag = 0;
			}
		});
		EntButtonNext.setForeground(new Color(0, 128, 128));
		EntButtonNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntButtonNext.setBounds(529, 447, 107, 32);
		panelEntityUser.add(EntButtonNext);

		JButton EntbuttonBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		EntbuttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntityChoice.setVisible(true);
				panelEntityUser.setVisible(false);
			}
		});
		EntbuttonBack.setForeground(new Color(0, 128, 128));
		EntbuttonBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntbuttonBack.setBounds(42, 447, 107, 32);
		panelEntityUser.add(EntbuttonBack);

		JLabel label_4 = new JLabel(
				"\u0421\u0440\u0435\u0434\u043D\u0438\u0439 \u0438 \u043C\u0430\u043B\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 0));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(182, 52, 325, 20);
		panelEntityUser.add(label_4);

		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 0, 684, 502);
		panelEntityUser.add(label_1);

		panelEntity2 = new JPanel();
		frmDboBroker.getContentPane().add(panelEntity2, "name_11714107687463");
		panelEntity2.setLayout(null);

		JLabel label_2 = new JLabel(
				"\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(173, 11, 312, 20);
		panelEntity2.add(label_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(84, 73, 512, 318);
		panelEntity2.add(panel_3);
		panel_3.setLayout(null);

		EntcheckBoxBankClient = new JCheckBox("\u0411\u0430\u043D\u043A - \u043A\u043B\u0438\u0435\u043D\u0442");
		EntcheckBoxBankClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntcheckBoxBankClient.setBounds(27, 23, 180, 23);
		panel_3.add(EntcheckBoxBankClient);

		EntBCcheckBoxInfAccount = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438  \u0441\u0447\u0435\u0442\u043E\u0432");
		EntBCcheckBoxInfAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxInfAccount.isSelected()) {
					Parsing.all_user_selection[15] = true;
				}
			}
		});
		EntBCcheckBoxInfAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxInfAccount.setBounds(43, 61, 223, 23);
		panel_3.add(EntBCcheckBoxInfAccount);

		EntBCcheckBoxFinOperations = new JCheckBox(
				"\u0424\u0438\u043D\u0430\u043D\u0441\u043E\u0432\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntBCcheckBoxFinOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxFinOperations.isSelected()) {
					Parsing.all_user_selection[16] = true;
				}
			}
		});
		EntBCcheckBoxFinOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxFinOperations.setBounds(43, 91, 238, 23);
		panel_3.add(EntBCcheckBoxFinOperations);
		EntBCcheckBoxFinOperations.setToolTipText("налоговые платежи, поручения");

		EntBCcheckBoxElectronDocumentsManage = new JCheckBox(
				"\u042D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0439 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u043E\u0431\u043E\u0440\u043E\u0442");
		EntBCcheckBoxElectronDocumentsManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxElectronDocumentsManage.isSelected()) {
					Parsing.all_user_selection[17] = true;
				}
			}
		});
		EntBCcheckBoxElectronDocumentsManage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxElectronDocumentsManage.setBounds(43, 121, 223, 23);
		panel_3.add(EntBCcheckBoxElectronDocumentsManage);

		EntBCcheckBoxCurrencyOperations = new JCheckBox(
				"\u041E\u043F\u0435\u0440\u0430\u0446\u0438\u0438 \u0441 \u0432\u0430\u043B\u044E\u0442\u0430\u043C\u0438\r\n");
		EntBCcheckBoxCurrencyOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxCurrencyOperations.isSelected()) {
					Parsing.all_user_selection[18] = true;
				}
			}
		});
		EntBCcheckBoxCurrencyOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxCurrencyOperations.setBounds(43, 151, 223, 23);
		panel_3.add(EntBCcheckBoxCurrencyOperations);

		EntBCcheckBoxImpExp1C = new JCheckBox(
				"\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 1\u0421");
		EntBCcheckBoxImpExp1C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxImpExp1C.isSelected()) {
					Parsing.all_user_selection[19] = true;
				}
			}
		});
		EntBCcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxImpExp1C.setBounds(43, 181, 238, 23);
		panel_3.add(EntBCcheckBoxImpExp1C);

		EntBCcheckBoxSeparatedAccessDocum = new JCheckBox(
				"\u0420\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u043D\u044B\u0439 \u0434\u043E\u0441\u0442\u0443\u043F \u043A \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430\u043C");
		EntBCcheckBoxSeparatedAccessDocum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxSeparatedAccessDocum.isSelected()) {
					Parsing.all_user_selection[20] = true;
				}
			}
		});
		EntBCcheckBoxSeparatedAccessDocum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxSeparatedAccessDocum.setBounds(43, 211, 276, 23);
		panel_3.add(EntBCcheckBoxSeparatedAccessDocum);

		EntBCcheckBoxInfServ = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntBCcheckBoxInfServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxInfServ.isSelected()) {
					Parsing.all_user_selection[21] = true;
				}
			}
		});
		EntBCcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxInfServ.setBounds(43, 241, 223, 23);
		panel_3.add(EntBCcheckBoxInfServ);

		EntBCcheckBoxMessageExchange = new JCheckBox(
				"\u041E\u0431\u043C\u0435\u043D \u0441\u043E\u043E\u0431\u0449\u0435\u043D\u0438\u044F\u043C\u0438 \u0441\u0432\u043E\u0431\u043E\u0434\u043D\u043E\u0433\u043E \u0444\u043E\u0440\u043C\u0430\u0442\u0430");
		EntBCcheckBoxMessageExchange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntBCcheckBoxMessageExchange.isSelected()) {
					Parsing.all_user_selection[22] = true;
				}
			}
		});
		EntBCcheckBoxMessageExchange.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxMessageExchange.setBounds(43, 271, 276, 23);
		panel_3.add(EntBCcheckBoxMessageExchange);

		JLabel label_3 = new JLabel(
				"\u0421\u0440\u0435\u0434\u043D\u0438\u0439 \u0438 \u043C\u0430\u043B\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441");
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(171, 42, 325, 20);
		panelEntity2.add(label_3);

		JButton Ent2buttonBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		Ent2buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelEntityUser.setVisible(true);
				panelEntity2.setVisible(false);
			}
		});
		Ent2buttonBack.setForeground(new Color(0, 128, 128));
		Ent2buttonBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ent2buttonBack.setBounds(84, 444, 107, 32);
		panelEntity2.add(Ent2buttonBack);

		JButton Ent2buttonNext = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		Ent2buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFilter.setVisible(true);
				panelEntity2.setVisible(false);
				flag = 0;
			}
		});
		Ent2buttonNext.setForeground(new Color(0, 128, 128));
		Ent2buttonNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ent2buttonNext.setBounds(489, 444, 107, 32);
		panelEntity2.add(Ent2buttonNext);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		lblNewLabel_5.setBounds(0, 0, 684, 502);
		panelEntity2.add(lblNewLabel_5);

		listenerEntSBServicesCheckBox();

	}

	private void initializeSecurityind() {
		panelSecurityInd = new JPanel();
		frmDboBroker.getContentPane().add(panelSecurityInd, "name_29180344707192");
		panelSecurityInd.setLayout(null);

		JPanel panelSecurAddition = new JPanel();
		panelSecurAddition.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelSecurAddition.setBounds(103, 68, 480, 328);
		panelSecurityInd.add(panelSecurAddition);
		panelSecurAddition.setLayout(null);

		chckbxSVirtualKeyboard = new JCheckBox(
				"\u0412\u0438\u0440\u0442\u0443\u0430\u043B\u044C\u043D\u0430\u044F \u043A\u043B\u0430\u0432\u0438\u0430\u0442\u0443\u0440\u0430");
		chckbxSVirtualKeyboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSVirtualKeyboard.isSelected()) {
					Parsing.tmp_security_selection[0] = true;
				}
			}
		});
		chckbxSVirtualKeyboard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSVirtualKeyboard.setBounds(31, 34, 198, 23);
		panelSecurAddition.add(chckbxSVirtualKeyboard);
		chckbxSVirtualKeyboard.setToolTipText(
				"данная технология повышает степень защищенности Вашего пароля от перехвата злоумышленниками");

		chckbxSsslSecur = new JCheckBox(
				"\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u043F\u0440\u043E\u0442\u043E\u043A\u043E\u043B\u0430 SSL");
		chckbxSsslSecur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSsslSecur.isSelected()) {
					Parsing.tmp_security_selection[1] = true;
				}
			}
		});
		chckbxSsslSecur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSsslSecur.setBounds(31, 69, 282, 23);
		panelSecurAddition.add(chckbxSsslSecur);
		chckbxSsslSecur
				.setToolTipText("протокол позволяет обеспечить проверку подлинности сервера и шифрование сессии");

		chckbxSSmsAunt = new JCheckBox(
				"SMS - \u0430\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F");
		chckbxSSmsAunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSSmsAunt.isSelected()) {
					Parsing.tmp_security_selection[2] = true;
				}
			}
		});
		chckbxSSmsAunt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSSmsAunt.setBounds(31, 273, 282, 23);
		panelSecurAddition.add(chckbxSSmsAunt);
		chckbxSSmsAunt.setToolTipText(
				"проверка подлинности пользователя путём сравнения введённого им пароля с паролем, присланным на указанный им номер");

		chckbxSAutoExit = new JCheckBox(
				"\u0410\u0432\u0442\u043E\u043E\u0442\u043A\u043B\u044E\u0447\u0435\u043D\u0438\u0435 \u0441\u0435\u0430\u043D\u0441\u0430");
		chckbxSAutoExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSAutoExit.isSelected()) {
					Parsing.tmp_security_selection[3] = true;
				}
			}
		});
		chckbxSAutoExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSAutoExit.setBounds(31, 139, 198, 23);
		panelSecurAddition.add(chckbxSAutoExit);
		chckbxSAutoExit.setToolTipText(
				"автоматический выход из системы в случае неактивности пользователя в течение определенного времени");

		chckbxSCheckIp = new JCheckBox("\u041F\u0440\u043E\u0432\u0435\u0440\u043A\u0430 IP");
		chckbxSCheckIp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSCheckIp.isSelected()) {
					Parsing.tmp_security_selection[4] = true;
				}
			}
		});
		chckbxSCheckIp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSCheckIp.setBounds(31, 174, 198, 23);
		panelSecurAddition.add(chckbxSCheckIp);
		chckbxSCheckIp.setToolTipText(
				"позволяет пользователю отслеживать активность в системе и блокировать доступ к ней в случае обнаружения подозрительных сеансов");

		chckbxSaveApplication = new JCheckBox(
				"\u0417\u0430\u0449\u0438\u0449\u0435\u043D\u043D\u044B\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u044F");
		chckbxSaveApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSaveApplication.isSelected()) {
					Parsing.tmp_security_selection[5] = true;
				}
			}
		});
		chckbxSaveApplication.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSaveApplication.setBounds(31, 104, 198, 23);
		panelSecurAddition.add(chckbxSaveApplication);
		chckbxSaveApplication
				.setToolTipText("наличие защищенных приложений для получения удаленного доступа к системе");

		chckbxS3Dsecure = new JCheckBox(
				"\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u0442\u0435\u0445\u043D\u043E\u043B\u043E\u0433\u0438\u0438 3D - Secure");
		chckbxS3Dsecure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxS3Dsecure.isSelected()) {
					Parsing.tmp_security_selection[6] = true;
				}
			}
		});
		chckbxS3Dsecure.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxS3Dsecure.setBounds(30, 209, 334, 23);
		panelSecurAddition.add(chckbxS3Dsecure);
		chckbxS3Dsecure.setToolTipText("предусматривает проверку подлинности выполняемой операции с карты");

		checkBoxSApparatAuthentication = new JCheckBox(
				"\u0410\u043F\u043F\u0430\u0440\u0430\u0442\u043D\u0430\u044F \u0430\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F");
		checkBoxSApparatAuthentication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBoxSApparatAuthentication.isSelected()) {
					Parsing.tmp_security_selection[7] = true;
				}
			}
		});
		checkBoxSApparatAuthentication.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkBoxSApparatAuthentication.setBounds(31, 243, 334, 23);
		panelSecurAddition.add(checkBoxSApparatAuthentication);
		checkBoxSApparatAuthentication.setToolTipText("использование смарт-карт, токенов");

		JLabel labelSsettings = new JLabel(
				"\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
		labelSsettings.setForeground(new Color(255, 255, 0));
		labelSsettings.setHorizontalAlignment(SwingConstants.CENTER);
		labelSsettings.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelSsettings.setBounds(202, 30, 293, 27);
		panelSecurityInd.add(labelSsettings);

		JButton btnSnext = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		btnSnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelIndividual.setVisible(true);
				panelSecurityInd.setVisible(false);

			}
		});
		btnSnext.setForeground(new Color(0, 128, 128));
		btnSnext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSnext.setBounds(476, 429, 107, 32);
		panelSecurityInd.add(btnSnext);

		JButton btnSback = new JButton("\u041D\u0430\u0437\u0430\u0434");
		btnSback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFirstPage.setVisible(true);
				panelSecurityInd.setVisible(false);
			}
		});

		btnSback.setForeground(new Color(0, 128, 128));
		btnSback.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSback.setBounds(103, 429, 107, 32);
		panelSecurityInd.add(btnSback);

		label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label_14.setVerticalAlignment(SwingConstants.TOP);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(0, 0, 684, 502);
		panelSecurityInd.add(label_14);

	}

	private void initializeEntityChoice() {

		EntityChoice = new JPanel();
		frmDboBroker.getContentPane().add(EntityChoice, "name_16217133247344");
		EntityChoice.setLayout(null);

		label_6 = new JLabel(
				"\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 255, 0));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(186, 33, 312, 20);
		EntityChoice.add(label_6);

		panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(30, 96, 294, 255);
		EntityChoice.add(panel_4);
		panel_4.setLayout(null);

		EntChoicebuttonSmallBusiness = new JButton(
				"\u0421\u0440\u0435\u0434\u043D\u0438\u0439 \u0438 \u043C\u0430\u043B\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441");
		EntChoicebuttonSmallBusiness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEntityUser.setVisible(true);
				EntityChoice.setVisible(false);
				person = 1;
			}
		});
		EntChoicebuttonSmallBusiness.setForeground(new Color(0, 128, 128));
		EntChoicebuttonSmallBusiness.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntChoicebuttonSmallBusiness.setBounds(62, 71, 177, 64);
		panel_4.add(EntChoicebuttonSmallBusiness);

		panel_5 = new JPanel();
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBounds(360, 96, 294, 255);
		EntityChoice.add(panel_5);
		panel_5.setLayout(null);

		EntChoicebuttonCorporations = new JButton("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u0438");
		EntChoicebuttonCorporations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCorporations.setVisible(true);
				EntityChoice.setVisible(false);
				person = 2;
			}
		});
		EntChoicebuttonCorporations.setForeground(new Color(0, 128, 128));
		EntChoicebuttonCorporations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntChoicebuttonCorporations.setBounds(58, 71, 177, 67);
		panel_5.add(EntChoicebuttonCorporations);

		button_2 = new JButton("\u041D\u0430\u0437\u0430\u0434");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (chckbxSetDefault.isSelected()) {
					panelFirstPage.setVisible(true);
					EntityChoice.setVisible(false);
				} else {
					panelSecurityEntity.setVisible(true);
					EntityChoice.setVisible(false);
				}
			}
		});
		button_2.setForeground(new Color(0, 128, 128));
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBounds(30, 408, 107, 32);
		EntityChoice.add(button_2);

		label_16 = new JLabel("New label");
		label_16.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label_16.setVerticalAlignment(SwingConstants.TOP);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(0, 0, 684, 502);
		EntityChoice.add(label_16);

	}

	private void initializeCorporations() {
		panelCorporations = new JPanel();
		frmDboBroker.getContentPane().add(panelCorporations, "name_21155801050999");
		panelCorporations.setLayout(null);

		label_8 = new JLabel(
				"\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(255, 255, 0));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(183, 11, 312, 20);
		panelCorporations.add(label_8);

		label_9 = new JLabel("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u0438");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(new Color(255, 255, 0));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(180, 42, 325, 20);
		panelCorporations.add(label_9);

		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7.setBounds(67, 68, 548, 275);
		panelCorporations.add(panel_7);

		EntCorpIBcheckBoxManageAccount = new JCheckBox(
				"\u0423\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u043C\u0438 \u0441\u0447\u0435\u0442\u0430\u043C\u0438");
		EntCorpIBcheckBoxManageAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpIBcheckBoxManageAccount.isSelected()) {
					Parsing.all_user_selection[0] = true;
				}
			}
		});
		EntCorpIBcheckBoxManageAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxManageAccount.setBounds(22, 57, 223, 23);
		panel_7.add(EntCorpIBcheckBoxManageAccount);

		EntCorpIBcheckBoxCredit = new JCheckBox(
				"\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntCorpIBcheckBoxCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpIBcheckBoxCredit.isSelected()) {
					Parsing.all_user_selection[1] = true;
				}
			}
		});
		EntCorpIBcheckBoxCredit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxCredit.setBounds(22, 87, 238, 23);
		panel_7.add(EntCorpIBcheckBoxCredit);

		EntCorpIBcheckBoxCurrency = new JCheckBox(
				"\u0412\u0430\u043B\u044E\u0442\u0433\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntCorpIBcheckBoxCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpIBcheckBoxCurrency.isSelected()) {
					Parsing.all_user_selection[2] = true;
				}
			}
		});
		EntCorpIBcheckBoxCurrency.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxCurrency.setBounds(22, 117, 223, 23);
		panel_7.add(EntCorpIBcheckBoxCurrency);

		EntCorpIBcheckBoxPayDocuments = new JCheckBox(
				"\u041F\u0440\u0438\u0435\u043C \u0438 \u043E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0430 \u044D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0445 \u043F\u043B\u0430\u0442\u0435\u0436\u043D\u044B\u0445 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432");
		EntCorpIBcheckBoxPayDocuments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpIBcheckBoxPayDocuments.isSelected()) {
					Parsing.all_user_selection[3] = true;
				}
			}
		});
		EntCorpIBcheckBoxPayDocuments.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxPayDocuments.setBounds(22, 147, 505, 23);
		panel_7.add(EntCorpIBcheckBoxPayDocuments);

		EntCorpIBcheckBoxEinv = new JCheckBox("E-invoicing");
		EntCorpIBcheckBoxEinv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpIBcheckBoxEinv.isSelected()) {
					Parsing.all_user_selection[4] = true;
				}
			}
		});
		EntCorpIBcheckBoxEinv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxEinv.setBounds(22, 177, 223, 23);
		panel_7.add(EntCorpIBcheckBoxEinv);

		EntCorpIBcheckBoxImpExp1C = new JCheckBox(
				"\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 1\u0421");
		EntCorpIBcheckBoxImpExp1C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpIBcheckBoxImpExp1C.isSelected()) {
					Parsing.all_user_selection[5] = true;
				}
			}
		});
		EntCorpIBcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxImpExp1C.setBounds(22, 207, 244, 23);
		panel_7.add(EntCorpIBcheckBoxImpExp1C);

		EntCorpIBcheckBoxInfServ = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntCorpIBcheckBoxInfServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpIBcheckBoxInfServ.isSelected()) {
					Parsing.all_user_selection[6] = true;
				}
			}
		});
		EntCorpIBcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxInfServ.setBounds(22, 237, 223, 23);
		panel_7.add(EntCorpIBcheckBoxInfServ);

		EntCorpcheckBoxIB = new JCheckBox(
				"\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntCorpcheckBoxIB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntCorpcheckBoxIB.setBounds(6, 18, 179, 23);
		panel_7.add(EntCorpcheckBoxIB);

		EntCorpIBbuttonBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		EntCorpIBbuttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntityChoice.setVisible(true);
				panelCorporations.setVisible(false);
			}
		});
		EntCorpIBbuttonBack.setForeground(new Color(0, 128, 128));
		EntCorpIBbuttonBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBbuttonBack.setBounds(67, 432, 107, 32);
		panelCorporations.add(EntCorpIBbuttonBack);

		EntCorpIBbuttonNext = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		EntCorpIBbuttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCorporations2.setVisible(true);
				panelCorporations.setVisible(false);
			}
		});
		EntCorpIBbuttonNext.setForeground(new Color(0, 128, 128));
		EntCorpIBbuttonNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBbuttonNext.setBounds(508, 432, 107, 32);
		panelCorporations.add(EntCorpIBbuttonNext);

		label_12 = new JLabel("New label");
		label_12.setBounds(0, 0, 687, 505);
		panelCorporations.add(label_12);
		label_12.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label_12.setVerticalAlignment(SwingConstants.TOP);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
	}

	private void initializeCorporations2() {
		panelCorporations2 = new JPanel();
		frmDboBroker.getContentPane().add(panelCorporations2, "name_2591187471494");
		panelCorporations2.setLayout(null);

		JLabel label = new JLabel(
				"\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(200, 11, 312, 20);
		panelCorporations2.add(label);

		JLabel label_1 = new JLabel("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u0438");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(197, 42, 325, 20);
		panelCorporations2.add(label_1);

		JButton buttonCorp2Back = new JButton("\u041D\u0430\u0437\u0430\u0434");
		buttonCorp2Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelCorporations.setVisible(true);
				panelCorporations2.setVisible(false);

			}
		});
		buttonCorp2Back.setForeground(new Color(0, 128, 128));
		buttonCorp2Back.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonCorp2Back.setBounds(36, 437, 107, 32);
		panelCorporations2.add(buttonCorp2Back);

		JButton buttonCorp2Next = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		buttonCorp2Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelFilter.setVisible(true);
				panelCorporations2.setVisible(false);
				flag = 2;

			}
		});
		buttonCorp2Next.setForeground(new Color(0, 128, 128));
		buttonCorp2Next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonCorp2Next.setBounds(539, 437, 107, 32);
		panelCorporations2.add(buttonCorp2Next);

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(36, 73, 610, 33);
		panelCorporations2.add(panel);
		panel.setLayout(null);

		EntCorp2checkBoxBankClient = new JCheckBox("\u0411\u0430\u043D\u043A - \u043A\u043B\u0438\u0435\u043D\u0442");
		EntCorp2checkBoxBankClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntCorp2checkBoxBankClient.setBounds(6, 7, 554, 23);
		panel.add(EntCorp2checkBoxBankClient);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(36, 117, 300, 297);
		panelCorporations2.add(panel_1);
		panel_1.setLayout(null);

		EntCorp2BCcheckBoxInfAccount = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438  \u0441\u0447\u0435\u0442\u043E\u0432");
		EntCorp2BCcheckBoxInfAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxInfAccount.isSelected()) {
					Parsing.all_user_selection[7] = true;
				}
			}
		});
		EntCorp2BCcheckBoxInfAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxInfAccount.setBounds(24, 7, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxInfAccount);

		EntCorp2BCcheckBoxFinOperations = new JCheckBox(
				"\u0424\u0438\u043D\u0430\u043D\u0441\u043E\u0432\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntCorp2BCcheckBoxFinOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxFinOperations.isSelected()) {
					Parsing.all_user_selection[8] = true;
				}
			}
		});
		EntCorp2BCcheckBoxFinOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxFinOperations.setBounds(24, 37, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxFinOperations);
		EntCorp2BCcheckBoxFinOperations.setToolTipText("налоговые платежи, поручения");

		EntCorp2BCcheckBoxElecDocuments = new JCheckBox(
				"\u042D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0439 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u043E\u0431\u043E\u0440\u043E\u0442");
		EntCorp2BCcheckBoxElecDocuments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxElecDocuments.isSelected()) {
					Parsing.all_user_selection[9] = true;
				}
			}
		});
		EntCorp2BCcheckBoxElecDocuments.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxElecDocuments.setBounds(24, 67, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxElecDocuments);

		EntCorp2BCcheckBoxCurOperations = new JCheckBox(
				"\u041E\u043F\u0435\u0440\u0430\u0446\u0438\u0438 \u0441 \u0432\u0430\u043B\u044E\u0442\u0430\u043C\u0438\r\n");
		EntCorp2BCcheckBoxCurOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxCurOperations.isSelected()) {
					Parsing.all_user_selection[10] = true;
				}
			}
		});
		EntCorp2BCcheckBoxCurOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxCurOperations.setBounds(24, 97, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxCurOperations);

		EntCorp2BCcheckBoxImpExp1C = new JCheckBox(
				"\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 1\u0421");
		EntCorp2BCcheckBoxImpExp1C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxImpExp1C.isSelected()) {
					Parsing.all_user_selection[11] = true;
				}
			}
		});
		EntCorp2BCcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxImpExp1C.setBounds(24, 127, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxImpExp1C);

		EntCorp2BCcheckBoxSeparAccess = new JCheckBox(
				"\u0420\u0430\u0441\u043F\u0440\u0435\u0434\u0435\u043B\u0435\u043D\u043D\u044B\u0439 \u0434\u043E\u0441\u0442\u0443\u043F \u043A \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430\u043C");
		EntCorp2BCcheckBoxSeparAccess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxSeparAccess.isSelected()) {
					Parsing.all_user_selection[12] = true;
				}
			}
		});
		EntCorp2BCcheckBoxSeparAccess.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxSeparAccess.setBounds(24, 157, 270, 23);
		panel_1.add(EntCorp2BCcheckBoxSeparAccess);

		EntCorp2BCcheckBoxInfServ = new JCheckBox(
				"\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntCorp2BCcheckBoxInfServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxInfServ.isSelected()) {
					Parsing.all_user_selection[13] = true;
				}
			}
		});
		EntCorp2BCcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxInfServ.setBounds(24, 187, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxInfServ);

		EntCorp2BCcheckBoxMessExchange = new JCheckBox(
				"\u041E\u0431\u043C\u0435\u043D \u0441\u043E\u043E\u0431\u0449\u0435\u043D\u0438\u044F\u043C\u0438 \u0441\u0432\u043E\u0431\u043E\u0434\u043D\u043E\u0433\u043E \u0444\u043E\u0440\u043C\u0430\u0442\u0430");
		EntCorp2BCcheckBoxMessExchange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxMessExchange.isSelected()) {
					Parsing.all_user_selection[14] = true;
				}
			}
		});
		EntCorp2BCcheckBoxMessExchange.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxMessExchange.setBounds(24, 217, 270, 23);
		panel_1.add(EntCorp2BCcheckBoxMessExchange);

		EntCorp2BCcheckBoxCorpCards = new JCheckBox(
				"\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0442\u0438\u0432\u043D\u044B\u0435 \u043A\u0430\u0440\u0442\u044B");
		EntCorp2BCcheckBoxCorpCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxCorpCards.isSelected()) {
					Parsing.all_user_selection[15] = true;
				}
			}
		});
		EntCorp2BCcheckBoxCorpCards.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxCorpCards.setBounds(24, 247, 270, 23);
		panel_1.add(EntCorp2BCcheckBoxCorpCards);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(346, 117, 300, 297);
		panelCorporations2.add(panel_2);
		panel_2.setLayout(null);

		EntCorp2BCcheckBoxEinv = new JCheckBox("E-invoicing");
		EntCorp2BCcheckBoxEinv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxEinv.isSelected()) {
					Parsing.all_user_selection[16] = true;
				}
			}
		});
		EntCorp2BCcheckBoxEinv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxEinv.setBounds(6, 7, 223, 23);
		panel_2.add(EntCorp2BCcheckBoxEinv);

		EntCorp2BCcheckBoxAcquiring = new JCheckBox("\u042D\u043A\u0432\u0430\u0439\u0440\u0438\u043D\u0433");
		EntCorp2BCcheckBoxAcquiring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxAcquiring.isSelected()) {
					Parsing.all_user_selection[17] = true;
				}
			}
		});
		EntCorp2BCcheckBoxAcquiring.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxAcquiring.setBounds(6, 37, 238, 23);
		panel_2.add(EntCorp2BCcheckBoxAcquiring);

		EntCorp2BCcheckBoxBudgetSub = new JCheckBox(
				"\u0411\u044E\u0434\u0436\u0435\u0442 - \u043F\u043E\u0434\u0440\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u0438\u044F ");
		EntCorp2BCcheckBoxBudgetSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxBudgetSub.isSelected()) {
					Parsing.all_user_selection[18] = true;
				}
			}
		});
		EntCorp2BCcheckBoxBudgetSub.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxBudgetSub.setBounds(6, 67, 288, 23);
		panel_2.add(EntCorp2BCcheckBoxBudgetSub);
		EntCorp2BCcheckBoxBudgetSub.setToolTipText("управление филиалами");

		EntCorp2BCcheckBoxTransferPaySystem = new JCheckBox(
				"\u0421\u0438\u0441\u0442\u0435\u043C\u0430 \u043F\u0435\u0440\u0435\u0432\u043E\u0434\u043E\u0432 \u0432 \u043E\u043F\u043B\u0430\u0442\u0443 \u0443\u0441\u043B\u0443\u0433");
		EntCorp2BCcheckBoxTransferPaySystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxTransferPaySystem.isSelected()) {
					Parsing.all_user_selection[19] = true;
				}
			}
		});
		EntCorp2BCcheckBoxTransferPaySystem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxTransferPaySystem.setBounds(6, 97, 244, 23);
		panel_2.add(EntCorp2BCcheckBoxTransferPaySystem);

		EntCorp2BCcheckBoxWorkNumOrganisations = new JCheckBox(
				"\u0420\u0430\u0431\u043E\u0442\u0430 \u043D\u0435\u0441\u043A\u043E\u043B\u044C\u043A\u0438\u0445 \u043E\u0440\u0433\u0430\u043D\u0438\u0437\u0430\u0446\u0438\u0439 \u0432 \u043E\u0434\u043D\u043E\u043C \u0430\u0432\u0442\u043E\u043C\u0430\u0442\u0438\u0437\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u043E\u043C \u0440\u0430\u0431\u043E\u0447\u0435\u043C \u043C\u0435\u0441\u0442\u0435");
		EntCorp2BCcheckBoxWorkNumOrganisations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2BCcheckBoxWorkNumOrganisations.isSelected()) {
					Parsing.all_user_selection[20] = true;
				}
			}
		});
		EntCorp2BCcheckBoxWorkNumOrganisations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxWorkNumOrganisations.setBounds(6, 127, 288, 23);
		panel_2.add(EntCorp2BCcheckBoxWorkNumOrganisations);
		EntCorp2BCcheckBoxWorkNumOrganisations
				.setToolTipText("работа нескольких организаций в одном автоматизированном рабочем месте");

		label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label_13.setVerticalAlignment(SwingConstants.TOP);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(0, 0, 684, 502);
		panelCorporations2.add(label_13);

		listenerEntCorpServicesCheckBox();

	}

	private void initializeSecurityEntity() {
		panelSecurityEntity = new JPanel();
		frmDboBroker.getContentPane().add(panelSecurityEntity, "name_18228752605331");
		panelSecurityEntity.setLayout(null);

		label_7 = new JLabel(
				"\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(255, 255, 0));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(201, 17, 293, 27);
		panelSecurityEntity.add(label_7);

		EntSbuttonBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		EntSbuttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelFirstPage.setVisible(true);
				panelSecurityEntity.setVisible(false);
			}
		});
		EntSbuttonBack.setForeground(new Color(0, 128, 128));
		EntSbuttonBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntSbuttonBack.setBounds(103, 429, 107, 32);
		panelSecurityEntity.add(EntSbuttonBack);

		EntSbuttonNext = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		EntSbuttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EntityChoice.setVisible(true);
				panelSecurityEntity.setVisible(false);
			}
		});
		EntSbuttonNext.setForeground(new Color(0, 128, 128));
		EntSbuttonNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntSbuttonNext.setBounds(484, 429, 107, 32);
		panelSecurityEntity.add(EntSbuttonNext);

		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBounds(103, 55, 480, 341);
		panelSecurityEntity.add(panel_6);

		EntScheckBoxAntivirPO = new JCheckBox(
				"\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0435 \u0430\u043D\u0442\u0438\u0432\u0438\u0440\u0443\u0441\u043D\u043E\u0435 \u041F\u041E");
		EntScheckBoxAntivirPO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxAntivirPO.isSelected()) {
					Parsing.tmp_security_selection[0] = true;
				}
			}
		});
		EntScheckBoxAntivirPO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxAntivirPO.setBounds(28, 20, 282, 23);
		panel_6.add(EntScheckBoxAntivirPO);
		EntScheckBoxAntivirPO.setToolTipText(
				"включение в комплект поставки антивирусной защиты и рекомендуемых защитных компонентов (персональный межсетевой экран, хостовое средство обнаружения вторжения, средство криптографической защиты)");

		EntScheckBoxSmsAuto = new JCheckBox(
				"SMS - \u0430\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F");
		EntScheckBoxSmsAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxSmsAuto.isSelected()) {
					Parsing.tmp_security_selection[1] = true;
				}
			}
		});
		EntScheckBoxSmsAuto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxSmsAuto.setBounds(27, 230, 334, 23);
		panel_6.add(EntScheckBoxSmsAuto);
		EntScheckBoxSmsAuto.setToolTipText(
				"проверка подлинности пользователя путём сравнения введённого им пароля с паролем, присланным на указанный им номер");

		EntScheckBoxUsingSKZI = new JCheckBox(
				"\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u0421\u041A\u0417\u0418 \u0438 \u042D\u0426\u041F");
		EntScheckBoxUsingSKZI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxUsingSKZI.isSelected()) {
					Parsing.tmp_security_selection[2] = true;
				}
			}
		});
		EntScheckBoxUsingSKZI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxUsingSKZI.setBounds(28, 195, 303, 23);
		panel_6.add(EntScheckBoxUsingSKZI);
		EntScheckBoxUsingSKZI
				.setToolTipText("Средства Криптографической Защиты Информации с помощью Электронных Цифровых Подписей");

		EntScheckBoxSSL = new JCheckBox(
				"\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u043F\u0440\u043E\u0442\u043E\u043A\u043E\u043B\u0430 SSL");
		EntScheckBoxSSL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxSSL.isSelected()) {
					Parsing.tmp_security_selection[3] = true;
				}
			}
		});
		EntScheckBoxSSL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxSSL.setBounds(28, 90, 282, 23);
		panel_6.add(EntScheckBoxSSL);
		EntScheckBoxSSL.setToolTipText("позволяет обеспечить проверку подлинности сервера и шифрование сессии");

		EntScheckBoxApparatAuthen = new JCheckBox(
				"\u0410\u043F\u043F\u0430\u0440\u0430\u0442\u043D\u0430\u044F \u0430\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F");
		EntScheckBoxApparatAuthen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxApparatAuthen.isSelected()) {
					Parsing.tmp_security_selection[4] = true;
				}
			}
		});
		EntScheckBoxApparatAuthen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxApparatAuthen.setBounds(28, 264, 334, 23);
		panel_6.add(EntScheckBoxApparatAuthen);
		EntScheckBoxApparatAuthen.setToolTipText("использование смарт-карт, токенов");

		EntScheckBoxAutoPowerSession = new JCheckBox(
				"\u0410\u0432\u0442\u043E\u043E\u0442\u043A\u043B\u044E\u0447\u0435\u043D\u0438\u0435 \u0441\u0435\u0430\u043D\u0441\u0430");
		EntScheckBoxAutoPowerSession.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxAutoPowerSession.isSelected()) {
					Parsing.tmp_security_selection[5] = true;
				}
			}
		});
		EntScheckBoxAutoPowerSession.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxAutoPowerSession.setBounds(28, 160, 198, 23);
		panel_6.add(EntScheckBoxAutoPowerSession);
		EntScheckBoxAutoPowerSession.setToolTipText(
				"автоматический выход из системы в случае неактивности пользователя в течение определенного времени");

		EntScheckBoxAuthenTrans = new JCheckBox(
				"\u0410\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F \u043D\u0430 \u0443\u0440\u043E\u0432\u043D\u0435 \u0442\u0440\u0430\u043D\u0437\u0430\u043A\u0446\u0438\u0439");
		EntScheckBoxAuthenTrans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxAuthenTrans.isSelected()) {
					Parsing.tmp_security_selection[6] = true;
				}
			}
		});
		EntScheckBoxAuthenTrans.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxAuthenTrans.setBounds(28, 125, 333, 23);
		panel_6.add(EntScheckBoxAuthenTrans);
		EntScheckBoxAuthenTrans.setToolTipText(
				"проверка подлинности предполагает не единичную аутентификацию в рамках сессии работы системы,а проверку при каждой из финансовых операций");

		EntScheckBoxSecurApplic = new JCheckBox(
				"\u0417\u0430\u0449\u0438\u0449\u0435\u043D\u043D\u044B\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u044F");
		EntScheckBoxSecurApplic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxSecurApplic.isSelected()) {
					Parsing.tmp_security_selection[7] = true;
				}
			}
		});
		EntScheckBoxSecurApplic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxSecurApplic.setBounds(28, 55, 333, 23);
		panel_6.add(EntScheckBoxSecurApplic);
		EntScheckBoxSecurApplic
				.setToolTipText("наличие защищенных приложений для получения удаленного доступа к системе");

		EntScheckBoxCheckIP = new JCheckBox(
				"\u041F\u0440\u043E\u0432\u0435\u0440\u043A\u0430 IP - \u0430\u0434\u0440\u0435\u0441\u043E\u0432");
		EntScheckBoxCheckIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntScheckBoxCheckIP.isSelected()) {
					Parsing.tmp_security_selection[8] = true;
				}
			}
		});
		EntScheckBoxCheckIP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxCheckIP.setBounds(28, 294, 210, 23);
		panel_6.add(EntScheckBoxCheckIP);

		label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label_15.setVerticalAlignment(SwingConstants.TOP);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(0, 0, 684, 502);
		panelSecurityEntity.add(label_15);

	}

	private void indServicesCheckBoxIntBankEnabledFalse() {
		IndIBcheckBoxVirtCard.setEnabled(false);
		IndIBcheckBoxManCalcul.setEnabled(false);
		IndIBcheckBoxPayServ.setEnabled(false);
		IndIBcheckBoxDeposit.setEnabled(false);
		IndIBcheckBoxMoneyTransf.setEnabled(false);
		IndIBcheckBoxCardWork.setEnabled(false);
		IndIBcheckBoxCreditOperation.setEnabled(false);
		IndIBcheckBoxCurrency.setEnabled(false);
		IndIBcheckBoxInformationServ.setEnabled(false);

	}

	private void indServicesCheckBoxIntBankEnabledTrue() {
		IndIBcheckBoxVirtCard.setEnabled(true);
		IndIBcheckBoxManCalcul.setEnabled(true);
		IndIBcheckBoxPayServ.setEnabled(true);
		IndIBcheckBoxDeposit.setEnabled(true);
		IndIBcheckBoxMoneyTransf.setEnabled(true);
		IndIBcheckBoxCardWork.setEnabled(true);
		IndIBcheckBoxCreditOperation.setEnabled(true);
		IndIBcheckBoxCurrency.setEnabled(true);
		IndIBcheckBoxInformationServ.setEnabled(true);

	}

	private void indServicesCheckBoxMobBankEnabledFalse() {

		IndMBcheckBoxInformationAccount.setEnabled(false);
		IndMBcheckBoxCardWork.setEnabled(false);
		IndMBcheckBoxPayServ.setEnabled(false);
		IndMBcheckBoxMoneyTransf.setEnabled(false);
		IndMBcheckBoxElwallet.setEnabled(false);
		IndMBcheckBoxInformServ.setEnabled(false);
		IndMBcheckBoxTelefBank.setEnabled(false);
		IndMBcheckBoxSMS.setEnabled(false);

	}

	private void indServicesCheckBoxMobBankEnabledTrue() {
		IndMBcheckBoxInformationAccount.setEnabled(true);
		IndMBcheckBoxCardWork.setEnabled(true);
		IndMBcheckBoxPayServ.setEnabled(true);
		IndMBcheckBoxMoneyTransf.setEnabled(true);
		IndMBcheckBoxElwallet.setEnabled(true);
		IndMBcheckBoxInformServ.setEnabled(true);
		IndMBcheckBoxTelefBank.setEnabled(true);
		IndMBcheckBoxSMS.setEnabled(true);

	}

	private void indServicesCheckBoxIntBankSelectedFalse() {
		IndIBcheckBoxVirtCard.setSelected(false);
		IndIBcheckBoxManCalcul.setSelected(false);
		IndIBcheckBoxPayServ.setSelected(false);
		IndIBcheckBoxDeposit.setSelected(false);
		IndIBcheckBoxMoneyTransf.setSelected(false);
		IndIBcheckBoxCardWork.setSelected(false);
		IndIBcheckBoxCreditOperation.setSelected(false);
		IndIBcheckBoxCurrency.setSelected(false);
		IndIBcheckBoxInformationServ.setSelected(false);

	}

	private void indServicesCheckBoxMobBankSelectedFalse() {
		IndMBcheckBoxInformationAccount.setSelected(false);
		IndMBcheckBoxCardWork.setSelected(false);
		IndMBcheckBoxPayServ.setSelected(false);
		IndMBcheckBoxMoneyTransf.setSelected(false);
		IndMBcheckBoxElwallet.setSelected(false);
		IndMBcheckBoxInformServ.setSelected(false);
		IndMBcheckBoxTelefBank.setSelected(false);
		IndMBcheckBoxSMS.setSelected(false);

	}

	private void listenerIndServicesCheckBox() {

		indServicesCheckBoxIntBankEnabledFalse();
		indServicesCheckBoxMobBankEnabledFalse();

		IndcheckBoxInternetBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndcheckBoxInternetBank.isSelected()) {
					indServicesCheckBoxIntBankEnabledTrue();
				} else {

					// indServicesCheckBoxIntBankSelectedFalse();
					indServicesCheckBoxIntBankEnabledFalse();
					indServicesCheckBoxIntBankSelectedFalse();

				}

			}
		});

		IndcheckBoxMobileBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndcheckBoxMobileBank.isSelected()) {
					indServicesCheckBoxMobBankEnabledTrue();
				} else {

					// indServicesCheckBoxMobBankSelectedFalse();
					indServicesCheckBoxMobBankEnabledFalse();
					indServicesCheckBoxMobBankSelectedFalse();

				}

			}
		});

	}

	private void EntSBServicesCheckBoxIntBankEnabledFalse() {

		EntIBcheckBoxMBmanageAccount.setEnabled(false);
		EntIBcheckBoxEinv.setEnabled(false);
		EntIBcheckBoxCurrency.setEnabled(false);
		EntIBcheckBoxElDoc.setEnabled(false);
		EntIBcheckBoxCredit.setEnabled(false);
		EntIBcheckBoxInfServ.setEnabled(false);
		EntIBcheckBoxImpExp1C.setEnabled(false);

	}

	private void EntSBServicesCheckBoxIntBankEnabledTrue() {
		EntIBcheckBoxMBmanageAccount.setEnabled(true);
		EntIBcheckBoxEinv.setEnabled(true);
		EntIBcheckBoxCurrency.setEnabled(true);
		EntIBcheckBoxElDoc.setEnabled(true);
		EntIBcheckBoxCredit.setEnabled(true);
		EntIBcheckBoxInfServ.setEnabled(true);
		EntIBcheckBoxImpExp1C.setEnabled(true);

	}

	private void EntSBServicesCheckBoxMobBankEnabledFalse() {

		EntMBcheckBoxnIformStateAccount.setEnabled(false);
		EntMBcheckBoxFinOperations.setEnabled(false);
		EntMBcheckBoxTelefBank.setEnabled(false);
		EntMBcheckBoxInfCash.setEnabled(false);
		EntMBcheckBoxInfServices.setEnabled(false);
		EntMBcheckBoxSmsBank.setEnabled(false);
		EntMBcheckBoxSendingDoc.setEnabled(false);

	}

	private void EntSBServicesCheckBoxMobBankEnabledTrue() {

		EntMBcheckBoxnIformStateAccount.setEnabled(true);
		EntMBcheckBoxFinOperations.setEnabled(true);
		EntMBcheckBoxTelefBank.setEnabled(true);
		EntMBcheckBoxInfCash.setEnabled(true);
		EntMBcheckBoxInfServices.setEnabled(true);
		EntMBcheckBoxSmsBank.setEnabled(true);
		EntMBcheckBoxSendingDoc.setEnabled(true);

	}

	private void EntSBServicesCheckBoxBankClientEnabledFalse() {

		EntBCcheckBoxInfAccount.setEnabled(false);
		EntBCcheckBoxFinOperations.setEnabled(false);
		EntBCcheckBoxElectronDocumentsManage.setEnabled(false);
		EntBCcheckBoxCurrencyOperations.setEnabled(false);
		EntBCcheckBoxImpExp1C.setEnabled(false);
		EntBCcheckBoxSeparatedAccessDocum.setEnabled(false);
		EntBCcheckBoxInfServ.setEnabled(false);
		EntBCcheckBoxMessageExchange.setEnabled(false);

	}

	private void EntSBServicesCheckBoxBankClientEnabledTrue() {

		EntBCcheckBoxInfAccount.setEnabled(true);
		EntBCcheckBoxFinOperations.setEnabled(true);
		EntBCcheckBoxElectronDocumentsManage.setEnabled(true);
		EntBCcheckBoxCurrencyOperations.setEnabled(true);
		EntBCcheckBoxImpExp1C.setEnabled(true);
		EntBCcheckBoxSeparatedAccessDocum.setEnabled(true);
		EntBCcheckBoxInfServ.setEnabled(true);
		EntBCcheckBoxMessageExchange.setEnabled(true);

	}

	private void EntSBServicesCheckBoxMobBankSelectedFalse() {

		EntMBcheckBoxnIformStateAccount.setSelected(false);
		EntMBcheckBoxFinOperations.setSelected(false);
		EntMBcheckBoxTelefBank.setSelected(false);
		EntMBcheckBoxInfCash.setSelected(false);
		EntMBcheckBoxInfServices.setSelected(false);
		EntMBcheckBoxSmsBank.setSelected(false);
		EntMBcheckBoxSendingDoc.setSelected(false);

	}

	private void EntSBServicesCheckBoxIntBankSelectedFalse() {

		EntIBcheckBoxMBmanageAccount.setSelected(false);
		EntIBcheckBoxEinv.setSelected(false);
		EntIBcheckBoxCurrency.setSelected(false);
		EntIBcheckBoxElDoc.setSelected(false);
		EntIBcheckBoxCredit.setSelected(false);
		EntIBcheckBoxInfServ.setSelected(false);
		EntIBcheckBoxImpExp1C.setSelected(false);

	}

	private void EntSBServicesCheckBoxBankClientSelectedFalse() {
		EntBCcheckBoxInfAccount.setSelected(false);
		EntBCcheckBoxFinOperations.setSelected(false);
		EntBCcheckBoxElectronDocumentsManage.setSelected(false);
		EntBCcheckBoxCurrencyOperations.setSelected(false);
		EntBCcheckBoxImpExp1C.setSelected(false);
		EntBCcheckBoxSeparatedAccessDocum.setSelected(false);
		EntBCcheckBoxInfServ.setSelected(false);
		EntBCcheckBoxMessageExchange.setSelected(false);

	}

	private void listenerEntSBServicesCheckBox() {

		EntSBServicesCheckBoxIntBankEnabledFalse();
		EntSBServicesCheckBoxMobBankEnabledFalse();
		EntSBServicesCheckBoxBankClientEnabledFalse();

		EntcheckBoxIntBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntcheckBoxIntBank.isSelected()) {
					EntSBServicesCheckBoxIntBankEnabledTrue();
				} else {

					// indServicesCheckBoxIntBankSelectedFalse();
					EntSBServicesCheckBoxIntBankEnabledFalse();
					EntSBServicesCheckBoxIntBankSelectedFalse();

				}

			}
		});

		EntCheckBoxMobBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCheckBoxMobBank.isSelected()) {
					EntSBServicesCheckBoxMobBankEnabledTrue();
				} else {

					// indServicesCheckBoxMobBankSelectedFalse();
					EntSBServicesCheckBoxMobBankEnabledFalse();
					EntSBServicesCheckBoxMobBankSelectedFalse();

				}

			}
		});

		EntcheckBoxBankClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntcheckBoxBankClient.isSelected()) {
					EntSBServicesCheckBoxBankClientEnabledTrue();
				} else {

					// indServicesCheckBoxIntBankSelectedFalse();
					EntSBServicesCheckBoxBankClientEnabledFalse();
					EntSBServicesCheckBoxBankClientSelectedFalse();

				}

			}
		});
	}

	private void EntCorpServicesCheckBoxIntBankEnabledFalse() {

		EntCorpIBcheckBoxManageAccount.setEnabled(false);
		EntCorpIBcheckBoxEinv.setEnabled(false);
		EntCorpIBcheckBoxCurrency.setEnabled(false);
		EntCorpIBcheckBoxPayDocuments.setEnabled(false);
		EntCorpIBcheckBoxCredit.setEnabled(false);
		EntCorpIBcheckBoxInfServ.setEnabled(false);
		EntCorpIBcheckBoxImpExp1C.setEnabled(false);

	}

	private void EntCorpServicesCheckBoxIntBankEnabledTrue() {

		EntCorpIBcheckBoxManageAccount.setEnabled(true);
		EntCorpIBcheckBoxEinv.setEnabled(true);
		EntCorpIBcheckBoxCurrency.setEnabled(true);
		EntCorpIBcheckBoxPayDocuments.setEnabled(true);
		EntCorpIBcheckBoxCredit.setEnabled(true);
		EntCorpIBcheckBoxInfServ.setEnabled(true);
		EntCorpIBcheckBoxImpExp1C.setEnabled(true);

	}

	private void EntCorpServicesCheckBoxBankClientEnabledFalse() {

		EntCorp2BCcheckBoxInfAccount.setEnabled(false);
		EntCorp2BCcheckBoxFinOperations.setEnabled(false);
		EntCorp2BCcheckBoxElecDocuments.setEnabled(false);
		EntCorp2BCcheckBoxCurOperations.setEnabled(false);
		EntCorp2BCcheckBoxImpExp1C.setEnabled(false);
		EntCorp2BCcheckBoxSeparAccess.setEnabled(false);
		EntCorp2BCcheckBoxInfServ.setEnabled(false);
		EntCorp2BCcheckBoxMessExchange.setEnabled(false);
		EntCorp2BCcheckBoxCorpCards.setEnabled(false);
		EntCorp2BCcheckBoxAcquiring.setEnabled(false);
		EntCorp2BCcheckBoxBudgetSub.setEnabled(false);
		EntCorp2BCcheckBoxEinv.setEnabled(false);
		EntCorp2BCcheckBoxTransferPaySystem.setEnabled(false);
		EntCorp2BCcheckBoxWorkNumOrganisations.setEnabled(false);

	}

	private void EntCorpServicesCheckBoxBankClientEnabledTrue() {

		EntCorp2BCcheckBoxInfAccount.setEnabled(true);
		EntCorp2BCcheckBoxFinOperations.setEnabled(true);
		EntCorp2BCcheckBoxElecDocuments.setEnabled(true);
		EntCorp2BCcheckBoxCurOperations.setEnabled(true);
		EntCorp2BCcheckBoxImpExp1C.setEnabled(true);
		EntCorp2BCcheckBoxSeparAccess.setEnabled(true);
		EntCorp2BCcheckBoxInfServ.setEnabled(true);
		EntCorp2BCcheckBoxMessExchange.setEnabled(true);
		EntCorp2BCcheckBoxCorpCards.setEnabled(true);
		EntCorp2BCcheckBoxAcquiring.setEnabled(true);
		EntCorp2BCcheckBoxBudgetSub.setEnabled(true);
		EntCorp2BCcheckBoxEinv.setEnabled(true);
		EntCorp2BCcheckBoxTransferPaySystem.setEnabled(true);
		EntCorp2BCcheckBoxWorkNumOrganisations.setEnabled(true);

	}

	private void EntCorpServicesCheckBoxIntBankSelectedFalse() {

		EntCorpIBcheckBoxManageAccount.setSelected(false);
		EntCorpIBcheckBoxEinv.setSelected(false);
		EntCorpIBcheckBoxCurrency.setSelected(false);
		EntCorpIBcheckBoxPayDocuments.setSelected(false);
		EntCorpIBcheckBoxCredit.setSelected(false);
		EntCorpIBcheckBoxInfServ.setSelected(false);
		EntCorpIBcheckBoxImpExp1C.setSelected(false);

	}

	private void EntCorpServicesCheckBoxBankClientkSelectedFalse() {
		EntCorp2BCcheckBoxInfAccount.setSelected(false);
		EntCorp2BCcheckBoxFinOperations.setSelected(false);
		EntCorp2BCcheckBoxElecDocuments.setSelected(false);
		EntCorp2BCcheckBoxCurOperations.setSelected(false);
		EntCorp2BCcheckBoxImpExp1C.setSelected(false);
		EntCorp2BCcheckBoxSeparAccess.setSelected(false);
		EntCorp2BCcheckBoxInfServ.setSelected(false);
		EntCorp2BCcheckBoxMessExchange.setSelected(false);
		EntCorp2BCcheckBoxCorpCards.setSelected(false);
		EntCorp2BCcheckBoxAcquiring.setSelected(false);
		EntCorp2BCcheckBoxBudgetSub.setSelected(false);
		EntCorp2BCcheckBoxEinv.setSelected(false);
		EntCorp2BCcheckBoxTransferPaySystem.setSelected(false);
		EntCorp2BCcheckBoxWorkNumOrganisations.setSelected(false);

	}

	private void listenerEntCorpServicesCheckBox() {

		EntCorpServicesCheckBoxIntBankEnabledFalse();
		EntCorpServicesCheckBoxBankClientEnabledFalse();

		EntCorpcheckBoxIB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorpcheckBoxIB.isSelected()) {
					EntCorpServicesCheckBoxIntBankEnabledTrue();
				} else {

					EntCorpServicesCheckBoxIntBankEnabledFalse();
					EntCorpServicesCheckBoxIntBankSelectedFalse();

				}

			}
		});

		EntCorp2checkBoxBankClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EntCorp2checkBoxBankClient.isSelected()) {
					EntCorpServicesCheckBoxBankClientEnabledTrue();
				} else {

					// indServicesCheckBoxMobBankSelectedFalse();
					EntCorpServicesCheckBoxBankClientEnabledFalse();
					EntCorpServicesCheckBoxBankClientkSelectedFalse();
				}

			}
		});

	}

	private void initializeFilter() {
		panelFilter = new JPanel();
		frmDboBroker.getContentPane().add(panelFilter, "name_4761621516073");
		panelFilter.setLayout(null);

		JButton button = new JButton("\u041D\u0430\u0437\u0430\u0434");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flag == 1) {
					panelIndividual.setVisible(true);

				} else if (flag == 0) {
					panelEntity2.setVisible(true);

				} else {
					panelCorporations2.setVisible(true);

				}
				panelFilter.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setForeground(new Color(0, 128, 128));
		button.setBounds(43, 441, 107, 32);
		panelFilter.add(button);

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(43, 69, 598, 318);
		panelFilter.add(panel);
		panel.setLayout(null);

		lblNewLabel_2 = new JLabel(
				"\u0423\u0447\u0438\u0442\u044B\u0432\u0430\u0442\u044C \u0441\u0442\u0435\u043F\u0435\u043D\u044C \u0443\u0434\u043E\u0431\u0441\u0442\u0432\u0430 \u0438\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u044F:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(66, 30, 432, 22);
		panel.add(lblNewLabel_2);

		label_10 = new JLabel("\u0421\u0442\u043E\u0438\u043C\u043E\u0441\u0442\u044C:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(66, 120, 153, 32);
		panel.add(label_10);

		lblNewLabel_3 = new JLabel("\u041F\u043E\u0434\u043A\u043B\u044E\u0447\u0435\u043D\u0438\u0435:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(94, 163, 98, 22);
		panel.add(lblNewLabel_3);

		label_11 = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_11.setBounds(331, 163, 135, 22);
		panel.add(label_11);

		sliderConnect = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);	
		/*sliderConnect.addChangeListener(new ChangeListener() {
			//public void stateChanged(ChangeEvent arg0) {
				//price_1 = (int) sliderConnect.getValue();
			//}
		});*/
		sliderConnect.addChangeListener(this);
		
		// sliderConnect.setValue(0);
		//stateChanged(this);
		sliderConnect.setPaintTicks(true);
		sliderConnect.setBounds(94, 203, 180, 45);

		sliderConnect.setMajorTickSpacing(2500);
		sliderConnect.setMinorTickSpacing(500);
		sliderConnect.setPaintTicks(true);
		sliderConnect.setPaintLabels(true);
		panel.add(sliderConnect);
		
		/*if (!sliderConnect.getValueIsAdjusting()) {
			//JSlider source1 = (JSlider) e.getSource();
			if (!sliderConnect.getValueIsAdjusting()) {	
		    price_1 = (int) sliderConnect.getValue();
		   
		    
			}
		}*/
		System.out.println(price_1);
		

		sliderUse = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);
		
	
		sliderUse.setPaintTicks(true);
		sliderUse.setBounds(331, 203, 180, 45);
		sliderUse.setMajorTickSpacing(2500);
		sliderUse.setMinorTickSpacing(500);
		sliderUse.setPaintLabels(true);
		panel.add(sliderUse);
		price_2 = (int) sliderConnect.getValue();

		FilterCheckBoxComfortTrue = new JCheckBox("\u0414\u0430");
		FilterCheckBoxComfortTrue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		FilterCheckBoxComfortTrue.setBounds(66, 76, 97, 23);
		panel.add(FilterCheckBoxComfortTrue);

		FilterCheckBoxComfortFalse = new JCheckBox("\u041D\u0435\u0442");
		FilterCheckBoxComfortFalse.setSelected(true);
		FilterCheckBoxComfortFalse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		FilterCheckBoxComfortFalse.setBounds(281, 78, 97, 23);
		panel.add(FilterCheckBoxComfortFalse);

		ButtonGroup selectedItemsFilter = new ButtonGroup();
		selectedItemsFilter.add(FilterCheckBoxComfortFalse);
		selectedItemsFilter.add(FilterCheckBoxComfortTrue);

		JLabel lblNewLabel = new JLabel(
				"\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(98, 11, 472, 20);
		panelFilter.add(lblNewLabel);

		JButton btnNewButton = new JButton("\u041F\u0440\u0438\u043D\u044F\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLastPage.setVisible(true);
				panelFilter.setVisible(false);

				System.out.println("NEW TEST2");
				if (!chckbxSetDefault.isSelected()) {

					if (person == 0) {
						int j = 0;
						for (int i = 18; i < Parsing.all_user_selection.length; i++, j++) {
							Parsing.all_user_selection[i] = Parsing.tmp_security_selection[j];
						}
					}
					if (person == 1) {
						int j = 0;
						for (int i = 22; i < Parsing.all_user_selection.length; i++, j++) {
							Parsing.all_user_selection[i] = Parsing.tmp_security_selection[j];
						}
					}
					if (person == 2) {
						int j = 0;
						for (int i = 21; i < Parsing.all_user_selection.length; i++, j++) {
							Parsing.all_user_selection[i] = Parsing.tmp_security_selection[j];
						}
					}

					try {
						Parsing.calculateServicesAndSecurityNotDefault(person, FilterCheckBoxComfortTrue.isSelected());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					try {
						Parsing.calculateServicesAndSecurityDefault(person, FilterCheckBoxComfortTrue.isSelected());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				for (int i = 0; i < 8; i++)
					System.out.println(Parsing.rating_of_banks[i]);
				try {
					Parsing.sorting();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				for (int i = 0; i < 8; i++)
					// if (!Parsing.sorted_banks[i].equals(null))
					if (Parsing.sorted_rating_of_banks[i] != 0.0)
						System.out.println(Parsing.sorted_banks[i] + ":  Rating: " + Parsing.sorted_rating_of_banks[i]);

				for (int i = 0; i < 31; i++)
					System.out.println(Parsing.all_user_selection[i]);

				// Tests.End.
				boolean flag_null = false;

				// output in interface
				textArea.append(" Наиболее подходящие банки по Вашему запросу: " + "\n");
				for (int i = 0; i < 8; i++) {
					if (Parsing.sorted_rating_of_banks[i] != 0.0) {
						textArea.append(" " + Parsing.sorted_banks[i] + " " + "\n");
						flag_null = true;
					}
				}

				if (flag_null == false) {
					textArea.append(" По Вашим критериям не нашлось подходящих банков! " + "\n");
				} 
				else {

					textArea.append("\n");
					textArea.append(" Рейтинг данных банков: " + "\n");
					for (int i = 0; i < 8; i++) {
						if (Parsing.sorted_rating_of_banks[i] != 0.0)
							textArea.append(" " + Parsing.sorted_rating_of_banks[i] + " " + "\n");
						
					}
				}
				
			
			}
		
			
		});
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(519, 441, 107, 32);
		panelFilter.add(btnNewButton);

		label_17 = new JLabel("New label");
		label_17.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label_17.setVerticalAlignment(SwingConstants.TOP);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(0, 0, 684, 502);
		panelFilter.add(label_17);
	}

	private void initializeLastPage() {
		panelLastPage = new JPanel();
		frmDboBroker.getContentPane().add(panelLastPage, "name_31514268807528");
		panelLastPage.setLayout(null);

		JLabel labelResult = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		labelResult.setHorizontalAlignment(SwingConstants.CENTER);
		labelResult.setForeground(Color.YELLOW);
		labelResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelResult.setBounds(269, 11, 139, 20);
		panelLastPage.add(labelResult);

		JLabel label_1 = new JLabel(
				"\u0411\u0430\u043D\u043A\u0438, \u043D\u0430\u0438\u0431\u043E\u043B\u0435\u0435 \u0443\u0434\u043E\u0432\u043B\u0435\u0442\u0432\u043E\u0440\u044F\u044E\u0449\u0438\u0435 \u0442\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F\u043C");
		label_1.setForeground(new Color(0, 128, 128));
		label_1.setBounds(34, 42, 341, 23);
		panelLastPage.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JPanel panelLfirst = new JPanel();
		panelLfirst.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelLfirst.setBounds(24, 42, 632, 385);
		panelLastPage.add(panelLfirst);
		panelLfirst.setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(1, 1, 631, 373);
		panelLfirst.add(textArea);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textArea.setEditable(false);

		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(23, 41, 587, 312);
		panelLfirst.add(scrollPane);

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 684, 502);
		panelLastPage.add(label);

	}

	private void initialize() {

		// initialize frame
		frmDboBroker = new JFrame();
		frmDboBroker.setResizable(false);
		frmDboBroker.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\LNCaCGOmqeI.jpg"));
		frmDboBroker.setTitle("DBO Broker");
		frmDboBroker.setBounds(100, 100, 690, 530);
		frmDboBroker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDboBroker.getContentPane().setLayout(new CardLayout(0, 0));

		initializeFirstPage();
		initializeIndividual();

		initializeEntity();
		initializeCorporations();
		initializeCorporations2();
		initializeSecurityind();
		initializeSecurityEntity();

		initializeEntityChoice();
		// initializeFilter();

		listenerIndServicesCheckBox();
		listenerEntSBServicesCheckBox();
		listenerEntCorpServicesCheckBox();

		initializeFilter();
		initializeLastPage();

	}
}

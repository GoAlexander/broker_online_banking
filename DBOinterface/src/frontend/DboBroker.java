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

public class DboBroker {
	

	//check panel
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
	
	//check box first page
	private JCheckBox chckbxSetDefault;
	private JCheckBox chcbxSetChange;
	
	  //individual services
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
	
	   //entity small business services
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
	private JCheckBox EntMBcheckBoxSmsBank ;
	private JCheckBox EntCheckBoxMobBank;
	private JCheckBox EntMBcheckBoxSendingDoc;
	private JCheckBox EntcheckBoxBankClient;
	private JCheckBox EntBCcheckBoxInfAccount;
	private JCheckBox EntBCcheckBoxFinOperations;
	private JCheckBox EntBCcheckBoxElectronDocumentsManage;
	private JCheckBox EntBCcheckBoxCurrencyOperations;
	private JCheckBox EntBCcheckBoxImpExp1C;
	private JCheckBox EntBCcheckBoxSeparatedAccessDocum;
	private JCheckBox EntBCcheckBoxInfServ ;
	private JCheckBox EntBCcheckBoxMessageExchange;
	 
	//entity corporations services
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

	
	
	  //security individual
	private JCheckBox chckbxSAntiVirus;
	private JCheckBox chckbxSaveApplication;
	private JCheckBox chckbxSVirtualKeyboard;
	private JCheckBox chckbxSsslSecur;
	private JCheckBox chckbxSAutoExit;
	private JCheckBox chckbxSCheckIp;
	private JCheckBox chckbxS3Dsecure;
	private JCheckBox checkBoxSApparatAuthentication;
	  
	   //security entity
	private JCheckBox EntScheckBoxAntivirPO;
	private JCheckBox EntScheckBoxAuthenTrans;
	private JCheckBox EntScheckBoxEndPointSecur;
	private JCheckBox EntScheckBoxSSL;
	private JCheckBox EntScheckBoxAutoPowerSession;
	private JCheckBox EntScheckBoxUsingSKZI;
	private JCheckBox checkBox_6;
	private JCheckBox EntScheckBoxApparatAuthen;
	
	//
	private int flag;
	
	//text bottom
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
	
	
	
	


	
	 // Launch the application.
	 
	public static void main(String[] args) {
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
	
	private void initializeFirstPage(){
		panelFirstPage = new JPanel();
		panelFirstPage.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFirstPage.setForeground(new Color(0, 128, 128));
		frmDboBroker.getContentPane().add(panelFirstPage, "name_14444956664902");
		panelFirstPage.setLayout(null);
		
		JLabel labelAppeal = new JLabel("\u0417\u0434\u0440\u0430\u0432\u0441\u0442\u0432\u0443\u0439\u0442\u0435! \r\n");
		labelAppeal.setForeground(new Color(0, 128, 128));
		labelAppeal.setBounds(205, 23, 245, 46);
		labelAppeal.setHorizontalAlignment(SwingConstants.CENTER);
		labelAppeal.setToolTipText("");
		labelAppeal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFirstPage.add(labelAppeal);
		
		JLabel labelAppeal2 = new JLabel("\u0412\u0430\u0441 \u043F\u0440\u0438\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0411\u0440\u043E\u043A\u0435\u0440 \u0414\u0411\u041E, \u0441\u0434\u0435\u043B\u0430\u0439\u0442\u0435 \u0412\u0430\u0448 \u0432\u044B\u0431\u043E\u0440.");
		labelAppeal2.setForeground(new Color(0, 128, 128));
		labelAppeal2.setBounds(98, 70, 464, 35);
		labelAppeal2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelAppeal2.setHorizontalAlignment(SwingConstants.CENTER);
		panelFirstPage.add(labelAppeal2);
		
		JPanel panelSeparate2 = new JPanel();
		panelSeparate2.setBounds(117, 311, 445, 122);
		panelSeparate2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFirstPage.add(panelSeparate2);
		panelSeparate2.setLayout(null);
		
		
		chckbxSetDefault = new JCheckBox("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438 \u043F\u043E \u0443\u043C\u043E\u043B\u0447\u0430\u043D\u0438\u044E");
		chckbxSetDefault.setSelected(true);
		chckbxSetDefault.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSetDefault.setBounds(29, 7, 306, 23);
		panelSeparate2.add(chckbxSetDefault);
		
		chcbxSetChange = new JCheckBox("\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u044C \u043D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
		chcbxSetChange.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chcbxSetChange.setBounds(29, 43, 306, 23);
		panelSeparate2.add(chcbxSetChange);
		
		ButtonGroup selectedItems = new ButtonGroup();
		selectedItems.add(chckbxSetDefault);
		selectedItems.add(chcbxSetChange);
		
		JPanel panelSeparate = new JPanel();
		panelSeparate.setBounds(116, 135, 446, 165);
		panelSeparate.setForeground(new Color(0, 128, 128));
		panelSeparate.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFirstPage.add(panelSeparate);
		panelSeparate.setLayout(null);
		
		btnEntity = new JButton("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		btnEntity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//EntityChoice.setVisible(true);
				
				if(chckbxSetDefault.isSelected()){
					
					EntityChoice.setVisible(true);
					panelFirstPage.setVisible(false);
				}
					else if(!chckbxSetDefault.isSelected()){
						
					panelSecurityEntity.setVisible(true);
					panelFirstPage.setVisible(false);
				}
				
			}
		});
		
		btnEntity.setBounds(241, 41, 164, 67);
		panelSeparate.add(btnEntity);
		btnEntity.setForeground(new Color(0, 128, 128));
		btnEntity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		btnIndividual = new JButton("\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		btnIndividual.setBounds(26, 41, 164, 67);
		panelSeparate.add(btnIndividual);
		btnIndividual.setForeground(new Color(0, 128, 128));
		btnIndividual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxSetDefault.isSelected()){
				
				panelIndividual.setVisible(true);
				panelFirstPage.setVisible(false);
			}
				else if(!chckbxSetDefault.isSelected()){
					
					panelSecurityInd.setVisible(true);
					panelFirstPage.setVisible(false);
				}
				}
		});
		
		btnIndividual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
	}
	
	private void initializeIndividual(){
		panelIndividual = new JPanel();
		frmDboBroker.getContentPane().add(panelIndividual, "name_14448719491433");
		panelIndividual.setLayout(null);
		
		JLabel labelName = new JLabel("\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		labelName.setBounds(191, 11, 312, 20);
		labelName.setForeground(new Color(0, 128, 128));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIndividual.add(labelName);
		
		buttonInext = new JButton("\u041F\u0440\u043E\u0434\u043E\u043B\u0436\u0438\u0442\u044C");
		buttonInext.setBounds(515, 445, 107, 32);
		buttonInext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLastPage.setVisible(true);
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
				if(chckbxSetDefault.isSelected()){
					panelFirstPage.setVisible(true);
					panelIndividual.setVisible(false);
				}
				else {
					panelSecurityInd.setVisible(true);
					panelIndividual.setVisible(false);
				}
			}
		});
		buttonIback.setForeground(new Color(0, 128, 128));
		buttonIback.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelIndividual.add(buttonIback);
		
		JPanel Ipanel_1 = new JPanel();
		Ipanel_1.setBounds(356, 42, 266, 344);
		Ipanel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelIndividual.add(Ipanel_1);
		Ipanel_1.setLayout(null);
		
		IndIBcheckBoxVirtCard = new JCheckBox("\u0412\u0438\u0440\u0442\u0443\u0430\u043B\u044C\u043D\u0430\u044F \u043A\u0430\u0440\u0442\u0430");
		IndIBcheckBoxVirtCard.setBounds(25, 57, 179, 23);
		IndIBcheckBoxVirtCard.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxVirtCard);
		
		IndIBcheckBoxManCalcul = new JCheckBox("\u0423\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u043C\u0438 \u0441\u0447\u0435\u0442\u0430\u043C\u0438");
		IndIBcheckBoxManCalcul.setBounds(24, 297, 220, 23);
		IndIBcheckBoxManCalcul.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxManCalcul);
		
		IndIBcheckBoxPayServ = new JCheckBox("\u041E\u043F\u043B\u0430\u0442\u0430 \u0443\u0441\u043B\u0443\u0433 \u0441 \u043F\u043E\u043C\u043E\u0449\u044C\u044E \u041F\u0421");
		IndIBcheckBoxPayServ.setBounds(25, 117, 219, 23);
		IndIBcheckBoxPayServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxPayServ);
		
		IndIBcheckBoxDeposit = new JCheckBox("\u041E\u0444\u043E\u0440\u043C\u043B\u0435\u043D\u0438\u0435 \u0432\u043A\u043B\u0430\u0434\u043E\u0432");
		IndIBcheckBoxDeposit.setBounds(25, 237, 179, 23);
		IndIBcheckBoxDeposit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxDeposit);
		
		IndIBcheckBoxMoneyTransf = new JCheckBox("\u0414\u0435\u043D\u0435\u0436\u043D\u044B\u0435 \u043F\u0435\u0440\u0435\u0432\u043E\u0434\u044B");
		IndIBcheckBoxMoneyTransf.setBounds(25, 147, 179, 23);
		IndIBcheckBoxMoneyTransf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxMoneyTransf);
		
	    IndIBcheckBoxCardWork = new JCheckBox("\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u043A\u0430\u0440\u0442\u0430\u043C\u0438");
		IndIBcheckBoxCardWork.setBounds(25, 177, 179, 23);
		IndIBcheckBoxCardWork.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxCardWork);
		
		IndIBcheckBoxCreditOperation = new JCheckBox("\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		IndIBcheckBoxCreditOperation.setBounds(25, 207, 220, 23);
		IndIBcheckBoxCreditOperation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxCreditOperation);
		
	    IndIBcheckBoxCurrency = new JCheckBox("\u0412\u0430\u043B\u044E\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		IndIBcheckBoxCurrency.setBounds(25, 87, 179, 23);
		IndIBcheckBoxCurrency.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxCurrency);
		
		IndIBcheckBoxInformationServ = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		IndIBcheckBoxInformationServ.setBounds(25, 267, 179, 23);
		IndIBcheckBoxInformationServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ipanel_1.add(IndIBcheckBoxInformationServ);
		
		IndcheckBoxInternetBank = new JCheckBox("\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		IndcheckBoxInternetBank.setBounds(6, 19, 179, 23);
		IndcheckBoxInternetBank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Ipanel_1.add(IndcheckBoxInternetBank);
		
		JPanel Ipanel_2 = new JPanel();
		Ipanel_2.setBounds(74, 42, 265, 307);
		Ipanel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelIndividual.add(Ipanel_2);
		Ipanel_2.setLayout(null);
		
		IndcheckBoxMobileBank = new JCheckBox("\u041C\u043E\u0431\u0438\u043B\u044C\u043D\u044B\u0439 \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		IndcheckBoxMobileBank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IndcheckBoxMobileBank.setBounds(6, 19, 180, 23);
		Ipanel_2.add(IndcheckBoxMobileBank);
		
		IndMBcheckBoxInformationAccount = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438  \u0441\u0447\u0435\u0442\u043E\u0432");
		IndMBcheckBoxInformationAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxInformationAccount.setBounds(22, 57, 223, 23);
		Ipanel_2.add(IndMBcheckBoxInformationAccount);
		
		IndMBcheckBoxCardWork = new JCheckBox("\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u043A\u0430\u0440\u0442\u0430\u043C\u0438");
		IndMBcheckBoxCardWork.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxCardWork.setBounds(22, 177, 223, 23);
		Ipanel_2.add(IndMBcheckBoxCardWork);
		
		IndMBcheckBoxPayServ = new JCheckBox("\u041E\u043F\u043B\u0430\u0442\u0430 \u0443\u0441\u043B\u0443\u0433 \u0441 \u043F\u043E\u043C\u043E\u0449\u044C\u044E \u041F\u0421");
		IndMBcheckBoxPayServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxPayServ.setBounds(22, 117, 223, 23);
		Ipanel_2.add(IndMBcheckBoxPayServ);
		
		IndMBcheckBoxMoneyTransf = new JCheckBox("\u0414\u0435\u043D\u0435\u0436\u043D\u044B\u0435 \u043F\u0435\u0440\u0435\u0432\u043E\u0434\u044B\r\n");
		IndMBcheckBoxMoneyTransf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxMoneyTransf.setBounds(22, 147, 223, 23);
		Ipanel_2.add(IndMBcheckBoxMoneyTransf);
		
	    IndMBcheckBoxElwallet = new JCheckBox("\u041F\u043E\u043F\u043B\u043D\u0435\u043D\u0438\u0435 \u044D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0445 \u043A\u043E\u0448\u0435\u043B\u044C\u043A\u043E\u0432");
		IndMBcheckBoxElwallet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxElwallet.setBounds(22, 87, 238, 23);
		Ipanel_2.add(IndMBcheckBoxElwallet);
		
		IndMBcheckBoxInformServ = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		IndMBcheckBoxInformServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxInformServ.setBounds(22, 267, 223, 23);
		Ipanel_2.add(IndMBcheckBoxInformServ);
		
		IndMBcheckBoxTelefBank = new JCheckBox("\u0422\u0435\u043B\u0435\u0444\u043E\u043D - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		IndMBcheckBoxTelefBank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxTelefBank.setBounds(22, 207, 223, 23);
		Ipanel_2.add(IndMBcheckBoxTelefBank);
		
		IndMBcheckBoxSMS = new JCheckBox("SMS - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		IndMBcheckBoxSMS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		IndMBcheckBoxSMS.setBounds(22, 237, 223, 23);
		Ipanel_2.add(IndMBcheckBoxSMS);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(74, 353, 266, 34);
		panelIndividual.add(panel);
		panel.setLayout(null);
		
		IndcheckBoxATM = new JCheckBox("\u041D\u0430\u043B\u0438\u0447\u0438\u0435 \u0431\u0430\u043D\u043A\u043E\u043C\u0430\u0442\u043E\u0432/\u0442\u0435\u0440\u043C\u0438\u043D\u0430\u043B\u043E\u0432");
		IndcheckBoxATM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IndcheckBoxATM.setBounds(9, 4, 251, 23);
		panel.add(IndcheckBoxATM);
		
	}
	
	private void initializeEntity(){
		panelEntityUser = new JPanel();
		frmDboBroker.getContentPane().add(panelEntityUser, "name_987915577228");
		panelEntityUser.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(53, 107, 266, 275);
		panelEntityUser.add(panel_1);
		
	    EntIBcheckBoxMBmanageAccount = new JCheckBox("\u0423\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u043C\u0438 \u0441\u0447\u0435\u0442\u0430\u043C\u0438");
		EntIBcheckBoxMBmanageAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxMBmanageAccount.setBounds(22, 57, 223, 23);
		panel_1.add(EntIBcheckBoxMBmanageAccount);
		
		EntIBcheckBoxEinv = new JCheckBox("E-invoicing");
		EntIBcheckBoxEinv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxEinv.setBounds(22, 177, 223, 23);
		panel_1.add(EntIBcheckBoxEinv);
		
		EntIBcheckBoxCurrency = new JCheckBox("\u0412\u0430\u043B\u044E\u0442\u0433\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntIBcheckBoxCurrency.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxCurrency.setBounds(22, 117, 223, 23);
		panel_1.add(EntIBcheckBoxCurrency);
		
		EntIBcheckBoxElDoc = new JCheckBox("\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u044D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u043C\u0438 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430\u043C\u0438");
		EntIBcheckBoxElDoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxElDoc.setBounds(22, 147, 244, 23);
		panel_1.add(EntIBcheckBoxElDoc);
		
		EntIBcheckBoxCredit = new JCheckBox("\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntIBcheckBoxCredit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxCredit.setBounds(22, 87, 238, 23);
		panel_1.add(EntIBcheckBoxCredit);
		
		EntIBcheckBoxInfServ = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntIBcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxInfServ.setBounds(22, 237, 223, 23);
		panel_1.add(EntIBcheckBoxInfServ);
		
	    EntIBcheckBoxImpExp1C = new JCheckBox("\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 1\u0421");
		EntIBcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntIBcheckBoxImpExp1C.setBounds(22, 207, 244, 23);
		panel_1.add(EntIBcheckBoxImpExp1C);
		
		EntcheckBoxIntBank = new JCheckBox("\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntcheckBoxIntBank.setBounds(6, 18, 179, 23);
		panel_1.add(EntcheckBoxIntBank);
		EntcheckBoxIntBank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(357, 107, 266, 275);
		panelEntityUser.add(panel_2);
		
		EntMBcheckBoxnIformStateAccount = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438 \u0441\u0447\u0435\u0442\u043E\u0432");
		EntMBcheckBoxnIformStateAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxnIformStateAccount.setBounds(25, 57, 235, 23);
		panel_2.add(EntMBcheckBoxnIformStateAccount);
		
		EntMBcheckBoxFinOperations = new JCheckBox("\u0424\u0438\u043D\u0430\u043D\u0441\u043E\u0432\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntMBcheckBoxFinOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxFinOperations.setBounds(25, 117, 219, 23);
		panel_2.add(EntMBcheckBoxFinOperations);
		
		EntMBcheckBoxTelefBank = new JCheckBox("\u0422\u0435\u043B\u0435\u0444\u043E\u043D - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntMBcheckBoxTelefBank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxTelefBank.setBounds(25, 147, 179, 23);
		panel_2.add(EntMBcheckBoxTelefBank);
		
		EntMBcheckBoxInfCash = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0434\u0432\u0438\u0436\u0435\u043D\u0438\u0438 \r\n\u0434\u0435\u043D\u0435\u0436\u043D\u044B\u0445 \u043F\u043E\u0442\u043E\u043A\u043E\u0432");
		EntMBcheckBoxInfCash.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxInfCash.setBounds(25, 87, 235, 23);
		panel_2.add(EntMBcheckBoxInfCash);
		
		EntMBcheckBoxInfServices = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntMBcheckBoxInfServices.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxInfServices.setBounds(25, 237, 179, 23);
		panel_2.add(EntMBcheckBoxInfServices);
		
		EntMBcheckBoxSmsBank = new JCheckBox("SMS - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntMBcheckBoxSmsBank.setBounds(25, 177, 223, 23);
		panel_2.add(EntMBcheckBoxSmsBank);
		EntMBcheckBoxSmsBank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		EntCheckBoxMobBank = new JCheckBox("\u041C\u043E\u0431\u0438\u043B\u044C\u043D\u044B\u0439 \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
		EntCheckBoxMobBank.setBounds(6, 19, 180, 23);
		panel_2.add(EntCheckBoxMobBank);
		EntCheckBoxMobBank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		EntMBcheckBoxSendingDoc = new JCheckBox("\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430 \u0432 \u0431\u0430\u043D\u043A \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432");
		EntMBcheckBoxSendingDoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntMBcheckBoxSendingDoc.setBounds(25, 207, 223, 23);
		panel_2.add(EntMBcheckBoxSendingDoc);
		
		JLabel label = new JLabel("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 128, 128));
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		EntButtonNext.setBounds(516, 447, 107, 32);
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
		EntbuttonBack.setBounds(53, 447, 107, 32);
		panelEntityUser.add(EntbuttonBack);
		
		JLabel label_4 = new JLabel("\u0421\u0440\u0435\u0434\u043D\u0438\u0439 \u0438 \u043C\u0430\u043B\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(0, 128, 128));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(182, 52, 325, 20);
		panelEntityUser.add(label_4);
		
		panelEntity2 = new JPanel();
		frmDboBroker.getContentPane().add(panelEntity2, "name_11714107687463");
		panelEntity2.setLayout(null);
		
		JLabel label_2 = new JLabel("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(0, 128, 128));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(173, 11, 312, 20);
		panelEntity2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(84, 73, 512, 318);
		panelEntity2.add(panel_3);
		panel_3.setLayout(null);
		
		EntcheckBoxBankClient = new JCheckBox("\u0411\u0430\u043D\u043A - \u043A\u043B\u0438\u0435\u043D\u0442");
		EntcheckBoxBankClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntcheckBoxBankClient.setBounds(27, 23, 180, 23);
		panel_3.add(EntcheckBoxBankClient);
		
		EntBCcheckBoxInfAccount = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438  \u0441\u0447\u0435\u0442\u043E\u0432");
		EntBCcheckBoxInfAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxInfAccount.setBounds(43, 61, 223, 23);
		panel_3.add(EntBCcheckBoxInfAccount);
		
		EntBCcheckBoxFinOperations = new JCheckBox("\u0424\u0438\u043D\u0430\u043D\u0441\u043E\u0432\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntBCcheckBoxFinOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxFinOperations.setBounds(43, 91, 238, 23);
		panel_3.add(EntBCcheckBoxFinOperations);
		
		EntBCcheckBoxElectronDocumentsManage = new JCheckBox("\u042D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0439 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u043E\u0431\u043E\u0440\u043E\u0442");
		EntBCcheckBoxElectronDocumentsManage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxElectronDocumentsManage.setBounds(43, 121, 223, 23);
		panel_3.add(EntBCcheckBoxElectronDocumentsManage);
		
		EntBCcheckBoxCurrencyOperations = new JCheckBox("\u041E\u043F\u0435\u0440\u0430\u0446\u0438\u0438 \u0441 \u0432\u0430\u043B\u044E\u0442\u0430\u043C\u0438\r\n");
		EntBCcheckBoxCurrencyOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxCurrencyOperations.setBounds(43, 151, 223, 23);
		panel_3.add(EntBCcheckBoxCurrencyOperations);
		
		EntBCcheckBoxImpExp1C = new JCheckBox("\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 1\u0421");
		EntBCcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxImpExp1C.setBounds(43, 181, 238, 23);
		panel_3.add(EntBCcheckBoxImpExp1C);
		
		EntBCcheckBoxSeparatedAccessDocum = new JCheckBox("\u0420\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u043D\u044B\u0439 \u0434\u043E\u0441\u0442\u0443\u043F \u043A \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430\u043C");
		EntBCcheckBoxSeparatedAccessDocum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxSeparatedAccessDocum.setBounds(43, 211, 276, 23);
		panel_3.add(EntBCcheckBoxSeparatedAccessDocum);
		
	    EntBCcheckBoxInfServ = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntBCcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxInfServ.setBounds(43, 241, 223, 23);
		panel_3.add(EntBCcheckBoxInfServ);
		
		EntBCcheckBoxMessageExchange = new JCheckBox("\u041E\u0431\u043C\u0435\u043D \u0441\u043E\u043E\u0431\u0449\u0435\u043D\u0438\u044F\u043C\u0438 \u0441\u0432\u043E\u0431\u043E\u0434\u043D\u043E\u0433\u043E \u0444\u043E\u0440\u043C\u0430\u0442\u0430");
		EntBCcheckBoxMessageExchange.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntBCcheckBoxMessageExchange.setBounds(43, 271, 276, 23);
		panel_3.add(EntBCcheckBoxMessageExchange);
		
		JLabel label_3 = new JLabel("\u0421\u0440\u0435\u0434\u043D\u0438\u0439 \u0438 \u043C\u0430\u043B\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441");
		label_3.setForeground(new Color(0, 128, 128));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
				panelLastPage.setVisible(true);
				panelEntity2.setVisible(false);
				flag = 0;
			}
		});
		Ent2buttonNext.setForeground(new Color(0, 128, 128));
		Ent2buttonNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ent2buttonNext.setBounds(489, 444, 107, 32);
		panelEntity2.add(Ent2buttonNext);
		
	}
	
	private void initializeSecurityind(){
		panelSecurityInd = new JPanel();
		frmDboBroker.getContentPane().add(panelSecurityInd, "name_29180344707192");
		panelSecurityInd.setLayout(null);
		
		JPanel panelSecurAddition = new JPanel();
		panelSecurAddition.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelSecurAddition.setBounds(103, 68, 480, 328);
		panelSecurityInd.add(panelSecurAddition);
		panelSecurAddition.setLayout(null);
		
		chckbxSAntiVirus = new JCheckBox("\u0410\u043D\u0442\u0438\u0432\u0438\u0440\u0443\u0441\u043D\u043E\u0435 \u041F\u041E");
		chckbxSAntiVirus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSAntiVirus.setBounds(34, 30, 198, 23);
		panelSecurAddition.add(chckbxSAntiVirus);
		
		chckbxSaveApplication = new JCheckBox("\u0417\u0430\u0449\u0438\u0449\u0435\u043D\u043D\u044B\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u044F");
		chckbxSaveApplication.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSaveApplication.setBounds(34, 135, 198, 23);
		panelSecurAddition.add(chckbxSaveApplication);
		
		chckbxSVirtualKeyboard = new JCheckBox("\u0412\u0438\u0440\u0442\u0443\u0430\u043B\u044C\u043D\u0430\u044F \u043A\u043B\u0430\u0432\u0438\u0430\u0442\u0443\u0440\u0430");
		chckbxSVirtualKeyboard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSVirtualKeyboard.setBounds(34, 65, 198, 23);
		panelSecurAddition.add(chckbxSVirtualKeyboard);
		
		chckbxSsslSecur = new JCheckBox("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u043F\u0440\u043E\u0442\u043E\u043A\u043E\u043B\u0430 SSL");
		chckbxSsslSecur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSsslSecur.setBounds(34, 100, 282, 23);
		panelSecurAddition.add(chckbxSsslSecur);
		
		chckbxSAutoExit = new JCheckBox("\u0410\u0432\u0442\u043E\u043E\u0442\u043A\u043B\u044E\u0447\u0435\u043D\u0438\u0435 \u0441\u0435\u0430\u043D\u0441\u0430");
		chckbxSAutoExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSAutoExit.setBounds(34, 170, 198, 23);
		panelSecurAddition.add(chckbxSAutoExit);
		
		chckbxSCheckIp = new JCheckBox("\u041F\u0440\u043E\u0432\u0435\u0440\u043A\u0430 IP");
		chckbxSCheckIp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSCheckIp.setBounds(34, 205, 198, 23);
		panelSecurAddition.add(chckbxSCheckIp);
		
		chckbxS3Dsecure = new JCheckBox("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u0442\u0435\u0445\u043D\u043E\u043B\u043E\u0433\u0438\u0438 3D - Secure");
		chckbxS3Dsecure.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxS3Dsecure.setBounds(33, 240, 334, 23);
		panelSecurAddition.add(chckbxS3Dsecure);
		
		checkBoxSApparatAuthentication = new JCheckBox("\u0410\u043F\u043F\u0430\u0440\u0430\u0442\u043D\u0430\u044F \u0430\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F");
		checkBoxSApparatAuthentication.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkBoxSApparatAuthentication.setBounds(34, 274, 334, 23);
		panelSecurAddition.add(checkBoxSApparatAuthentication);
		
		JLabel labelSsettings = new JLabel("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
		labelSsettings.setForeground(new Color(0, 128, 128));
		labelSsettings.setHorizontalAlignment(SwingConstants.CENTER);
		labelSsettings.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		
	}
	
	private void initializeLastPage(){
		panelLastPage = new JPanel();
		frmDboBroker.getContentPane().add(panelLastPage, "name_31514268807528");
		panelLastPage.setLayout(null);
		
		JLabel labelResult = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		labelResult.setHorizontalAlignment(SwingConstants.CENTER);
		labelResult.setForeground(new Color(0, 128, 128));
		labelResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelResult.setBounds(296, 11, 139, 20);
		panelLastPage.add(labelResult);
		
		JLabel label_1 = new JLabel("\u0411\u0430\u043D\u043A\u0438, \u043D\u0430\u0438\u0431\u043E\u043B\u0435\u0435 \u0443\u0434\u043E\u0432\u043B\u0435\u0442\u0432\u043E\u0440\u044F\u044E\u0449\u0438\u0435 \u0442\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F\u043C");
		label_1.setForeground(new Color(0, 128, 128));
		label_1.setBounds(34, 42, 341, 23);
		panelLastPage.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton buttonLback = new JButton("\u041D\u0430\u0437\u0430\u0434");
		buttonLback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag == 1){
				panelIndividual.setVisible(true);
				panelLastPage.setVisible(false);
				}
				else if (flag == 0){
					panelEntity2.setVisible(true);
					panelLastPage.setVisible(false);
				}
				else if (flag == 2){
					panelCorporations2.setVisible(true);
					panelLastPage.setVisible(false);
				}
			}
		});
		buttonLback.setForeground(new Color(0, 128, 128));
		buttonLback.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonLback.setBounds(24, 438, 107, 32);
		panelLastPage.add(buttonLback);
		
		JPanel panelLfirst = new JPanel();
		panelLfirst.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLfirst.setBounds(24, 39, 632, 176);
		panelLastPage.add(panelLfirst);
		panelLfirst.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		//scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 36, 612, 129);
		panelLfirst.add(scrollPane);
		
		JPanel panelLlast = new JPanel();
		panelLlast.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLlast.setBounds(24, 226, 632, 176);
		panelLastPage.add(panelLlast);
		panelLlast.setLayout(null);
		
		
		
		JLabel label_5 = new JLabel("\u0411\u0430\u043D\u043A\u0438, \u043D\u0435 \u043F\u043E\u043B\u043D\u043E\u0441\u0442\u044C\u044E \u0443\u0434\u043E\u0432\u043B\u0435\u0442\u0432\u043E\u0440\u044F\u044E\u0449\u0438\u0435 \u0442\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F\u043C");
		label_5.setBounds(10, 8, 341, 23);
		panelLlast.add(label_5);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(new Color(0, 128, 128));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(12, 36, 610, 127);
		panelLlast.add(textArea_1);
		textArea_1.setEditable(false);
		//scrollPane_1.setViewportView(textArea_1);
		
		JScrollPane scrollPane_1 = new JScrollPane(textArea_1);
		scrollPane_1.setBounds(10, 36, 612, 129);
		panelLlast.add(scrollPane_1);
		
		
		
	}
	
	private void initializeEntityChoice(){
		
		EntityChoice = new JPanel();
		frmDboBroker.getContentPane().add(EntityChoice, "name_16217133247344");
		EntityChoice.setLayout(null);
		
		label_6 = new JLabel("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(0, 128, 128));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(186, 33, 312, 20);
		EntityChoice.add(label_6);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(30, 96, 294, 255);
		EntityChoice.add(panel_4);
		panel_4.setLayout(null);
		
		EntChoicebuttonSmallBusiness = new JButton("\u0421\u0440\u0435\u0434\u043D\u0438\u0439 \u0438 \u043C\u0430\u043B\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441");
		EntChoicebuttonSmallBusiness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEntityUser.setVisible(true);
				EntityChoice.setVisible(false);
			}
		});
		EntChoicebuttonSmallBusiness.setForeground(new Color(0, 128, 128));
		EntChoicebuttonSmallBusiness.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntChoicebuttonSmallBusiness.setBounds(66, 71, 175, 67);
		panel_4.add(EntChoicebuttonSmallBusiness);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(360, 96, 294, 255);
		EntityChoice.add(panel_5);
		panel_5.setLayout(null);
		
		EntChoicebuttonCorporations = new JButton("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u0438");
		EntChoicebuttonCorporations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCorporations.setVisible(true);
				EntityChoice.setVisible(false);
			}
		});
		EntChoicebuttonCorporations.setForeground(new Color(0, 128, 128));
		EntChoicebuttonCorporations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntChoicebuttonCorporations.setBounds(65, 71, 175, 67);
		panel_5.add(EntChoicebuttonCorporations);
		
		button_2 = new JButton("\u041D\u0430\u0437\u0430\u0434");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	        	if(chckbxSetDefault.isSelected()){
					panelFirstPage.setVisible(true);
					EntityChoice.setVisible(false);
				}
				else {
					panelSecurityEntity.setVisible(true);
					EntityChoice.setVisible(false);
				}
			}
		});
		button_2.setForeground(new Color(0, 128, 128));
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBounds(30, 408, 107, 32);
		EntityChoice.add(button_2);
		
		
		
	}
	
	private void initializeCorporations(){
		panelCorporations = new JPanel();
		frmDboBroker.getContentPane().add(panelCorporations, "name_21155801050999");
		panelCorporations.setLayout(null);
		
		label_8 = new JLabel("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(0, 128, 128));
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(183, 11, 312, 20);
		panelCorporations.add(label_8);
		
		label_9 = new JLabel("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u0438");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(new Color(0, 128, 128));
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(180, 42, 325, 20);
		panelCorporations.add(label_9);
		
		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(67, 68, 548, 275);
		panelCorporations.add(panel_7);
		
		EntCorpIBcheckBoxManageAccount = new JCheckBox("\u0423\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435 \u0440\u0430\u0441\u0447\u0435\u0442\u043D\u044B\u043C\u0438 \u0441\u0447\u0435\u0442\u0430\u043C\u0438");
		EntCorpIBcheckBoxManageAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxManageAccount.setBounds(22, 57, 223, 23);
		panel_7.add(EntCorpIBcheckBoxManageAccount);
		
		EntCorpIBcheckBoxEinv = new JCheckBox("E-invoicing");
		EntCorpIBcheckBoxEinv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxEinv.setBounds(22, 177, 223, 23);
		panel_7.add(EntCorpIBcheckBoxEinv);
		
		EntCorpIBcheckBoxCurrency = new JCheckBox("\u0412\u0430\u043B\u044E\u0442\u0433\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntCorpIBcheckBoxCurrency.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxCurrency.setBounds(22, 117, 223, 23);
		panel_7.add(EntCorpIBcheckBoxCurrency);
		
		EntCorpIBcheckBoxPayDocuments = new JCheckBox("\u041F\u0440\u0438\u0435\u043C \u0438 \u043E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0430 \u044D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0445 \u043F\u043B\u0430\u0442\u0435\u0436\u043D\u044B\u0445 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432");
		EntCorpIBcheckBoxPayDocuments.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxPayDocuments.setBounds(22, 147, 505, 23);
		panel_7.add(EntCorpIBcheckBoxPayDocuments);
		
		EntCorpIBcheckBoxCredit = new JCheckBox("\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntCorpIBcheckBoxCredit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxCredit.setBounds(22, 87, 238, 23);
		panel_7.add(EntCorpIBcheckBoxCredit);
		
		EntCorpIBcheckBoxInfServ = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntCorpIBcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxInfServ.setBounds(22, 237, 223, 23);
		panel_7.add(EntCorpIBcheckBoxInfServ);
		
		EntCorpIBcheckBoxImpExp1C = new JCheckBox("\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 1\u0421");
		EntCorpIBcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorpIBcheckBoxImpExp1C.setBounds(22, 207, 244, 23);
		panel_7.add(EntCorpIBcheckBoxImpExp1C);
		
		EntCorpcheckBoxIB = new JCheckBox("\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 - \u0431\u0430\u043D\u043A\u0438\u043D\u0433");
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
	}
	
	private void initializeCorporations2(){
		panelCorporations2 = new JPanel();
		frmDboBroker.getContentPane().add(panelCorporations2, "name_2591187471494");
		panelCorporations2.setLayout(null);
		
		JLabel label = new JLabel("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043B\u0438\u0446\u0430");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 128, 128));
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(200, 11, 312, 20);
		panelCorporations2.add(label);
		
		JLabel label_1 = new JLabel("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0446\u0438\u0438");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 128, 128));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
				
				panelLastPage.setVisible(true);
				panelCorporations2.setVisible(false);
				flag = 2;
				
			}
		});
		buttonCorp2Next.setForeground(new Color(0, 128, 128));
		buttonCorp2Next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonCorp2Next.setBounds(539, 437, 107, 32);
		panelCorporations2.add(buttonCorp2Next);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(36, 73, 610, 33);
		panelCorporations2.add(panel);
		panel.setLayout(null);
		
		EntCorp2checkBoxBankClient = new JCheckBox("\u0411\u0430\u043D\u043A - \u043A\u043B\u0438\u0435\u043D\u0442");
		EntCorp2checkBoxBankClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntCorp2checkBoxBankClient.setBounds(6, 7, 554, 23);
		panel.add(EntCorp2checkBoxBankClient);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(36, 117, 300, 297);
		panelCorporations2.add(panel_1);
		panel_1.setLayout(null);
		
		EntCorp2BCcheckBoxInfAccount = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0441\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0438  \u0441\u0447\u0435\u0442\u043E\u0432");
		EntCorp2BCcheckBoxInfAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxInfAccount.setBounds(24, 7, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxInfAccount);
		
        EntCorp2BCcheckBoxFinOperations = new JCheckBox("\u0424\u0438\u043D\u0430\u043D\u0441\u043E\u0432\u044B\u0435 \u043E\u043F\u0435\u0440\u0430\u0446\u0438\u0438");
		EntCorp2BCcheckBoxFinOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxFinOperations.setBounds(24, 37, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxFinOperations);
		
		EntCorp2BCcheckBoxElecDocuments = new JCheckBox("\u042D\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u044B\u0439 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u043E\u0431\u043E\u0440\u043E\u0442");
		EntCorp2BCcheckBoxElecDocuments.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxElecDocuments.setBounds(24, 67, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxElecDocuments);
		
		EntCorp2BCcheckBoxCurOperations = new JCheckBox("\u041E\u043F\u0435\u0440\u0430\u0446\u0438\u0438 \u0441 \u0432\u0430\u043B\u044E\u0442\u0430\u043C\u0438\r\n");
		EntCorp2BCcheckBoxCurOperations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxCurOperations.setBounds(24, 97, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxCurOperations);
		
		EntCorp2BCcheckBoxImpExp1C = new JCheckBox("\u0418\u043C\u043F\u043E\u0440\u0442 \u0438 \u044D\u043A\u0441\u043F\u043E\u0440\u0442 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0432 1\u0421");
		EntCorp2BCcheckBoxImpExp1C.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxImpExp1C.setBounds(24, 127, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxImpExp1C);
		
		EntCorp2BCcheckBoxSeparAccess = new JCheckBox("\u0420\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u043D\u044B\u0439 \u0434\u043E\u0441\u0442\u0443\u043F \u043A \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430\u043C");
		EntCorp2BCcheckBoxSeparAccess.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxSeparAccess.setBounds(24, 157, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxSeparAccess);
		
		EntCorp2BCcheckBoxInfServ = new JCheckBox("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0441\u0435\u0440\u0432\u0438\u0441\u044B");
		EntCorp2BCcheckBoxInfServ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxInfServ.setBounds(24, 187, 239, 23);
		panel_1.add(EntCorp2BCcheckBoxInfServ);
		
		EntCorp2BCcheckBoxMessExchange = new JCheckBox("\u041E\u0431\u043C\u0435\u043D \u0441\u043E\u043E\u0431\u0449\u0435\u043D\u0438\u044F\u043C\u0438 \u0441\u0432\u043E\u0431\u043E\u0434\u043D\u043E\u0433\u043E \u0444\u043E\u0440\u043C\u0430\u0442\u0430");
		EntCorp2BCcheckBoxMessExchange.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxMessExchange.setBounds(24, 217, 270, 23);
		panel_1.add(EntCorp2BCcheckBoxMessExchange);
		
		EntCorp2BCcheckBoxCorpCards = new JCheckBox("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0442\u0438\u0432\u043D\u044B\u0435 \u043A\u0430\u0440\u0442\u044B");
		EntCorp2BCcheckBoxCorpCards.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxCorpCards.setBounds(24, 247, 270, 23);
		panel_1.add(EntCorp2BCcheckBoxCorpCards);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(346, 117, 300, 297);
		panelCorporations2.add(panel_2);
		panel_2.setLayout(null);
		
		EntCorp2BCcheckBoxAcquiring = new JCheckBox("\u042D\u043A\u0432\u0430\u0439\u0440\u0438\u043D\u0433");
		EntCorp2BCcheckBoxAcquiring.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxAcquiring.setBounds(6, 37, 238, 23);
		panel_2.add(EntCorp2BCcheckBoxAcquiring);
		
		EntCorp2BCcheckBoxBudgetSub = new JCheckBox("\u0411\u044E\u0434\u0436\u0435\u0442 - \u043F\u043E\u0434\u0440\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u0438\u044F ");
		EntCorp2BCcheckBoxBudgetSub.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxBudgetSub.setBounds(6, 67, 288, 23);
		panel_2.add(EntCorp2BCcheckBoxBudgetSub);
		
		EntCorp2BCcheckBoxEinv = new JCheckBox("E-invoicing");
		EntCorp2BCcheckBoxEinv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxEinv.setBounds(6, 7, 223, 23);
		panel_2.add(EntCorp2BCcheckBoxEinv);
		
		EntCorp2BCcheckBoxTransferPaySystem = new JCheckBox("\u0421\u0438\u0441\u0442\u0435\u043C\u0430 \u043F\u0435\u0440\u0435\u0432\u043E\u0434\u043E\u0432 \u0432 \u043E\u043F\u043B\u0430\u0442\u0443 \u0443\u0441\u043B\u0443\u0433");
		EntCorp2BCcheckBoxTransferPaySystem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxTransferPaySystem.setBounds(6, 97, 244, 23);
		panel_2.add(EntCorp2BCcheckBoxTransferPaySystem);
		
		EntCorp2BCcheckBoxWorkNumOrganisations = new JCheckBox("\u0420\u0430\u0431\u043E\u0442\u0430 \u043D\u0435\u0441\u043A\u043E\u043B\u044C\u043A\u0438\u0445 \u043E\u0440\u0433\u0430\u043D\u0438\u0437\u0430\u0446\u0438\u0439 \u0432 \u043E\u0434\u043D\u043E\u043C \u0430\u0432\u0442\u043E\u043C\u0430\u0442\u0438\u0437\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u043E\u043C \u0440\u0430\u0431\u043E\u0447\u0435\u043C \u043C\u0435\u0441\u0442\u0435");
		EntCorp2BCcheckBoxWorkNumOrganisations.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EntCorp2BCcheckBoxWorkNumOrganisations.setBounds(6, 127, 288, 23);
		panel_2.add(EntCorp2BCcheckBoxWorkNumOrganisations);
	}
	
	private void initializeSecurityEntity(){
		panelSecurityEntity = new JPanel();
		frmDboBroker.getContentPane().add(panelSecurityEntity, "name_18228752605331");
		panelSecurityEntity.setLayout(null);
		
		label_7 = new JLabel("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 128, 128));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(202, 30, 293, 27);
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
		panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(103, 68, 480, 328);
		panelSecurityEntity.add(panel_6);
		
		EntScheckBoxAntivirPO = new JCheckBox("\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0435 \u0430\u043D\u0442\u0438\u0432\u0438\u0440\u0443\u0441\u043D\u043E\u0435 \u041F\u041E");
		EntScheckBoxAntivirPO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxAntivirPO.setBounds(34, 30, 282, 23);
		panel_6.add(EntScheckBoxAntivirPO);
		
		EntScheckBoxAuthenTrans = new JCheckBox("\u0410\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F \u043D\u0430 \u0443\u0440\u043E\u0432\u043D\u0435 \u0442\u0440\u0430\u043D\u0437\u0430\u043A\u0446\u0438\u0439");
		EntScheckBoxAuthenTrans.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxAuthenTrans.setBounds(34, 135, 333, 23);
		panel_6.add(EntScheckBoxAuthenTrans);
		
		EntScheckBoxEndPointSecur = new JCheckBox("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u043A\u043E\u043C\u043F\u043B\u0435\u043A\u0441\u043E\u0432 End - point Security");
		EntScheckBoxEndPointSecur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxEndPointSecur.setBounds(34, 65, 333, 23);
		panel_6.add(EntScheckBoxEndPointSecur);
		
		EntScheckBoxSSL = new JCheckBox("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u043F\u0440\u043E\u0442\u043E\u043A\u043E\u043B\u0430 SSL");
		EntScheckBoxSSL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxSSL.setBounds(34, 100, 282, 23);
		panel_6.add(EntScheckBoxSSL);
		
		EntScheckBoxAutoPowerSession = new JCheckBox("\u0410\u0432\u0442\u043E\u043E\u0442\u043A\u043B\u044E\u0447\u0435\u043D\u0438\u0435 \u0441\u0435\u0430\u043D\u0441\u0430");
		EntScheckBoxAutoPowerSession.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxAutoPowerSession.setBounds(34, 170, 198, 23);
		panel_6.add(EntScheckBoxAutoPowerSession);
		
		EntScheckBoxUsingSKZI = new JCheckBox("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u0421\u041A\u0417\u0418 \u0438 \u042D\u0426\u041F");
		EntScheckBoxUsingSKZI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxUsingSKZI.setBounds(34, 205, 303, 23);
		panel_6.add(EntScheckBoxUsingSKZI);
		
		checkBox_6 = new JCheckBox("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435 \u0442\u0435\u0445\u043D\u043E\u043B\u043E\u0433\u0438\u0438 3D - Secure");
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkBox_6.setBounds(33, 240, 334, 23);
		panel_6.add(checkBox_6);
		
		EntScheckBoxApparatAuthen = new JCheckBox("\u0410\u043F\u043F\u0430\u0440\u0430\u0442\u043D\u0430\u044F \u0430\u0443\u0442\u0435\u043D\u0442\u0438\u0444\u0438\u043A\u0430\u0446\u0438\u044F");
		EntScheckBoxApparatAuthen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EntScheckBoxApparatAuthen.setBounds(34, 274, 334, 23);
		panel_6.add(EntScheckBoxApparatAuthen);
		
	}
	
	
	private void listenerSecurityIndCheckBox(){
		
	}
	
	
	private void indServicesCheckBoxIntBankEnabledFalse(){
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
    
	private void indServicesCheckBoxIntBankEnabledTrue(){
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
	
	private void indServicesCheckBoxMobBankEnabledFalse(){
		
		
	    IndMBcheckBoxInformationAccount.setEnabled(false);
		IndMBcheckBoxCardWork.setEnabled(false);
		IndMBcheckBoxPayServ.setEnabled(false);
		IndMBcheckBoxMoneyTransf.setEnabled(false);
		IndMBcheckBoxElwallet.setEnabled(false);
		IndMBcheckBoxInformServ.setEnabled(false);
		IndMBcheckBoxTelefBank.setEnabled(false);
		IndMBcheckBoxSMS.setEnabled(false);
		
		
	}
	
    private void indServicesCheckBoxMobBankEnabledTrue(){
		IndMBcheckBoxInformationAccount.setEnabled(true);
		IndMBcheckBoxCardWork.setEnabled(true);
		IndMBcheckBoxPayServ.setEnabled(true);
		IndMBcheckBoxMoneyTransf.setEnabled(true);
		IndMBcheckBoxElwallet.setEnabled(true);
		IndMBcheckBoxInformServ.setEnabled(true);
		IndMBcheckBoxTelefBank.setEnabled(true);
		IndMBcheckBoxSMS.setEnabled(true);
		
	}

    
	private void listenerIndServicesCheckBox(){
    	
    	indServicesCheckBoxIntBankEnabledFalse();
    	indServicesCheckBoxMobBankEnabledFalse();
    	
    	IndcheckBoxInternetBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(IndcheckBoxInternetBank.isSelected()){
					indServicesCheckBoxIntBankEnabledTrue();
				}
				else{
					
					//indServicesCheckBoxIntBankSelectedFalse();
					indServicesCheckBoxIntBankEnabledFalse();
					
				}
				
			}
		});
    	
       IndcheckBoxMobileBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(IndcheckBoxMobileBank.isSelected()){
					indServicesCheckBoxMobBankEnabledTrue();
				}
				else{
					
					//indServicesCheckBoxMobBankSelectedFalse();
					indServicesCheckBoxMobBankEnabledFalse();
					
				}
				
			}
		});
    	
    	
		
	}
	
	
	private void EntSBServicesCheckBoxIntBankEnabledFalse(){
		
		EntIBcheckBoxMBmanageAccount.setEnabled(false);
		EntIBcheckBoxEinv.setEnabled(false);
		EntIBcheckBoxCurrency.setEnabled(false);
		EntIBcheckBoxElDoc.setEnabled(false);
		EntIBcheckBoxCredit.setEnabled(false);
		EntIBcheckBoxInfServ.setEnabled(false);
		EntIBcheckBoxImpExp1C.setEnabled(false);
		
	}
    
	private void EntSBServicesCheckBoxIntBankEnabledTrue(){
		EntIBcheckBoxMBmanageAccount.setEnabled(true);
		EntIBcheckBoxEinv.setEnabled(true);
		EntIBcheckBoxCurrency.setEnabled(true);
		EntIBcheckBoxElDoc.setEnabled(true);
		EntIBcheckBoxCredit.setEnabled(true);
		EntIBcheckBoxInfServ.setEnabled(true);
		EntIBcheckBoxImpExp1C.setEnabled(true);
		
	}
	
	private void EntSBServicesCheckBoxMobBankEnabledFalse(){
		
	    EntMBcheckBoxnIformStateAccount.setEnabled(false);
		EntMBcheckBoxFinOperations.setEnabled(false);
		EntMBcheckBoxTelefBank.setEnabled(false);
		EntMBcheckBoxInfCash.setEnabled(false);
		EntMBcheckBoxInfServices.setEnabled(false);
		EntMBcheckBoxSmsBank.setEnabled(false) ;
	    EntMBcheckBoxSendingDoc.setEnabled(false);
		
		
	}
	
    private void EntSBServicesCheckBoxMobBankEnabledTrue(){
    	 
        EntMBcheckBoxnIformStateAccount.setEnabled(true);
 		EntMBcheckBoxFinOperations.setEnabled(true);
 		EntMBcheckBoxTelefBank.setEnabled(true);
 		EntMBcheckBoxInfCash.setEnabled(true);
 		EntMBcheckBoxInfServices.setEnabled(true);
 		EntMBcheckBoxSmsBank.setEnabled(true) ;
 	    EntMBcheckBoxSendingDoc.setEnabled(true);
		
	}
    
    private void EntSBServicesCheckBoxBankClientEnabledFalse(){
		
	    EntBCcheckBoxInfAccount.setEnabled(false);
		EntBCcheckBoxFinOperations.setEnabled(false);
		EntBCcheckBoxElectronDocumentsManage.setEnabled(false);
		EntBCcheckBoxCurrencyOperations.setEnabled(false);
		EntBCcheckBoxImpExp1C.setEnabled(false);
		EntBCcheckBoxSeparatedAccessDocum.setEnabled(false);
		EntBCcheckBoxInfServ.setEnabled(false);
		EntBCcheckBoxMessageExchange.setEnabled(false);
		
		
	}
	
    private void EntSBServicesCheckBoxBankClientEnabledTrue(){
    	 
    	EntBCcheckBoxInfAccount.setEnabled(true);
		EntBCcheckBoxFinOperations.setEnabled(true);
		EntBCcheckBoxElectronDocumentsManage.setEnabled(true);
		EntBCcheckBoxCurrencyOperations.setEnabled(true);
		EntBCcheckBoxImpExp1C.setEnabled(true);
		EntBCcheckBoxSeparatedAccessDocum.setEnabled(true);
		EntBCcheckBoxInfServ.setEnabled(true);
		EntBCcheckBoxMessageExchange.setEnabled(true);
		
		
	}
	
   
	private void listenerEntSBServicesCheckBox(){
		
		EntSBServicesCheckBoxIntBankEnabledFalse();
		EntSBServicesCheckBoxMobBankEnabledFalse();
    	EntSBServicesCheckBoxBankClientEnabledFalse();
    	
    	EntcheckBoxIntBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(EntcheckBoxIntBank.isSelected()){
					EntSBServicesCheckBoxIntBankEnabledTrue();
				}
				else{
					
					//indServicesCheckBoxIntBankSelectedFalse();
					EntSBServicesCheckBoxIntBankEnabledFalse();
					
				}
				
			}
		});
    	
    	EntCheckBoxMobBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(EntCheckBoxMobBank.isSelected()){
					EntSBServicesCheckBoxMobBankEnabledTrue();
				}
				else{
					
					//indServicesCheckBoxMobBankSelectedFalse();
					EntSBServicesCheckBoxMobBankEnabledFalse();
					
				}
				
			}
		});
    	
    	EntcheckBoxBankClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(EntcheckBoxBankClient.isSelected()){
					EntSBServicesCheckBoxBankClientEnabledTrue();
				}
				else{
					
					//indServicesCheckBoxIntBankSelectedFalse();
					EntSBServicesCheckBoxBankClientEnabledFalse();
					
				}
				
			}
		});
	}
	
	
	
   private void EntCorpServicesCheckBoxIntBankEnabledFalse(){
		
		EntCorpIBcheckBoxManageAccount.setEnabled(false);
		EntCorpIBcheckBoxEinv.setEnabled(false);
		EntCorpIBcheckBoxCurrency.setEnabled(false);
		EntCorpIBcheckBoxPayDocuments.setEnabled(false);
		EntCorpIBcheckBoxCredit.setEnabled(false);
		EntCorpIBcheckBoxInfServ.setEnabled(false);
		EntCorpIBcheckBoxImpExp1C.setEnabled(false);
		
	}
    
	private void EntCorpServicesCheckBoxIntBankEnabledTrue(){
		
		EntCorpIBcheckBoxManageAccount.setEnabled(true);
		EntCorpIBcheckBoxEinv.setEnabled(true);
		EntCorpIBcheckBoxCurrency.setEnabled(true);
		EntCorpIBcheckBoxPayDocuments.setEnabled(true);
		EntCorpIBcheckBoxCredit.setEnabled(true);
		EntCorpIBcheckBoxInfServ.setEnabled(true);
		EntCorpIBcheckBoxImpExp1C.setEnabled(true);
		
	}
	
	private void EntCorpServicesCheckBoxBankClientEnabledFalse(){
		
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
	
    private void EntCorpServicesCheckBoxBankClientEnabledTrue(){
    	 
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
    
   
	
   
	private void listenerEntCorpServicesCheckBox(){
		
		EntCorpServicesCheckBoxIntBankEnabledFalse();
		EntCorpServicesCheckBoxBankClientEnabledFalse();
    
    	
		EntCorpcheckBoxIB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(EntCorpcheckBoxIB.isSelected()){
					EntCorpServicesCheckBoxIntBankEnabledTrue();
				}
				else{
					
					//indServicesCheckBoxIntBankSelectedFalse();
					EntCorpServicesCheckBoxIntBankEnabledFalse();
					
				}
				
			}
		});
    	
		EntCorp2checkBoxBankClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(EntCorp2checkBoxBankClient.isSelected()){
					EntCorpServicesCheckBoxBankClientEnabledTrue();
				}
				else{
					
					//indServicesCheckBoxMobBankSelectedFalse();
					EntCorpServicesCheckBoxBankClientEnabledFalse();
					
				}
				
			}
		});
    	
    	
	}
	
	
	
	private void initialize() {
		
		//initialize frame
		frmDboBroker = new JFrame();
		frmDboBroker.setResizable(false);
		frmDboBroker.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Serg\\Pictures\\bank-building-icon.jpg"));
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
		initializeLastPage();
		initializeEntityChoice();
		
		listenerIndServicesCheckBox();
		listenerEntSBServicesCheckBox();
		listenerEntCorpServicesCheckBox();
		
		
		
	}
}



package writeAndRead;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CustomerPanel extends JPanel implements ActionListener{
	
	private JLabel accountNoText, zipCodeText;
	private JTextField accountNoField, zipCodeField;
	private JButton checkButton, cancelButton;
	public static String account=null;
	public static String zip=null;
	public CustomerPanel(){
		JPanel customerPane = new JPanel();
		customerPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		accountNoText = new JLabel("Account Number");
		zipCodeText = new JLabel("Zip Code");
		accountNoField = new JTextField(15);
		zipCodeField = new JTextField(15);
		
		customerPane.add(accountNoText);
		customerPane.add(accountNoField);
		customerPane.add(zipCodeText);
		customerPane.add(zipCodeField);
		
		JPanel buttonPane = new JPanel();
		checkButton = new JButton("Check");
		checkButton.addActionListener(this);
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		buttonPane.add(checkButton);
		buttonPane.add(cancelButton);
		buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		setLayout(new BorderLayout());	
		add(customerPane,BorderLayout.CENTER);
		add(buttonPane,BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object customerSubject = e.getSource();
		try{
			if (customerSubject == cancelButton)
				System.exit(0);
			else if (customerSubject == checkButton){
				 account = accountNoField.getText();
				 zip = zipCodeField.getText();
				accountNoField.setText("");
				zipCodeField.setText("");
				
				CustomerInput.readFile();
				CustomerInput.closeFile();	
			}
			
		} catch (Exception ie) {
			JOptionPane.showMessageDialog(this, ie);
		}
	}

	public static String getAccount() {
		return account;
	}

	public static String getZip() {
		return zip;
	}

}

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

public class UserPanel extends JPanel implements ActionListener	   {

	private static final long serialVersionUID = 1L;
	private JLabel accountNoLabel, nameLabel, lnameLabel, zipcodeLabel, cardnoLabel;
	private JTextField accountNoText, nameText, lnameText, zipcodeText, cardnoText;
	private JButton addButton, endButton;
	
	public UserPanel(){
		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		nameLabel = new JLabel("First Name:");
		nameText = new JTextField(15);
		lnameLabel = new JLabel("Last Name:");
		lnameText = new JTextField(15);
		accountNoLabel = new JLabel("Account No:");
		accountNoText = new JTextField(15);
		cardnoLabel = new JLabel("Card No:");
		cardnoText = new JTextField(15);
		zipcodeLabel = new JLabel("Zip Code");
		zipcodeText = new JTextField(15);
		
		textFieldPanel.add(nameLabel);
		textFieldPanel.add(nameText);
		textFieldPanel.add(lnameLabel);
		textFieldPanel.add(lnameText);
		textFieldPanel.add(accountNoLabel);
		textFieldPanel.add(accountNoText);
		textFieldPanel.add(cardnoLabel);
		textFieldPanel.add(cardnoText);
		textFieldPanel.add(zipcodeLabel);
		textFieldPanel.add(zipcodeText);
		
		JPanel button = new JPanel();
		addButton = new JButton("ADD");
		endButton = new JButton("EXIT");
		
		button.add(addButton);
		addButton.addActionListener(this);
		button.add(endButton);
		endButton.addActionListener(this);
		setLayout(new BorderLayout());
		add(button, BorderLayout.SOUTH);
		add(textFieldPanel, BorderLayout.CENTER);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		try{
			if (source == endButton)
				System.exit(0);
			else if (source == addButton){
				User newUser = new User(
							 nameText.getText(),lnameText.getText(),accountNoText.getText(),
							cardnoText.getText(),zipcodeText.getText());
				UserIO.addRecord(newUser);
				JOptionPane.showMessageDialog(this,"Your account been added.");
				nameText.setText("");
				lnameText.setText("");
				accountNoText.setText("");
				cardnoText.setText("");
				zipcodeText.setText("");
				
			}
			
		}catch(Exception ex){
			JOptionPane.showConfirmDialog(this, ex);
		}
		
	}
}

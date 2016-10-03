package writeAndRead;

import java.awt.Container;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CustomerFrame extends JFrame{

	public CustomerFrame(){
		setSize(350,300);
		setResizable(false);
		setTitle("Virtual Card Reader");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container customerContainer = getContentPane();
		CustomerPanel cpanel = new CustomerPanel();
		customerContainer.add(cpanel);
		getContentPane().add(cpanel);
	}	
}




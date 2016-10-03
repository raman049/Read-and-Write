package writeAndRead;

import java.awt.Container;
import javax.swing.JFrame;

public class writeFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public writeFrame(){
		
		setTitle("This is Frame");
		setBounds(400,400,300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	Container container = getContentPane();
	UserPanel panel = new UserPanel();
	container.add(panel);
	
	} 
}

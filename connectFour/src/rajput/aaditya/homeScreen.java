package rajput.aaditya;
/**
 * This class creates the home screen which welcomes the user and allows them to pick between multi-player and single-player
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class homeScreen extends JPanel{
	

	
	JButton singleP=new JButton();
	JButton multiP=new JButton();
	static JFrame main = new JFrame("Connect 4 Game"); 
	/**
	 *This is the constructor method of the HomeScreen class and it sets the dimensions/design of the panel
	 */
	public homeScreen(){
		
		setBackground(Color.white);
		setPreferredSize(new Dimension(400, 400));
		
		setLayout(new GridLayout(3,1));
		
		JLabel title=new JLabel("Connect 4-By Aaditya");
		 Font font = new Font("Courier", Font.BOLD,30);
		title.setFont(font);
		add(title);
		
		
		singleP.setIcon(new ImageIcon("/Users/Aadi/Desktop/Singleplayer_Button.png"));
		singleP.addActionListener(new SelectListener());
		add(singleP);
		
		multiP.setIcon(new ImageIcon("/Users/Aadi/Desktop/Multiplayer_Button.png"));
		multiP.addActionListener(new SelectListener());
		add(multiP);
		validate();
	}
	/*
	 * This is the action listener class that is used to respond to the two buttons
	 */
	private class SelectListener implements ActionListener {// button 1
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == singleP) {
				main.getContentPane().add(new MultiPlayer());
				main.pack();
				main.setVisible(true);
				Driver.frame.setVisible(false);
			}
			if (event.getSource() == multiP) {
				main.getContentPane().add(new SinglePlayer());
				main.pack();
				main.setVisible(true);
				Driver.frame.setVisible(false);
			
			}
		}
	}
}

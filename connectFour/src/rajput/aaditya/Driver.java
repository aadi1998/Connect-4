package rajput.aaditya;
/**
 * @author Aaditya Rajput
 * @description A Connect 4 game that can be 2 player of 1 player
 * @category Game
 *
 */

import javax.swing.JFrame;

public class Driver {
	static JFrame frame = new JFrame("Connect 4 Game"); 
	public static void main(String[] args) {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new homeScreen());	
		frame.pack();
		frame.setVisible(true);
		
	}



}

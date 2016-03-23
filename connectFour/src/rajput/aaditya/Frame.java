package rajput.aaditya;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame{
	public static void main(String[] args) {
		
		int rows=6;
		int i=0;
		int coloums=7;
		int j=0;
		int width = coloums*100;
		int height = rows*100;
		JFrame frame = new JFrame("Connect 4 Game"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(); 
		
		panel.setPreferredSize(new Dimension (width, height));
		JOptionPane.showMessageDialog(null, "Welcome to Aaditya's Connect 4 Game");
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
		panel.setLayout(new GridLayout(6,7));
		JButton[][] button = new JButton[rows][coloums];
		
		
        
        for (i=0; i <rows; i++){
        	for (j = 0; j <coloums; j++){
        		button[i][j] = new JButton();
				panel.add(button[i][j]);
        	}
        	}
        frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
        }
	
	

}


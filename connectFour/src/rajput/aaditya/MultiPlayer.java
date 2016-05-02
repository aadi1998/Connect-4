package rajput.aaditya;

/**
 *Even though this class is named MultiPlayer, it is the class that is responsible for the 1 player class
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;



public class MultiPlayer extends JPanel{
	Random rn=new Random();
	int number;
	int rows = 8;
	int i = 0;
	int coloums = 7;
	int j = 0;
	int width = coloums * 100;
	int height = rows * 100;
	JButton[][] button = new JButton[rows][coloums];
	int count[] = new int[7];
	int turnsLeft= 49;
	
	/**
	 * This is the constructor of the class and it sets the panel specifics
	 */

	public MultiPlayer() {

		JFrame frame = new JFrame("Connect 4 Game"); ////////
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/////
		setBackground(Color.BLACK);

		setPreferredSize(new Dimension(width, height));
		

		setLayout(new GridLayout(8, 7));

		display();

		for (int a = 0; a < 7; a++) {
			count[a] = 7;
		}

	}
	/**
	 *This is the action listener class for the green buttons at the top
	 *the color of the button in the same row with the highest column changes colour 
	 */
	public void display() {
		for (i = 0; i < rows; i++) {// Initialize the Button Arraylist
			for (j = 0; j < coloums; j++) {
				button[i][j] = new JButton("[" + i + "][" + j + "]");
				button[i][j].setBackground(Color.blue);
				button[0][j].setBackground(Color.green);
				button[i][j].setOpaque(true);
				button[i][j].setBorderPainted(false);
			}
		}
		button[0][0].addActionListener(new SelectListener());
		button[0][1].addActionListener(new SelectListener());
		button[0][2].addActionListener(new SelectListener());
		button[0][3].addActionListener(new SelectListener());
		button[0][4].addActionListener(new SelectListener());
		button[0][5].addActionListener(new SelectListener());
		button[0][6].addActionListener(new SelectListener());

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				add(button[i][j]);
			}

		}
	}

	private class SelectListener implements ActionListener {// button 1
		
		
		
		
		public void actionPerformed(ActionEvent event) {
		
			if (event.getSource() == button[0][0]) {
				try {
					
						if (count[0] >= 1) {
							button[count[0]][0].setBackground(Color.red);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							count[0]--;
							number=rn.nextInt(7);
							
							button[count[number]][number].setBackground(Color.yellow);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							horizantalCheck(button);
							verticleCheck(button);
							rightDiagonal(button);
							leftDiagonal(button);
							
							count[number]--; 

						} else {
							JOptionPane.showMessageDialog(null, "This line is full.");
						}
				
			} catch (Exception E) {
					JOptionPane.showMessageDialog(null, "Something is wrong");
				

			}
			}
			if (event.getSource() == button[0][1]) {// button 2
				try {
					
						if (count[1] >= 1) {
							button[count[1]][1].setBackground(Color.red);
							count[1]--;
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							number=rn.nextInt(7);
							button[count[number]][number].setBackground(Color.yellow);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							horizantalCheck(button);
							verticleCheck(button);
							rightDiagonal(button);
							leftDiagonal(button);
							
							count[number]--;
						} else {
							JOptionPane.showMessageDialog(null, "This line is full.");
						}
					} catch (Exception E) {
					JOptionPane.showMessageDialog(null, "Something is wrong");
				}

			}

			if (event.getSource() == button[0][2]) {// button 3
				try {
					
						if (count[2] >= 1) {
							button[count[2]][2].setBackground(Color.red);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							count[2]--;
							number=rn.nextInt(7);
							button[count[number]][number].setBackground(Color.yellow);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							
							horizantalCheck(button);
							verticleCheck(button);
							rightDiagonal(button);
							leftDiagonal(button);

							count[number]--;
						} else {
							JOptionPane.showMessageDialog(null, "This line is full.");
						} 
				} catch (Exception E) {
					JOptionPane.showMessageDialog(null, "Something is wrong");
				}

			}
			if (event.getSource() == button[0][3]) {// button 4
				try {
					
						if (count[3] >= 1) {
							button[count[3]][3].setBackground(Color.red);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							count[3]--;
							number=rn.nextInt(7);
							button[count[number]][number].setBackground(Color.yellow);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								homeScreen.main.setVisible(false);
							}
							horizantalCheck(button);
							verticleCheck(button);
							rightDiagonal(button);
							leftDiagonal(button);
							count[number]--;

						
						} else {
							JOptionPane.showMessageDialog(null, "This line is full.");
						}
				} catch (Exception E) {
					JOptionPane.showMessageDialog(null, "Something is wrong");
				}

			}
			if (event.getSource() == button[0][4]) {// button 5
				try {
					
						if (count[4] >= 1) {
							button[count[4]][4].setBackground(Color.red);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								
							}
							count[4]--;
							number=rn.nextInt(7);
							button[count[number]][number].setBackground(Color.yellow);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								
							}
							horizantalCheck(button);
							verticleCheck(button);
							rightDiagonal(button);
							leftDiagonal(button);
							count[number]--;

						} else {
							JOptionPane.showMessageDialog(null, "This line is full.");
						}
				} catch (Exception E) {
					JOptionPane.showMessageDialog(null, "Something is wrong");
				}

			}
			if (event.getSource() == button[0][5]) {// button 6
				try {
					
						if (count[5] >= 1) {
							button[count[5]][5].setBackground(Color.red);
							count[5]--;
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
							
							}
							number=rn.nextInt(7);
							button[count[number]][number].setBackground(Color.yellow);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");

							}
							horizantalCheck(button);
							verticleCheck(button);
							rightDiagonal(button);
							leftDiagonal(button);

							count[number]--;
						} else {
							JOptionPane.showMessageDialog(null, "This line is full.");
						}
				} catch (Exception E) {
					JOptionPane.showMessageDialog(null, "Something is wrong");
				}

			}
			if (event.getSource() == button[0][6]) {// button 7
				try {
					
						if (count[6] >= 1) {
							button[count[6]][6].setBackground(Color.red);
							count[6]--;
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								
							}
							number=rn.nextInt(7);
							button[count[number]][number].setBackground(Color.yellow);
							turnsLeft--;
							if(turnsLeft==0){
								homeScreen.main.setVisible(false);
								JOptionPane.showMessageDialog(null, "It's a tie");
								
							}
							horizantalCheck(button);
							verticleCheck(button);
							rightDiagonal(button);
							leftDiagonal(button);
							
							count[number]--;

						} else {
							JOptionPane.showMessageDialog(null, "This line is full.");
						}
					}catch (Exception E) {
					JOptionPane.showMessageDialog(null, "Something is wrong");
				}
			}
			
		
		}
	}
	
	/**
	 * This method checks for the same color circle vertically
	 * @param temp
	 * @return the indexes where they are the same colour
	 */

	private JButton verticleCheck(JButton[][] temp) {
		// Check rows and see if there are 4 disks of the same color
		for (int column = 0; column < 7; ++column) {
			int count1 = 0;
			int count2 = 0;
			// We will compare current element with the previous
			for (int row = 1; row < 8; ++row) {
				if (Color.red.equals(temp[row][column].getBackground())) {
					count1++;
				} else {
					count1 = 1;
				}
				if (Color.yellow.equals(temp[row][column].getBackground())) {
					count2++;
				} else {
					count2 = 1;
				}
				if (count1 > 4) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Red Wins!");
					return temp[row][column];
				}
				if (count2 > 4) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Yellow Wins!");
					return temp[row][column];
				}
			}
		}
		return null;
	}
	/**
	 * This method checks for the same color circle horizontally
	 * @param temp
	 * @return the indexes where they are the same colour
	 */
	
	public JButton horizantalCheck(JButton[][] temp) {

		for (int row = 7; row > 0; row--) {
			int count1 = 0;
			int count2 = 0;
			for (int column = 0; column < 7; ++column) {
				if (Color.red.equals(temp[row][column].getBackground())) {
					++count1;
				} else {
					count1 = 1;
				}
				if (Color.yellow.equals(temp[row][column].getBackground())) {
					++count2;
				} else {
					count2 = 1;
				}
				if (count1 > 4) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Red Wins!");
					return temp[row][column];
				}
				if (count2 > 4) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Yellow Wins!");
					return temp[row][column];
				}
			}
		}
		return null;
	}
	
	/**
	 * This method checks for the same color circle diagonally (bottom left to bottom right)
	 * @param temp
	 * @return the indexes where they are the same colour
	 */

	private JButton rightDiagonal(JButton[][] temp) {
for (int column = 6; column>2; column--) {
			
			int x = column;
			for (int row = 7; row > 3; row--) {
				if (Color.red.equals(temp[row][x].getBackground()) && Color.red.equals(temp[row-1][x-1].getBackground()) && Color.red.equals(temp[row-2][x-2].getBackground())
						&& Color.red.equals(temp[row-3][x-3].getBackground())) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Red Wins!");
					return temp[row][x];
				}
				if (Color.yellow.equals(temp[row][x].getBackground()) && Color.yellow.equals(temp[row-1][x-1].getBackground()) && Color.yellow.equals(temp[row-2][x-2].getBackground())
						&& Color.yellow.equals(temp[row-3][x-3].getBackground())) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Yellow Wins!");
					return temp[row][x];

				} 
		}
		
	}
		return null;
	}
	

	/**
	 * This method checks for the same color circle diagonally (bottom right to bottom left)
	 * @param temp
	 * @return the indexes where they are the same colour
	 */
	

	
	public JButton leftDiagonal(JButton[][] temp) {
		for (int column = 0; column < 4; column++) {
			
			int x = column;
			for (int row = 7; row > 3; row--) {
				if (Color.red.equals(temp[row][x].getBackground()) && Color.red.equals(temp[row-1][x+1].getBackground()) && Color.red.equals(temp[row-2][x+2].getBackground())
						&& Color.red.equals(temp[row-3][x+3].getBackground())) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Red Wins!");
					return temp[row][x];
				}
				if (Color.yellow.equals(temp[row][x].getBackground()) && Color.yellow.equals(temp[row-1][x+1].getBackground()) && Color.yellow.equals(temp[row-2][x+2].getBackground())
						&& Color.yellow.equals(temp[row-3][x+3].getBackground())) {
					homeScreen.main.setVisible(false);
					JOptionPane.showMessageDialog(null, "Yellow Wins!");
					return temp[row][x];

				} 
		}
		
	}
		return null;
	}
	
	
}



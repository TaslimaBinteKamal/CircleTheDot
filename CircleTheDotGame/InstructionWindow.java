import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class InstructionWindow extends JFrame {
	private  JTextArea instruction;
	private JButton backBtn;
	public InstructionWindow(){
		instruction = new JTextArea("a blue dot is trying to escape the board (that is, exit from the board), while the player"
			+ '\n' + " attempts the prevent that by selecting gray dots,turning them into orange dots that the blue"
			+ '\n'	+ " ddot cannot cross. The player wins when the blue dot is encircled by orange dots . As can be"
			+ '\n'	+ " seen on Figure figure1, initially, some of the dots are already orange. The initial location"
			+ '\n'	+ " of the blue dot is also randomly selected, but toward the center of the board. If the board "
			+ '\n'	+ "has an even number of rows/columns, then the blue dots is randomly located on one of the central"
			+ '\n'	+ " four dots, while if the number of rows/columns is odd, it is randomly located on one of the "
			+ '\n'	+ "central nine dots. At each step the blue dot will move to one of the six neighboring dots.");
		instruction.setFont(new Font("arial", Font.PLAIN, 20));   
		backBtn = new JButton("Back");
		add(instruction, BorderLayout.CENTER);
		add(backBtn, BorderLayout.SOUTH);
		setSize(900, 400);
		setVisible(true);
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Window window = new Window();
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Circle");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 44));
		lblNewLabel.setBounds(25, 16, 127, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("the");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel_1.setBounds(153, 19, 69, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblDot = new JLabel("Dot");
		lblDot.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblDot.setForeground(Color.RED);
		lblDot.setBounds(211, 16, 94, 42);
		frame.getContentPane().add(lblDot);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setForeground(Color.WHITE);
		btnPlay.setBackground(Color.DARK_GRAY);
		btnPlay.setBounds(35, 77, 115, 29);
		frame.getContentPane().add(btnPlay);
		
//		JButton btnHighscore = new JButton("HighScore");
//		btnHighscore.setHorizontalAlignment(SwingConstants.CENTER);
//		btnHighscore.setForeground(Color.WHITE);
//		btnHighscore.setBackground(Color.DARK_GRAY);
//		btnHighscore.setBounds(35, 138, 115, 29);
//		frame.getContentPane().add(btnHighscore);
//		
		JButton btnInstruction = new JButton("Instruction");
		btnInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		btnInstruction.setForeground(Color.WHITE);
		btnInstruction.setBackground(Color.DARK_GRAY);
		btnInstruction.setBounds(37, 199, 115, 29);
		frame.getContentPane().add(btnInstruction);
		frame.setVisible(true);
		
		btnPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				GameController gameController = new GameController(10);
			}
		});
		btnInstruction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new InstructionWindow();
				//GameController gameController = new GameController(10);
			}
		});
//		btnHighscore.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//				
//			}
//		});
	}
}

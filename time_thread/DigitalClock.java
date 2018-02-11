package time_thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalClock extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	ClockThread ct;
	
	public DigitalClock() {
		panel.add(label);
		add(panel);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1400, 600);
		label.setFont(new Font("ARIAL", Font.BOLD, 80));
		label.setBackground(Color.black);
		label.setForeground(Color.white);
		label.setOpaque(true);
		label.setPreferredSize(new Dimension(1200, 400 ));
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER);;
		label.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
		ct = new ClockThread(this);
		setVisible(true);
		setLocationRelativeTo(null);
	}	
	
	public static void main(String[] args) {
		DigitalClock frame = new DigitalClock();
		
	}
	
}

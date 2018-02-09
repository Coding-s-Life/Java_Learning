package time_thread;

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
		setSize(200, 200);
		ct = new ClockThread(this);
		setVisible(true);
		setLocationRelativeTo(null);
	}	
	
	public static void main(String[] args) {
		DigitalClock frame = new DigitalClock();
		
	}
	
}

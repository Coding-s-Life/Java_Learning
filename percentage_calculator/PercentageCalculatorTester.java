package percentage_calculator;

import javax.swing.JFrame;

/**
 * This is the main class for the Percentage Calculator 
 * @author muneer
 *
 */
public class PercentageCalculatorTester {

	public static void main(String[] args) {
		PercentageCalculatorUI frame = new PercentageCalculatorUI();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
	}

}

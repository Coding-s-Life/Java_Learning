package percentage_calculator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Create a percentage calculator to calculate percentage of a given number.
 * @author muneer
 *
 */
public class PercentageCalculatorUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();
	private JButton calcButton = new JButton("Calculate");
	private JButton clearButton = new JButton("Clear");
	private JButton exitButton = new JButton("Exit");

	private JTextField percentageTxtFld = new JTextField();
	private JTextField actualNumberTxtFld = new JTextField();
	private JTextField resultTxtFld = new JTextField();

	public PercentageCalculatorUI() {
		setTitle("Percentage Calculator");
		add(getPanel());
		calcButton.addActionListener(this);
		clearButton.addActionListener(this);
		exitButton.addActionListener(this);
	}

	public JPanel getPanel() {
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTHWEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 1, 1);
		panel.add(new JLabel("What if"), gbc);
		gbc.gridx++;
		panel.add(percentageTxtFld, gbc);
		gbc.gridx++;
		panel.add(new JLabel("% of"), gbc);
		gbc.gridx++;
		gbc.weightx =0.5;		
		panel.add(actualNumberTxtFld, gbc);
		
		gbc.weightx =0.0;
		gbc.gridy++;
		gbc.gridx = 1;
		panel.add(calcButton, gbc);

		gbc.gridx++;
		panel.add(resultTxtFld, gbc);

		gbc.gridy++;
		gbc.gridx = 1;
		panel.add(clearButton, gbc);

		gbc.gridx++;
		panel.add(exitButton, gbc);

		return panel;
	}

	private double getPercentageValue() {
		String percentageText = percentageTxtFld.getText();
		if (percentageText != null) {
			double percentageValue = Double.parseDouble(percentageText);
			return percentageValue;
		}
		return 0.0;
	}
	
	private double getactualNumberValue() {
		String actualNumberText = actualNumberTxtFld.getText();
		if (actualNumberText != null) {
			double value = Double.parseDouble(actualNumberText);
			return value;
		}
		return 0.0;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == calcButton) {
			double percentageValue = getPercentageValue();
			double actualNumberValue = getactualNumberValue();
			double result = (actualNumberValue * (percentageValue / 100));
			resultTxtFld.setText(Double.toString(result));			
		} else if (e.getSource() == clearButton) {
			percentageTxtFld.setText("");
			actualNumberTxtFld.setText("");
			resultTxtFld.setText("");
		} else if (e.getSource() == exitButton) {
			System.exit(0);
		}

	}

}

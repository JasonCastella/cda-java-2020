import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculatrice {

	private JFrame frame;
	private String affiche = "";
	private String printEq = "";
	private Double number = null;
	private Double nbNext = null;
	private char operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice window = new Calculatrice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 400, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel ScreenZone = new JPanel();
		ScreenZone.setBackground(new Color(135, 206, 250));
		ScreenZone.setBounds(26, 75, 336, 50);
		frame.getContentPane().add(ScreenZone);
		ScreenZone.setLayout(null);

		JLabel Screen = new JLabel("0");
		Screen.setHorizontalAlignment(SwingConstants.RIGHT);
		Screen.setBounds(36, 0, 300, 50);
		ScreenZone.add(Screen);
		Screen.setBackground(Color.WHITE);

		JPanel BouttonContainer = new JPanel();
		BouttonContainer.setBackground(Color.DARK_GRAY);
		BouttonContainer.setBounds(10, 163, 364, 267);
		frame.getContentPane().add(BouttonContainer);
		BouttonContainer.setLayout(null);

		JPanel SolarZone = new JPanel();
		SolarZone.setBackground(Color.GRAY);
		SolarZone.setBounds(100, 11, 182, 44);
		frame.getContentPane().add(SolarZone);

		JButton MRC = new JButton("MRC");
		MRC.setBounds(10, 11, 60, 40);
		BouttonContainer.add(MRC);

		JButton MMore = new JButton("M+");
		MMore.setBounds(80, 11, 60, 40);
		BouttonContainer.add(MMore);

		JButton MLess = new JButton("M-");
		MLess.setBounds(150, 11, 60, 40);
		BouttonContainer.add(MLess);

		JButton CE = new JButton("CE");
		CE.setBounds(220, 11, 60, 40);
		BouttonContainer.add(CE);
		CE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText("0");
			}
		});

		JButton ON = new JButton("ON");
		ON.setBackground(Color.RED);
		ON.setBounds(290, 11, 60, 40);
		BouttonContainer.add(ON);
		ON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				affiche = "";
				Screen.setText(affiche);
				number = .0;
				nbNext = null;
				operator = '\u0000';
				printEq = null;
			}
		});

		JButton ZERO = new JButton("0");
		ZERO.setBounds(10, 216, 60, 40);
		BouttonContainer.add(ZERO);
		ZERO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "0");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);

			}
		});

		JButton ONE = new JButton("1");
		ONE.setBounds(10, 164, 60, 40);
		BouttonContainer.add(ONE);
		ONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "1");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton TWO = new JButton("2");
		TWO.setBounds(80, 164, 60, 40);
		BouttonContainer.add(TWO);
		TWO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "2");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton THREE = new JButton("3");
		THREE.setBounds(150, 164, 60, 40);
		BouttonContainer.add(THREE);
		THREE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "3");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton FOR = new JButton("4");
		FOR.setBounds(10, 113, 60, 40);
		BouttonContainer.add(FOR);
		FOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "4");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton FIVE = new JButton("5");
		FIVE.setBounds(80, 113, 60, 40);
		BouttonContainer.add(FIVE);
		FIVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "5");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton SIX = new JButton("6");
		SIX.setBounds(150, 113, 60, 40);
		BouttonContainer.add(SIX);
		SIX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "6");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton SEVEN = new JButton("7");
		SEVEN.setBounds(10, 62, 60, 40);
		BouttonContainer.add(SEVEN);
		SEVEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "7");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton EIGHT = new JButton("8");
		EIGHT.setBounds(80, 62, 60, 40);
		BouttonContainer.add(EIGHT);
		EIGHT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "8");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton NINE = new JButton("9");
		NINE.setBounds(150, 62, 60, 40);
		BouttonContainer.add(NINE);
		NINE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Screen.setText(affiche + "9");
				affiche = Screen.getText();
				number = Double.valueOf(affiche);
			}
		});

		JButton Point = new JButton(".");
		Point.setBounds(80, 216, 60, 40);
		BouttonContainer.add(Point);

		JButton Signe = new JButton("+/-");
		Signe.setBounds(150, 216, 60, 40);
		BouttonContainer.add(Signe);
		NINE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		JButton Root = new JButton("\u221A ");
		Root.setBounds(290, 62, 60, 40);
		BouttonContainer.add(Root);

		JButton Percent = new JButton("%");
		Percent.setBounds(220, 62, 60, 40);
		BouttonContainer.add(Percent);

		JButton Add = new JButton("+");
		Add.setBounds(220, 164, 60, 92);
		BouttonContainer.add(Add);
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculer();
				operator = '+';
				affiche(Screen);
			}
		});

		JButton Substract = new JButton("-");
		Substract.setBounds(290, 164, 60, 40);
		BouttonContainer.add(Substract);
		Substract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculer();
				operator = '-';
				affiche(Screen);
			}
		});

		JButton Multiply = new JButton("X");
		Multiply.setBounds(220, 113, 60, 40);
		BouttonContainer.add(Multiply);
		Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculer();
				operator = '*';
				affiche(Screen);
			}
		});

		JButton Divide = new JButton("\u00F7");
		Divide.setBounds(290, 113, 60, 40);
		BouttonContainer.add(Divide);
		Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculer();
				operator = '/';
				affiche(Screen);
			}
		});

		JButton Equal = new JButton("=");
		Equal.setBounds(290, 216, 60, 40);
		BouttonContainer.add(Equal);
		Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculer();
				affiche(Screen);
			}
		});
	}

	private void calculer() {
		if (number != null) {
			switch (operator) {
			case '+':
				nbNext += number;
				break;
			case '-':
				nbNext -= number;
				break;
			case '*':
				nbNext *= number;
				break;
			case '/':
				nbNext /= number;
				break;
			default:
				nbNext = number;
			}
			number = null;
		}
	}

	private void affiche(JLabel Screen) {
		printEq = String.valueOf(nbNext);
		affiche = "";
		Screen.setText(printEq);
	}

}

package calculatrice;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemple {

	private JFrame frame;
	private JTextField input_title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemple window = new Exemple();
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
	public Exemple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_container = new JPanel();
		panel_container.setBackground(Color.PINK);
		frame.getContentPane().add(panel_container, BorderLayout.CENTER);
		panel_container.setLayout(null);
		
		input_title = new JTextField();
		input_title.setBounds(126, 111, 86, 20);
		panel_container.add(input_title);
		input_title.setColumns(10);
		
		JLabel label_title = new JLabel("Hello World");
		label_title.setBounds(151, 86, 79, 14);
		panel_container.add(label_title);
		
		JButton btonOk = new JButton("ok");
		btonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String title = input_title.getText();
				System.out.println("ok" + title);
				label_title.setText(title);
			}
		});
		btonOk.setBounds(213, 110, 113, 23);
		panel_container.add(btonOk);
	}
}

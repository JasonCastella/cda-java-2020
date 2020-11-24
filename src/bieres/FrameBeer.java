package bieres;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameBeer {

	private JFrame frame;
	private JTextField textNom;
	private JTextField textVariete;
	private JTextField textDegres;
	private JTable jTableBeer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBeer window = new FrameBeer();
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
	public FrameBeer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(360, 30, 330, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Formulaire");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(70, 40, 200, 60);
		panel.add(lblNewLabel);

		textNom = new JTextField();
		textNom.setHorizontalAlignment(SwingConstants.CENTER);
		textNom.setBounds(100, 130, 200, 30);
		panel.add(textNom);
		textNom.setColumns(10);

		textVariete = new JTextField();
		textVariete.setHorizontalAlignment(SwingConstants.CENTER);
		textVariete.setBounds(100, 180, 200, 30);
		panel.add(textVariete);
		textVariete.setColumns(10);

		textDegres = new JTextField();
		textDegres.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		textDegres.setHorizontalAlignment(SwingConstants.CENTER);
		textDegres.setBounds(100, 230, 200, 30);
		panel.add(textDegres);
		textDegres.setColumns(10);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 30, 300, 400);
		frame.getContentPane().add(scrollPane);
		
		jTableBeer = new JTable();
		DefaultTableModel model =  new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Nom", "Vari\u00E9t\u00E9", "Degr\u00E9s"
			}
		);
		jTableBeer.setModel(model);
		scrollPane.setViewportView(jTableBeer);

		JButton btnCreer = new JButton("Cr\u00E9er");
		btnCreer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textNom.getText().equals("") && !textVariete.getText().equals("")
						&& isANumber(textDegres.getText())) {
					Beer beer = new Beer(textNom.getText(), textVariete.getText(),
							Double.parseDouble(textDegres.getText()));
					Object[] row = beer.toRow();
					model.addRow(row);
					textNom.setText("");
					textVariete.setText("");
					textDegres.setText("");
				}

			}
		});
		btnCreer.setForeground(Color.WHITE);
		btnCreer.setBackground(Color.GREEN);
		btnCreer.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnCreer.setBounds(100, 300, 150, 50);
		panel.add(btnCreer);

		JLabel labelNom = new JLabel("Nom");
		labelNom.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		labelNom.setHorizontalAlignment(SwingConstants.CENTER);
		labelNom.setBounds(10, 130, 100, 30);
		panel.add(labelNom);

		JLabel labelVariete = new JLabel("Vari\u00E9t\u00E9");
		labelVariete.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		labelVariete.setHorizontalAlignment(SwingConstants.CENTER);
		labelVariete.setBounds(10, 180, 100, 30);
		panel.add(labelVariete);

		JLabel labelDegres = new JLabel("Degr\u00E9s");
		labelDegres.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		labelDegres.setHorizontalAlignment(SwingConstants.CENTER);
		labelDegres.setBounds(10, 230, 100, 30);
		panel.add(labelDegres);
		
	}

	public static boolean isANumber(String degres) {
		try {
			Double.parseDouble(degres);
		} catch (NumberFormatException | NullPointerException x) {
			return false;
		}
		return true;
	}
}

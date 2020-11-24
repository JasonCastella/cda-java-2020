package todo_list;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

public class TodoList {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TodoList window = new TodoList();
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
	public TodoList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 255));
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("TODO List");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(125, 38, 126, 49);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(40, 100, 250, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JList<String> jListTask = new JList<String>();
		jListTask.setBorder(new LineBorder(Color.BLACK));
		jListTask.setBackground(Color.WHITE);
		DefaultListModel<String> model = new DefaultListModel<String>();
		jListTask.setModel(model);
		jListTask.setBounds(40, 160, 310, 250);
		frame.getContentPane().add(jListTask);
		jListTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					if (jListTask.getSelectedValue() != null) {
						if (jListTask.getSelectedValue().indexOf(" - Fini") == -1) {
							model.setElementAt(jListTask.getSelectedValue() + " - Fini", jListTask.getSelectedIndex());
						} else {
							model.setElementAt(jListTask.getSelectedValue().replace(" - Fini", ""),
									jListTask.getSelectedIndex());
						}
					}
				}
			}
		});

		JButton btnAdd = new JButton("+");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnAdd.setBackground(Color.GREEN);
		btnAdd.setBounds(300, 100, 50, 40);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField.getText().equals("")) {
					model.addElement(textField.getText());
					textField.setText("");
				}
			}
		});

		JButton btnDelete = new JButton("Supprimer");
		btnDelete.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.RED);
		btnDelete.setBounds(90, 450, 200, 40);
		frame.getContentPane().add(btnDelete);
		frame.setBounds(100, 100, 395, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (jListTask.getSelectedIndex() != -1) {
					model.remove(jListTask.getSelectedIndex());
				}
			}
		});
	}

}

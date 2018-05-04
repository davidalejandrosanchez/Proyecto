package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Color;

public class añadir extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					añadir frame = new añadir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public añadir() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(15, 20, 59, 14);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(15, 76, 11, 14);
		
		JLabel lblNewLabel_2 = new JLabel("CELIACO");
		lblNewLabel_2.setBounds(15, 128, 59, 14);
		
		JLabel lblNewLabel_3 = new JLabel("CATEGORIA");
		lblNewLabel_3.setBounds(10, 186, 75, 14);
		
		JLabel lblNewLabel_4 = new JLabel("CANTIDAD");
		lblNewLabel_4.setBounds(10, 213, 75, 14);
		
		textField = new JTextField();
		textField.setBounds(95, 17, 86, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 73, 86, 20);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(95, 183, 86, 20);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(95, 210, 86, 20);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(añadir.class.getResource("/proyectofinal/a\u00F1adir.png")));
		btnNewButton.setBounds(222, 17, 118, 55);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnAtras = new JButton("");
		btnAtras.setIcon(new ImageIcon(añadir.class.getResource("/proyectofinal/atras.png")));
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(222, 108, 118, 55);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(añadir.class.getResource("/proyectofinal/cancelar.png")));
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(222, 186, 118, 55);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(95, 128, 21, 21);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textField);
		contentPane.add(textField_4);
		contentPane.add(textField_3);
		contentPane.add(textField_1);
		contentPane.add(checkBox);
		contentPane.add(btnNewButton);
		contentPane.add(btnAtras);
		contentPane.add(btnCancelar);
	}
}
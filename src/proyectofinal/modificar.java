package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class modificar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificar frame = new modificar();
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
	public modificar() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(26, 16, 176, 28);
		
		JLabel lblNewLabel_1 = new JLabel("cantidad");
		lblNewLabel_1.setBounds(26, 74, 176, 25);
		
		JLabel lblNewLabel_2 = new JLabel("categoria");
		lblNewLabel_2.setBounds(26, 134, 86, 28);
		
		JLabel lblNewLabel_3 = new JLabel("celiaco");
		lblNewLabel_3.setBounds(26, 194, 48, 27);
		
		textField = new JTextField();
		textField.setBounds(202, 20, 86, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 76, 86, 20);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 138, 86, 20);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(329, 19, 97, 23);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(329, 75, 97, 23);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(329, 137, 97, 23);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.setBounds(329, 196, 97, 23);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(modificar.class.getResource("/proyectofinal/cambiar.png")));
		btnNewButton.setBounds(26, 312, 118, 55);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnVisibles = new JButton("");
		btnVisibles.setIcon(new ImageIcon(modificar.class.getResource("/proyectofinal/visibles.png")));
		btnVisibles.setBounds(231, 312, 118, 55);
		
		JButton btnAtras = new JButton("");
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setIcon(new ImageIcon(modificar.class.getResource("/proyectofinal/atras.png")));
		btnAtras.setBounds(449, 312, 118, 55);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("true");
		chckbxNewCheckBox_4.setBounds(247, 196, 45, 23);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(btnVisibles);
		contentPane.add(btnAtras);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(chckbxNewCheckBox_4);
		contentPane.add(textField);
		contentPane.add(chckbxNewCheckBox_3);
		contentPane.add(chckbxNewCheckBox_2);
		contentPane.add(chckbxNewCheckBox_1);
		contentPane.add(chckbxNewCheckBox);
	}
}

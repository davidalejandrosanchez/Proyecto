package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Eliminar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eliminar frame = new Eliminar();
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
	public Eliminar() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(24, 56, 109, 34);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(Eliminar.class.getResource("/proyectofinal/eliminar.png")));
		btnNewButton.setBounds(257, 30, 118, 55);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmacion confi = new confirmacion();
				confi.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Eliminar.class.getResource("/proyectofinal/atras.png")));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(257, 189, 118, 55);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administracion miba = new Administracion();
				miba.setVisible(true);
			}
		});
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(Eliminar.class.getResource("/proyectofinal/cancelar.png")));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(257, 111, 118, 55);
		contentPane.setLayout(null);
		contentPane.add(comboBox);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		contentPane.add(btnCancelar);
	}
}

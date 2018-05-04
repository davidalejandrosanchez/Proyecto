package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Postres extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Postres frame = new Postres();
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
	public Postres() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 308, 445, 61);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 16, 402, 128);
		
		JButton btnAadir = new JButton("");
		btnAadir.setBackground(Color.WHITE);
		btnAadir.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/a\u00F1adir.png")));
		btnAadir.setBounds(26, 175, 118, 55);
		
		JButton btnOk = new JButton("");
		btnOk.setBackground(Color.WHITE);
		btnOk.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/OK.png")));
		btnOk.setBounds(154, 175, 118, 55);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/cancelar.png")));
		btnCancelar.setBounds(292, 175, 118, 55);
		
		JButton btnAtras = new JButton("");
		btnAtras.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/atras.png")));
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(548, 175, 118, 55);
		
		JButton btnComida = new JButton("");
		btnComida.setBackground(Color.WHITE);
		btnComida.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/comida.png")));
		btnComida.setBounds(420, 175, 118, 55);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/flan.png")));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(1, 0, 100, 128);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/TIRAMISU.png")));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(101, 0, 100, 128);
		panel.add(btnNewButton_2);
		
		JButton btnFanta = new JButton("");
		btnFanta.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/HOJALDRE.png")));
		btnFanta.setBackground(Color.WHITE);
		btnFanta.setBounds(201, 0, 100, 128);
		panel.add(btnFanta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Postres.class.getResource("/proyectofinal/cafe.png")));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(301, 0, 100, 128);
		panel.add(btnNewButton);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"CANTIDAD", "NOMBRE"
			}
		));
		scrollPane_1.setViewportView(table);
		contentPane.add(scrollPane_1);
		contentPane.add(btnAadir);
		contentPane.add(btnOk);
		contentPane.add(btnCancelar);
		contentPane.add(btnAtras);
		contentPane.add(btnComida);
		contentPane.add(panel);
	}
}

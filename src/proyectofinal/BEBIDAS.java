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
import java.awt.Color;
import javax.swing.ImageIcon;

public class BEBIDAS extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BEBIDAS frame = new BEBIDAS();
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
	public BEBIDAS() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 461);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 278, 445, 61);
		
		JPanel panel = new JPanel();
		panel.setBounds(107, 17, 402, 128);
		
		JButton btnAadir = new JButton("");
		btnAadir.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/a\u00F1adir.png")));
		btnAadir.setBackground(Color.WHITE);
		btnAadir.setBounds(10, 156, 118, 55);
		
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/OK.png")));
		btnOk.setBackground(Color.WHITE);
		btnOk.setBounds(149, 156, 118, 55);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/cancelar.png")));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(277, 156, 118, 55);
		
		JButton btnAtras = new JButton("");
		btnAtras.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/atras.png")));
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(405, 156, 118, 55);
		
		JButton btnComida = new JButton("");
		btnComida.setBackground(Color.WHITE);
		btnComida.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/comida.png")));
		btnComida.setBounds(544, 156, 118, 55);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/cerveza.png")));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(1, 0, 100, 128);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/cocacola.png")));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(101, 0, 100, 128);
		panel.add(btnNewButton_2);
		
		JButton btnFanta = new JButton("");
		btnFanta.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/fanta.png")));
		btnFanta.setBackground(Color.WHITE);
		btnFanta.setForeground(Color.WHITE);
		btnFanta.setBounds(201, 0, 100, 128);
		panel.add(btnFanta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(BEBIDAS.class.getResource("/proyectofinal/agua.png")));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(301, 0, 100, 128);
		panel.add(btnNewButton);
		
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
		contentPane.setLayout(null);
		contentPane.add(btnAadir);
		contentPane.add(btnOk);
		contentPane.add(btnCancelar);
		contentPane.add(btnAtras);
		contentPane.add(btnComida);
		contentPane.add(panel);
		contentPane.add(scrollPane_1);
	}
}

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Comidas extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comidas frame = new Comidas();
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
	public Comidas() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 259, 445, 61);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 16, 402, 128);
		
		JButton btnAadir = new JButton("");
		btnAadir.setBackground(Color.WHITE);
		btnAadir.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/a\u00F1adir.png")));
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAadir.setBounds(26, 156, 118, 55);
		
		JButton btnOk = new JButton("");
		btnOk.setBackground(Color.WHITE);
		btnOk.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/OK.png")));
		btnOk.setBounds(150, 156, 118, 55);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/cancelar.png")));
		btnCancelar.setBounds(282, 156, 118, 55);
		
		JButton btnAtras = new JButton("");
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/atras.png")));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setBounds(410, 156, 118, 55);
		
		JButton btnComida = new JButton("");
		btnComida.setBackground(Color.WHITE);
		btnComida.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/bebida.png")));
		btnComida.setBounds(551, 156, 118, 55);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/jamon.png")));
		btnNewButton_1.setBounds(1, 0, 100, 128);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/cocido.png")));
		btnNewButton_2.setBounds(101, 0, 100, 128);
		panel.add(btnNewButton_2);
		
		JButton btnFanta = new JButton("");
		btnFanta.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/huevosrotos.png")));
		btnFanta.setBounds(201, 0, 100, 128);
		panel.add(btnFanta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Comidas.class.getResource("/proyectofinal/ensalada.png")));
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

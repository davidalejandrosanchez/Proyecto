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
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Cobrar extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cobrar frame = new Cobrar();
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
	public Cobrar() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(184, 16, 305, 151);
		
		JButton btnCobrar = new JButton("");
		btnCobrar.setIcon(new ImageIcon(Cobrar.class.getResource("/proyectofinal/cobrar.png")));
		btnCobrar.setBackground(Color.WHITE);
		btnCobrar.setBounds(44, 165, 118, 55);
		
		JLabel lblPrecioTotal = new JLabel("PRECIO TOTAL :");
		lblPrecioTotal.setBounds(184, 214, 99, 14);
		
		textField = new JTextField();
		textField.setBounds(282, 211, 86, 20);
		textField.setColumns(10);
		
		btnAtras = new JButton("");
		btnAtras.setBounds(44, 16, 118, 55);
		btnAtras.setIcon(new ImageIcon(Cobrar.class.getResource("/proyectofinal/atras.png")));
		btnAtras.setBackground(Color.WHITE);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"PRODUCTO", "PRECIO", "CANTIDAD", "SUBTOTAL"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Double.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(btnCobrar);
		contentPane.add(btnAtras);
		contentPane.add(scrollPane);
		contentPane.add(lblPrecioTotal);
		contentPane.add(textField);
	}
}

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
import java.awt.Color;
import javax.swing.ImageIcon;

public class Añadirpedido extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Añadirpedido frame = new Añadirpedido();
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
	public Añadirpedido() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 54, 242, 177);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(23, 186, 118, 55);
		btnNewButton.setIcon(new ImageIcon(Añadirpedido.class.getResource("/proyectofinal/OK.png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		
		JLabel lblMesa = new JLabel("MESA");
		lblMesa.setBounds(10, 31, 51, 17);
		
		JLabel lblPedido = new JLabel("PEDIDO");
		lblPedido.setBounds(10, 113, 51, 14);
		
		textField = new JTextField();
		textField.setBounds(79, 29, 86, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 110, 86, 20);
		textField_1.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"PEDIDO", "MESA"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(lblPedido);
		contentPane.add(textField_1);
		contentPane.add(scrollPane);
		contentPane.add(lblMesa);
		contentPane.add(textField);
	}
}

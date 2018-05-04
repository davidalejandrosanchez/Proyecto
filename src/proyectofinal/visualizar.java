package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class visualizar extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visualizar frame = new visualizar();
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
	public visualizar() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 343);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(158, 11, 237, 169);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 27, 28, 20);
		
		JButton btnReducir = new JButton("");
		btnReducir.setIcon(new ImageIcon(visualizar.class.getResource("/proyectofinal/reducir.png")));
		btnReducir.setBackground(Color.WHITE);
		btnReducir.setBounds(10, 191, 118, 55);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(visualizar.class.getResource("/proyectofinal/eliminar.png")));
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.setBounds(138, 191, 118, 55);
		
		JLabel lblProducto = new JLabel("PRODUCTO");
		lblProducto.setBounds(24, 30, 78, 14);
		
		JLabel lblPrecioActual = new JLabel("Precio actual");
		lblPrecioActual.setBounds(281, 211, 86, 14);
		
		textField = new JTextField();
		textField.setBounds(379, 208, 86, 20);
		textField.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"PRODUCTO", "CANTIDAD", "PRECIO"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(lblProducto);
		contentPane.add(comboBox);
		contentPane.add(scrollPane);
		contentPane.add(btnReducir);
		contentPane.add(btnEliminar);
		contentPane.add(lblPrecioActual);
		contentPane.add(textField);
	}

}

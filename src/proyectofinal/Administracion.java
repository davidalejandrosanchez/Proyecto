package proyectofinal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class Administracion extends JFrame {
	
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administracion frame = new Administracion();
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
	public Administracion() {
		
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 417);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(new ImageIcon(Administracion.class.getResource("/proyectofinal/a\u00F1adir.png")));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(Administracion.class.getResource("/proyectofinal/a\u00F1adir.png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(10, 11, 118, 54);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				añadir aña = new añadir();
				aña.setVisible(true);
			}
		});
		
		JButton btnModificar = new JButton("");
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setIcon(new ImageIcon(Administracion.class.getResource("/proyectofinal/modificar.png")));
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBounds(10, 83, 118, 54);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar modi = new modificar();
				modi.setVisible(true);
			}
		});
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.setIcon(new ImageIcon(Administracion.class.getResource("/proyectofinal/eliminar.png")));
		btnEliminar.setBounds(10, 167, 118, 54);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminar eli = new Eliminar();
				eli.setVisible(true);
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(157, 97, 28, 20);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(157, 201, 28, 20);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(211, 40, 339, 253);
		
		
		JButton btnAt = new JButton("");
		btnAt.setIcon(new ImageIcon(Administracion.class.getResource("/proyectofinal/atras.png")));
		btnAt.setForeground(Color.WHITE);
		btnAt.setBackground(Color.WHITE);
		btnAt.setBounds(10, 239, 118, 54);
		btnAt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventanaprincipal miven = new Ventanaprincipal();
				miven.setVisible(true);
			}
		});
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"ID", "NOMBRE", "PRECIO"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		
		JButton button = new JButton("listar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {ConexionBBDD Prueba = new ConexionBBDD();
			table.setModel(Prueba.ConsultaTablaEmpleados());
			}
		});
		button.setBounds(221, 310, 89, 23);
		contentPane.add(button);
		contentPane.add(btnAt);
		contentPane.add(btnNewButton);
		contentPane.add(btnEliminar);
		contentPane.add(btnModificar);
		contentPane.add(comboBox);
		contentPane.add(comboBox_1);
		contentPane.add(scrollPane);
	}
}

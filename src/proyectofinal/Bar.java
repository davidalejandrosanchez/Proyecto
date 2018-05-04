package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Bar extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bar frame = new Bar();
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
	public Bar() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 376);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 89, 72, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BEBIDAS", "COMIDAS", "POSTRES"}));
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Bar.class.getResource("/proyectofinal/nuevo.png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(15, 3, 118, 55);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Añadirpedido aña =new Añadirpedido();
				aña.setVisible(true);
			}
		});
		
		JButton btnAadir = new JButton("");
		btnAadir.setForeground(Color.WHITE);
		btnAadir.setBackground(Color.WHITE);
		btnAadir.setIcon(new ImageIcon(Bar.class.getResource("/proyectofinal/a\u00F1adir.png")));
		btnAadir.setBounds(15, 67, 118, 55);
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					BEBIDAS bebi = new BEBIDAS();
					bebi.setVisible(true);
				}else if (comboBox.getSelectedIndex() == 1) {
					Comidas comi = new Comidas();
					comi.setVisible(true);
				}else {
					Postres pos = new Postres();
					pos.setVisible(true);
							
				}
				
			}
		});
		
			JButton btnCobrar = new JButton("");
			btnCobrar.setIcon(new ImageIcon(Bar.class.getResource("/proyectofinal/cobrar.png")));
			btnCobrar.setForeground(Color.WHITE);
			btnCobrar.setBackground(Color.WHITE);
			btnCobrar.setBounds(15, 239, 118, 55);
		btnCobrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(198, 251, 28, 20);
		
		JButton btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(Bar.class.getResource("/proyectofinal/modificar.png")));
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setBounds(15, 148, 118, 55);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(198, 160, 28, 20);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(252, 16, 211, 248);
		
		JLabel lblCategorias = new JLabel("categorias:");
		lblCategorias.setBounds(170, 67, 72, 14);
		
		JLabel lblPedido = new JLabel("pedido");
		lblPedido.setBounds(150, 163, 50, 14);
		
		JLabel label = new JLabel("pedido");
		label.setBounds(150, 254, 50, 14);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"MESA", "PEDIDO"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(btnAadir);
		contentPane.add(btnModificar);
		contentPane.add(btnCobrar);
		contentPane.add(lblPedido);
		contentPane.add(label);
		contentPane.add(comboBox_2);
		contentPane.add(comboBox_1);
		contentPane.add(lblCategorias);
		contentPane.add(comboBox);
		contentPane.add(btnNewButton);
		contentPane.add(scrollPane);
	}
}

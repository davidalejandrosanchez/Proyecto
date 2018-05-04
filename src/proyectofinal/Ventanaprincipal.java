package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Ventanaprincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanaprincipal frame = new Ventanaprincipal();
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
	public Ventanaprincipal() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Ventanaprincipal.class.getResource("/proyectofinal/administracion.png")));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Administracion admin = new Administracion();
				admin.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 74, 322, 115);
		contentPane.add(btnNewButton);
		
		JButton btnBar = new JButton("");
		btnBar.setIcon(new ImageIcon(Ventanaprincipal.class.getResource("/proyectofinal/bar.png")));
		btnBar.setFont(new Font("Arial", Font.BOLD, 18));
		btnBar.setForeground(Color.WHITE);
		btnBar.setBackground(Color.WHITE);
		btnBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bar mibar = new Bar();
				mibar.setVisible(true);
				
				
			}
		});
		btnBar.setBounds(366, 74, 322, 115);
		contentPane.add(btnBar);
	}
}

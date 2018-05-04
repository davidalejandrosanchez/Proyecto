package proyectofinal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class confirmacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confirmacion frame = new confirmacion();
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
	public confirmacion() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("SI");
		rdbtnNewRadioButton.setBounds(58, 83, 50, 23);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_1.setBounds(255, 83, 57, 23);
		
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon(confirmacion.class.getResource("/proyectofinal/OK.png")));
		btnOk.setBackground(Color.WHITE);
		btnOk.setBounds(217, 155, 118, 55);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(confirmacion.class.getResource("/proyectofinal/cancelar.png")));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(44, 155, 118, 55);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonGroup button = new ButtonGroup();
		
		button.add(rdbtnNewRadioButton);
		button.add(rdbtnNewRadioButton_1);
		contentPane.setLayout(null);
		contentPane.add(btnCancelar);
		contentPane.add(btnOk);
		contentPane.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton_1);
		
		
	}
}

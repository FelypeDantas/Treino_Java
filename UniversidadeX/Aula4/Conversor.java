package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField Valor;
	private JTextField resultado;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnCoverter = new JButton("Converter");
		btnCoverter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnCoverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				double lblFahrenheit = Double.parseDouble(Valor.getText());
				double lblCelsius = (lblFahrenheit - 32)/ 1.8;
				resultado.setText(lblCelsius + " C");
			}catch(Exception erro) {
				
			}
				
			}
		});
		contentPane.add(btnCoverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblFahrenheit);
		
		Valor = new JTextField();
		Valor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(Valor);
		Valor.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCelsius);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(resultado);
		resultado.setColumns(10);
	}

}

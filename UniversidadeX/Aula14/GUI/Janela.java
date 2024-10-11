package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		super("Minha Janela");
		JButton botao = new JButton("Clique");
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Janela();

	}

}

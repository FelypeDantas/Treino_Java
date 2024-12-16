import javax.swing.JOptionPane;

public class FilaView {

	public static void main(String[] args) {
		Fila f = new Fila();

		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a opção:\n1 - Inserir \n2 - Remover \n3 - Mostrar \n9 - abandonar programa"));

			int valor = 0;
			switch (opc) {

			case 1:
				do {
					try {
						valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o elemento"));
						f.enqueue(valor);
						JOptionPane.showMessageDialog(null, "ITEM adicionado com sucesso!");
						break; 
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
					}
				} while (true);
				break;
			case 2:
				f.dequeue(valor);
				JOptionPane.showMessageDialog(null, "ITEM REMOVIDO!");
				break;
			case 3:
				f.mostrar();
				break;
			case 9: JOptionPane.showMessageDialog(null, "Finalizado!");
					break;
			default: JOptionPane.showMessageDialog(null, "Opção não existe!");
			}
		}

	}

}

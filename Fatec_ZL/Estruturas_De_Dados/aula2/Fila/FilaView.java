package Fila;

import javax.swing.JOptionPane;

public class FilaView {

	public static void main(String[] args) {
		
		//Objeto fila instanciado
		Fila<Integer> fila1 = new Fila<>();
		
		//variaveis como a opcao a ser escolhida e o valor que sera enviado para a fila
		int opc = 0;
		int valor = 0;
		
		//loop para que nao saia das opcoes ate que o usuario aaperte a tela 9
		while(opc != 9) {
			
			//informando qual opcao deseja
			opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua escolha:\n 1 - Inserir elemento\n 2 - Remover elemento\n 3 - Mostrar Fila\n 9 - Sair"));
			
			//switch case para escolha das opcoes conforme descrito na linha acima
			switch(opc) {
			
				case 1: do {
					try {
				        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o elemento"));
				        fila1.inserir(valor);
				        JOptionPane.showMessageDialog(null, "ITEM adicionado com sucesso!");
				        break; // Se a entrada for válida, sai do loop
				    } catch (NumberFormatException e) {
				        JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
				    }
				} while (true);
				break;
				case 2: fila1.remover(valor);
						JOptionPane.showMessageDialog(null, "ITEM REMOVIDO!");
					break;
				case 3: fila1.mostrar();
					break;
				case 9: JOptionPane.showMessageDialog(null, "Fim do Programa!");
					break;
				default: JOptionPane.showMessageDialog(null, "Essa opção não existe!");
				
			}
			
		}

	}

}

package pilha;

import javax.swing.JOptionPane;

public class PilhaView {

	public static void main(String[] args) {
		Pilha<Integer> p = new Pilha<Integer>();
		
		int opc = 0;
		int valor = 0;
		
		while(opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção: \n1 - adicionar \n2 - Remover \n3 - tamanho \n4 - Imprimir Pilha \n9 - abandonar programa"));
			
			switch(opc) {
				
			case 1: 
				valor = Integer.parseInt(JOptionPane.showInputDialog("O valor é: "));
				p.inserir(valor);
				break;
			case 2: 
				p.remover();
				break;
			case 3:
				p.size();
				break;
			case 4:
				p.imprimir();
				break;
			default: JOptionPane.showMessageDialog(null, "Comando inválido, tente novamente!");
			}
				
		}

	}

}

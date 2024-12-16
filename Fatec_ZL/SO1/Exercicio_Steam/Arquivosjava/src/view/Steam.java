package view;

import controller.SteamController;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Steam {

	public static void main(String[] args) {
		SteamController steam = new SteamController();
		int opc = 0;

		try {
			while (opc != 9) {
				int ano, mes;
				opc = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Olá, digite o exercicio que quer executar:\n" + "1 - Exibir média de jogadores"
								+ "\n2 - Gera arquivo de média de jogadores" + "\n9 - Sair",
						"MENU", JOptionPane.QUESTION_MESSAGE));

				switch (opc) {
				case 1:
					ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de lançamento do jogo",
							"ANO DE LANÇAMENTO", JOptionPane.QUESTION_MESSAGE));
					mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mes de lançamento do jogo","MÊS DE LANÇAMENTO",
							JOptionPane.QUESTION_MESSAGE));
					Double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a média que espera",
							"MÉDIA ESPERADA", JOptionPane.QUESTION_MESSAGE));
					steam.exibeMediaJogadores(ano, mes, media);
					break;
				case 2:
					ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de lançamento do jogo",
							"ANO DE LANÇAMENTO", JOptionPane.QUESTION_MESSAGE));
					mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o mes de lançamento do jogo","MÊS DE LANÇAMENTO",
							JOptionPane.QUESTION_MESSAGE));
					String caminho = JOptionPane.showInputDialog(null,
							"Digite o caminho do diretorio que será salvo o arquivo", "CAMINHO DO NOVO ARQUIVO",
							JOptionPane.QUESTION_MESSAGE);
					String nomeArq = JOptionPane.showInputDialog(null, "Digite o nome do arquivo",
							"NOME DO NOVO ARQUIVO", JOptionPane.QUESTION_MESSAGE);
					steam.geraArquivoMediaDeJogadores(ano, mes, caminho, nomeArq);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Saindo...");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente!");

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
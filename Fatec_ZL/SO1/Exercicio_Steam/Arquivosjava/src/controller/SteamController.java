package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SteamController {

	public SteamController() {
		super();
	}

	private void excecaoAno(int ano) throws IllegalArgumentException {
		if (ano > 2021 || ano < 2012) {
			throw new IllegalArgumentException("Ano invalido,desculpe só temos de 2012 ate 2021");
		}
	}

	private String conversorDeMes(int mes) {
		String mesEmIngles = null;
		switch (mes) {
		case 1:
			mesEmIngles = "January";
			break;
		case 2:
			mesEmIngles = "February";
			break;
		case 3:
			mesEmIngles = "March";
			break;
		case 4:
			mesEmIngles = "April";
			break;
		case 5:
			mesEmIngles = "May";
			break;
		case 6:
			mesEmIngles = "June";
			break;
		case 7:
			mesEmIngles = "July";
			break;
		case 8:
			mesEmIngles = "August";
			break;
		case 9:
			mesEmIngles = "September";
			break;
		case 10:
			mesEmIngles = "October";
			break;
		case 11:
			mesEmIngles = "November";
			break;
		case 12:
			mesEmIngles = "December";
			break;
		default:
			throw new IllegalArgumentException("Mês invalido");
		}
		return mesEmIngles;
	}

	public void exibeMediaJogadores(int ano, int mes, double mediaEsperada) throws IOException {
		excecaoAno(ano);
		String mesEmIngles = conversorDeMes(mes);

		File arq = new File("C:\\TEMP\\Aula", "SteamCharts.csv");
		FileInputStream fluxo = new FileInputStream(arq);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine();
		// coluna0(nome), coluna1(ano), coluna2(mes), coluna3(media)
		int coluna1;
		double coluna3;
		boolean achou = false;

		// primeira linha contem apenas os nomes das colunas
		linha = buffer.readLine();

		System.out.println("Nome do jogo e média de jogadores ativos: ");
		
		while (linha != null) {
			String[] colunas = linha.split(",");
			coluna1 = Integer.parseInt(colunas[1]);
			coluna3 = Double.parseDouble(colunas[3]);
			if (ano == coluna1 && mesEmIngles.equals(colunas[2]) && coluna3 >= mediaEsperada) {
				achou = true;
				System.out.println(colunas[0] + " | " + coluna3);
			}
			linha = buffer.readLine();
		}
		fluxo.close();
		leitor.close();
		buffer.close();
		String fimLista;
		if (achou) {
			fimLista = "A lista de jogos chegou ao fim";
		} else {
			fimLista = "Nenhum jogo em " + mesEmIngles + ", " + ano
					+ ", que tenha média de jogadores igual ou menor que: " + mediaEsperada;
		}
		System.out.println(fimLista);
	}

	public void geraArquivoMediaDeJogadores(int ano, int mes, String caminho, String nomeArq) throws IOException {
		excecaoAno(ano);
		String mesEmIngles = conversorDeMes(mes);

		File dir = new File(caminho);
		if (dir.exists() && dir.isDirectory()) {
			File dados = new File("C:\\TEMP", "SteamCharts.csv");
			File arqNovo;
			if (nomeArq.contains(".csv")) {
				arqNovo = new File(caminho, nomeArq);
			} else {
				arqNovo = new File(caminho, nomeArq);
			}

			FileInputStream fluxo = new FileInputStream(dados);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			FileWriter fileWriter = new FileWriter(arqNovo);
			PrintWriter print = new PrintWriter(fileWriter);
			String linha = buffer.readLine();

			// primeira linha contem apenas os nomes das colunas
			linha = buffer.readLine();

			while (linha != null) {
				StringBuffer saida = new StringBuffer();
				String[] colunas = linha.split(",");
				int coluna1 = Integer.parseInt(colunas[1]);
				double coluna3 = Double.parseDouble(colunas[3]);

				if (ano == coluna1 && mesEmIngles.equals(colunas[2])) {
					saida.append(colunas[0] + ";");
					saida.append(coluna3 + "\r\n");
					print.write(saida.toString());
				}
				linha = buffer.readLine();
			}
			
			print.flush();
			buffer.close();
			fluxo.close();
			leitor.close();
			fileWriter.close();
			print.close();

			if (arqNovo.exists() && arqNovo.length() >= 1) {
				System.out.println("Arquivo criado com sucesso");
			} else {
				throw new IOException("Erro, arquivo criado está vazio");
			}

		} else {
			throw new IOException("Diretório invalido");
		}
	}
}
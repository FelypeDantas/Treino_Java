package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
	  static void tabela(byte[][] jogada) {
	        System.out.println("| " + casas(jogada[0][0]) + " | " + casas(jogada[0][1]) + " | " + casas(jogada[0][2]) + " |");
	        System.out.println("+---+---+---+");
	        System.out.println("| " + casas(jogada[1][0]) + " | " + casas(jogada[1][1]) + " | " + casas(jogada[1][2]) + " |");
	        System.out.println("+---+---+---+");
	        System.out.println("| " + casas(jogada[2][0]) + " | " + casas(jogada[2][1]) + " | " + casas(jogada[2][2]) + " |");
	    }

	    static char casas(byte jogado) {

	        if (jogado == -2) {
	            return 'X';
	        } else if (jogado == -3) {
	            return 'O';
	        } else {
	            return (char) (jogado + '0');
	        }
	    }

	    static void jogar(byte[][] jogadas, int jogador, byte casa) {
	        for (byte linha = 0; linha < 3; linha++) {
	            for (byte coluna = 0; coluna < 3; coluna++) {
	                if (casa == jogadas[linha][coluna]) {
	                    jogadas[linha][coluna] = (byte) jogador;
	                    break;
	                }
	            }
	        }
	    }

	    static boolean verificarVitoria(byte[][] tabela, byte contador) {
	        int f1 = tabela[0][0] + tabela[0][1] + tabela[0][2];
	        int f2 = tabela[1][0] + tabela[1][1] + tabela[1][2];
	        int f3 = tabela[2][0] + tabela[2][1] + tabela[2][2];

	        int f4 = tabela[0][0] + tabela[1][0] + tabela[2][0];
	        int f5 = tabela[0][1] + tabela[1][1] + tabela[2][1];
	        int f6 = tabela[0][2] + tabela[1][2] + tabela[2][2];

	        int f7 = tabela[0][0] + tabela[1][1] + tabela[2][2];
	        int f8 = tabela[0][2] + tabela[1][1] + tabela[2][0];

	        tabela(tabela);

	        if (f1 == -6 || f2 == -6 || f3 == -6 || f4 == -6 || f5 == -6 || f6 == -6 || f7 == -6 || f8 == -6) {
	            System.out.println("\n 1º JOGADOR GANHOU!");
	            return false;
	        } else if (f1 == -9 || f2 == -9 || f3 == -9 || f4 == -9 || f5 == -9 || f6 == -9 || f7 == -9 || f8 == -9) {
	            System.out.println("\n 2º JOGADOR GANHOU!");
	            return false;
	        } else if (contador == 9) {
	            System.out.println("EMPATOU!");
	            return false;
	        }

	        return true;
	    }

	    static boolean verificarErro(byte[][] tabela, byte jogadaAtual) {
	        if (jogadaAtual < 1 || jogadaAtual > 9) {
	            System.out.println("Jogue entre 1 e 9, tente novamente!");
	            return true;
	        }

	        byte contador = 0;
	        for (int linha = 0; linha < 3; linha++) {
	            for (int coluna = 0; coluna < 3; coluna++) {
	                contador++;
	                if (tabela[linha][coluna] == jogadaAtual) {
	                    System.out.println("Jogada válida -- " + contador);
	                    return false;
	                } else{
	                    System.out.println("Jogada inválida -- " + contador);
	                }
	            }
	        }

	        return false;
	    }


	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        byte[][] jogadas = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        byte novaJogada, contador = 1;
	        boolean terminar = true;
	        boolean erro;


	        tabela(jogadas);
	        do {
	            System.out.println("\n 1º jogador: [X] em qual posição?");
	            novaJogada = leia.nextByte();
	            erro = verificarErro(jogadas, novaJogada);
	            if (erro) {
	                continue;
	            } else {
	                jogar(jogadas, -2, novaJogada);
	                terminar = verificarVitoria(jogadas, contador);
	                if (!terminar) {
	                    break;
	                }
	            }


	            System.out.println("\n 2º jogador: [O] em qual posição?");
	            novaJogada = leia.nextByte();
	            erro = verificarErro(jogadas, novaJogada);
	            if (erro) {
	                continue;
	            } else {
	                jogar(jogadas, -3, novaJogada);
	                terminar = verificarVitoria(jogadas, contador);
	                if (!terminar) {
	                    break;
	                }
	            }
	        } while (terminar);

	        leia.close();
	    }

	}


package br.pablo.desafiocapgemini02;

import java.util.Scanner;

public class DesafioProgramacaoQ3 {

public static void main(String[] args) {
	
	/**
	 * Método main chama o método calculaLinhasColunas() para fazer o cálculo de quantas 
	 * linhas e colunas são necessárias para a construção da grid;
	 * 
	 * Chama ainda o método criaGrid() para a criação da grid e imprimeMensagemEncriptada()
	 * para imprimir a mensagem encriptada como saída.
	 * 
	 * @param T armazena o tamanho da mensagem
	 * @param mensagemArray armazena a mensagem em formato de array
	 * @param linhas armazena a quantidade de linhas
	 * @param colunas armazena a quantidade de colunas
	 * @param grid armazena a grid
	 * @return int qtdNum - recebe a quantidade de números encontrados
	 */
		
		int T, linhas = 0, colunas = 0;
		String mensagem;
		char[] mensagemArray;
		int[] result = new int[2];
		char[][] grid;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua mensagem: ");
		mensagem = scanner.nextLine();
		mensagem = mensagem.replace(" ", ""); // retirando os espaços em branco
		
		mensagemArray = mensagem.toCharArray(); // conversão de String para um vetor de caracteres
		
		T = mensagemArray.length;
		
		result = calculaLinhasColunas(T, mensagemArray);
		linhas = result[0];
		colunas = result[1];
		
		grid = criaGrid(linhas, colunas, T, mensagemArray);
		
		imprimeMensagemEncriptada(grid, linhas, colunas);
			
	}

	public static int [] calculaLinhasColunas(int T, char [] mensagemArray) {
		
		/**
		 * Método responsável por calcular a quantidade de linhas e colunas 
		 * que são necessárias para a construção da grid.
		 * 
		 * É calculada a raiz e verificado se há resto, afim de saber se é uma raiz exata ou não.
		 * 
		 * Caso for uma raiz exata, o número de linhas e colunas vai ser igual a parte
		 * inteira da raiz.
		 * 
		 * Caso não, se a multiplicação da parte inteira da raiz pela parte inteira 
		 * acrescida de uma unidade for maior que o tamanho do vetor, indica que é
		 * necessário que número de linhas seja igual ao da parte inteira da raiz e 
		 * o de colunas seja igual a parte inteira acrescido de uma unidade.
		 
		 * Caso não, se a multiplicação da parte inteira da raiz pela parte inteira 
		 * acrescida de uma unidade for menor que o tamanho do vetor, indica que é 
		 * necessário que o número de linhas e o de colunas seja igual a parte 
		 * inteira acrescido de uma unidade.
		 * 
		 * @param T armazena o tamanho da mensagem
		 * @param mensagemArray armazena a mensagem em formato de array
		 * @param n recebe o tamanho do vetor
		 * @return result - retorna um vetor de duas posições contendo o número
		 * de linhas e colunas.
		 *         
		 */
		
		int linhas = 0, colunas = 0;
		int[] result = new int[2];
		double raizT = Math.sqrt(T);
		double resto = raizT - Math.floor(raizT);
		
		if(resto == 0) {
			linhas = (int) raizT;
			colunas = (int) raizT;
		}
		else if ((int) raizT * ((int) raizT + 1) >= T ){
			linhas = (int) raizT;
			colunas = (int) raizT + 1;
		}
		else if ((int) raizT * ((int) raizT + 1) < T ){
			linhas = (int) raizT + 1;
			colunas = (int) raizT + 1;
		}
	
		result[0] = linhas;
		result[1] = colunas;
		
		return result;
		
		
	}
	
	public static char[][] criaGrid(int linhas, int colunas, int T, char [] mensagemArray) {
		
		/**
		 * Método responsável por criar a grid.
		 * 
		 * Ao popular a grid, se o contador for menor que o tamanho da mensagem, 
		 * armazena na grid o caractere correspondente.
		 * 
		 * Senão, adiciona espaços vazios.
		 *
		 * @param linhas armazena a quantidade de linhas
		 * @param colunas armazena a quantidade de colunas
		 * @param T armazena o tamanho da mensagem
		 * @param mensagemArray armazena a mensagem em formato de array
		 * @return char[][] grid - retorna a grid criada  
		 */
		
		char[][] grid = new char[linhas][colunas];
		int cont = 0;
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if (cont < T) { 
					grid[i][j] = mensagemArray[cont];
					cont++;
				}
				else { 
					grid[i][j] = ' ';
				}
			}
		}
		
		return grid; 
		
	}
	
	public static void imprimeMensagemEncriptada(char [][] grid, int linhas, int colunas) {
		
		/**
		 * Método responsável por impirmir a grid.
		 * 
		 * Enquanto j for 0, não é necessário darmos espaço entre as palavras da mensagem.
		 * 
		 * Um elemento da grid só é impresso se não for vazio.
		 *
		 * @param grid armazena a grid
		 * @param linhas armazena a quantidade de linhas
		 * @param colunas armazena a quantidade de colunas
		 */

			for(int j = 0; j < colunas; j++) {
				if (j != 0) {
					System.out.print(" ");
				}
					
				for(int i = 0; i < linhas; i++) {
					if (grid[i][j] != ' ') {
						System.out.print(grid[i][j]);
					}
				}
			}
	}

}

package br.pablo.desafiocapgemini02;

import java.util.Scanner;

public class DesafioProgramacaoQ2 {

public static void main(String[] args) {
	
	/**
	 * Método main chama o método criaVetor() para a criação do vetor
	 * e comparaDiferenca() para encontrar os números que que tem uma diferença igual ao valor de x;
	 * 
	 * @param n armazena o tamanho do vetor
	 * @param vet armazena o vetor
	 * @param x armazena o valor da diferença a ser comparada
	 * @return int qtdNum - recebe a quantidade de números encontrados
	 */
		
		int n;
		int[] vet;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do seu vetor:");
		n = scanner.nextInt();
		vet = criaVetor(n);
		
		System.out.println("Informe o valor da diferença a ser comparada: ");
		int x = scanner.nextInt();
		
		int qtdNum = comparaDiferenca(vet, n, x);
		System.out.println(qtdNum);
			
	}

	public static int[] criaVetor(int n) {
		
		/**
		 * Método responsável por criar o vetor
		 * 
		 * @param n recebe o tamanho do vetor
		 * @return vet - retorna o vetor criado
		 *         
		 */
		
		int[] vet = new int[n];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Adicione um número ao vetor: ");
			vet[i] = scanner.nextInt();
		}
		
		return vet;
	}
	
	public static int comparaDiferenca(int [] vet, int n, int x) {
		
		/**
		 * Método responsável por comparar a diferenca entre os números do vetor e o valor da 
		 * diferença x.
		 * 
		 * O algoritmo percorre as posições do vetor, comparando a diferença dos números com o valor
		 * de x.
		 * 
		 * Se verdadeiro, é acrescido uma unidade ao valor de count.
		 * 
		 * @param n armazena o tamanho do vetor
		 * @param vet armazena o vetor
		 * @param x armazena o valor da diferença a ser comparada
		 * @return int count - quantidade de números encontrados que satisfazem a condição
		 *         
		 */
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {	
			for (int j = 0; j < n; j++) {
				if (vet[i] - vet[j] == x) {
					count++;	
				}			
			}		
		}
		
		return count;
	}

}

package br.pablo.desafiocapgemini02;

import java.util.Scanner;

public class DesafioProgramacaoQ2 {

public static void main(String[] args) {
	
	/**
	 * M�todo main chama o m�todo criaVetor() para a cria��o do vetor
	 * e comparaDiferenca() para encontrar os n�meros que que tem uma diferen�a igual ao valor de x;
	 * 
	 * @param n armazena o tamanho do vetor
	 * @param vet armazena o vetor
	 * @param x armazena o valor da diferen�a a ser comparada
	 * @return int qtdNum - recebe a quantidade de n�meros encontrados
	 */
		
		int n;
		int[] vet;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do seu vetor:");
		n = scanner.nextInt();
		vet = criaVetor(n);
		
		System.out.println("Informe o valor da diferen�a a ser comparada: ");
		int x = scanner.nextInt();
		
		int qtdNum = comparaDiferenca(vet, n, x);
		System.out.println(qtdNum);
			
	}

	public static int[] criaVetor(int n) {
		
		/**
		 * M�todo respons�vel por criar o vetor
		 * 
		 * @param n recebe o tamanho do vetor
		 * @return vet - retorna o vetor criado
		 *         
		 */
		
		int[] vet = new int[n];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Adicione um n�mero ao vetor: ");
			vet[i] = scanner.nextInt();
		}
		
		return vet;
	}
	
	public static int comparaDiferenca(int [] vet, int n, int x) {
		
		/**
		 * M�todo respons�vel por comparar a diferenca entre os n�meros do vetor e o valor da 
		 * diferen�a x.
		 * 
		 * O algoritmo percorre as posi��es do vetor, comparando a diferen�a dos n�meros com o valor
		 * de x.
		 * 
		 * Se verdadeiro, � acrescido uma unidade ao valor de count.
		 * 
		 * @param n armazena o tamanho do vetor
		 * @param vet armazena o vetor
		 * @param x armazena o valor da diferen�a a ser comparada
		 * @return int count - quantidade de n�meros encontrados que satisfazem a condi��o
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

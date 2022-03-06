package br.pablo.desafiocapgemini02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesafioProgramacaoQ1 {

public static void main(String[] args) {
	
	/**
	 * M�todo main chama o m�todo criaLista() para a cria��o da lista
	 * e calculaMediana() para o c�lculo da mediana;
	 * 
	 * @param qtdNum armazena a quantidade de n�meros da lista
	 * @param listaNum armazena a lista criada
	 * @return int mediana - recebe a mediana da lista criada
	 */
		
		int qtdNum, mediana;
		List<Integer> listaNum = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de n�meros da lista: ");
		
		qtdNum = scanner.nextInt();
		listaNum = criaLista(qtdNum);
		mediana = calculaMediana(listaNum, qtdNum);
		
		System.out.println("A mediana da lista informada �: " + mediana);
		
	}

	public static List<Integer> criaLista(int qtdNum) {
		
		/**
		 * M�todo respons�vel por criar a lista de n�meros
		 * 
		 * @param qtdNum recebe a quantidade de numeros que a lista deve ter 
		 * @return List<Integer> listaNum - retorna a lista criada
		 *         
		 */

		int num;
		List<Integer> listaNum = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < qtdNum; i++) {
			System.out.println("Adicione um n�mero a lista: ");		
			num = scanner.nextInt();	
			listaNum.add(num);
		}
		
		return listaNum;
		
	}

	public static int calculaMediana(List<Integer> lista, int qtdNum) {
		
		/**
		 * M�todo respons�vel por fazer o c�lculo da mediana
		 * 
		 * Primeiro � realizada a ordena��o da lista em ordem crescente e logo ap�s, 
		 * realizado o c�lculo.
		 * 
		 * @param lista recebe a lista de n�meros
		 * @return int mediana - mediana encontrada
		 *         
		 */
		
		Collections.sort(lista); // ordenando a lista em ordem crescente
		int mediana = lista.get((int)qtdNum/2);
		return mediana;
	}

}

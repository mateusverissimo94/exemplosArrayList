package monitoria;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// declarando uma lista de mercado
		ArrayList<String> listaMercado = new ArrayList<>();
		
		// verifica se a lista está vazio - retorna um boolean
		listaMercado.isEmpty();

		listaMercado.add("Arroz");
		listaMercado.add("Feijão");
		listaMercado.add("Papel Toalha");
		listaMercado.add("Molho de Tomate");
		listaMercado.add("Óleo");
		listaMercado.add("Suco de Uva");
		listaMercado.add("Maionese");
		listaMercado.add("Biscoito");
		listaMercado.add("Salgadinho");
		listaMercado.add("Leite");
		listaMercado.add("Peito de Frango");
		
		// Insere o elemento especificado na posição indicada da lista
		listaMercado.add(2, "Açucar");
		
		// verifica se o elemento passado existe na lista - retorna um boolean
		System.out.println(listaMercado.contains("Biscoito"));
		System.out.println(listaMercado.contains("Tomate"));
		
		// retorna a posição do elemento na lista
		System.out.println(listaMercado.indexOf("Maionese"));
		
		//retorna o ultimo elemento da lista
		System.out.println(listaMercado.lastIndexOf("Leite"));
		
		// substitui o elemento da lista por um novo
		listaMercado.set(7, "Ketckup");

		// mostrando os "n" contatos da agenda (usando o índice)
		// número de elementos da agenda: método size()
		System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
		int n = listaMercado.size();
		for (int i = 0; i < n; i++) {
			System.out.printf("Posição %d- %s\n", i, listaMercado.get(i));
		}


		System.out.printf("\nInforme a posição a ser excluída:\n");
		int i = ler.nextInt();

		// remove o i-ésimo contato da agenda
		listaMercado.remove(i);

		// mostrando os "n" contatos da agenda (usando for-each)
		System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
		i = 0;
		for (String contato : listaMercado) {
			System.out.printf("Posição %d- %s\n", i, contato);
			i++;
		}
		
		// Removendo todos os elementos da lista
		listaMercado.clear();
		listaMercado.isEmpty();

	}

}

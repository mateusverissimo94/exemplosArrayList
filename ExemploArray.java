package monitoria;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploArray {
	public static void main(String[] args) {
		String[] listaMercado = new String[10]; // declarando um array 
		int[] cedulas = { 2, 5, 10, 20, 50, 100, 200 }; // inicialiando um array

		listaMercado[0] = "Arroz ";
		listaMercado[1] = "Feijão";
		listaMercado[2] = "Papel Toalha";
		listaMercado[3] = "Molho de Tomate";
		listaMercado[4] = "Óleo";
		listaMercado[5] = "Suco de Uva";
		listaMercado[6] = "Maionese";
		listaMercado[7] = "Biscoito";
		listaMercado[8] = "Salgadinho";
		listaMercado[9] = "Leite";
		// listaMercado[10] = "Peito de Frango";

		System.out.println(listaMercado); // imprimindo na tela o local da memória onde está o array
		System.out.println(listaMercado[5]); // imprimindo conteúdo da sexta posição do array
		System.out.println(listaMercado.length); // imprimindo o tamanho desse array
		
		//forEach para mostrar todos os conteúdos do array
		for(int i : cedulas) {
			System.out.println(i);
		}
		
		// inicializando um array Bidimensional
		int[][] arrayBidimensional = {{1,31},{2,29},{3,27},{4,25},{4,25}};
		System.out.println(Arrays.deepToString(arrayBidimensional));
		
		//FAZ UM LOOP PELAS COLUNAS DA LINHA ATUAL
		for(int linha = 0; linha < arrayBidimensional.length; linha++)
        {
            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for( int coluna = 0; coluna < arrayBidimensional[linha].length; coluna++)
                System.out.printf("%d ", arrayBidimensional[linha][coluna]);     
            System.out.println();
        }
		
		// pequeno programa usando o array
		int[] contando = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < contando.length;i++) {
			System.out.println("adicione um número: ");
			contando[i] = scan.nextInt();
		}
		
		for(int i : contando) {
			System.out.println(i);
		}
		
	}

}

package matriz;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o n�mero de linhas: ");
		int l = sc.nextInt();
		
		System.out.println("Insira o n�mero de colunas:" );
		int c = sc.nextInt();
		
		int [][] matriz = new int[l][c];
		
		System.out.println("Insira os valores: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
					
			}
					
		}
		
		System.out.println("Insira um valor que foi adicionada � Matriz: ");
		
		int x = sc.nextInt();
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Posi��o: " + i+ " " + j);
					if (i==0 && j==0) {
						System.out.println("O valor a direita �: " + matriz[i][j+1]);
						System.out.println("O valor abaixo �: " + matriz[i+1][j]);
					}
					if(i==0 && j== matriz[i].length-1) {
						System.out.println("O valor � esquerda �: " + matriz[i][j-1]);
						System.out.println("O valor abaixo �: " + matriz[i+1][j]);
										}
					if(i==0 && j != matriz[i].length-1 && j!=0) {
						System.out.println("O valor � esquerda �: " + matriz[i][j-1]);
						System.out.println("O valor � direita �: " + matriz[i][j+1]);
						System.out.println("O valor abaixo �:  " + matriz[i+1][j]);

						
					}
					if(i==j && i>0 && i != matriz.length-1) {
						System.out.println("O valor a direita �: " + matriz[i][j+1]);
						System.out.println("O valor abaixo �: " + matriz[i+1][j]);
						System.out.println("O valor acima � : " + matriz[i-1][j]);
						
					}
					
					if (i>0 && i<matriz.length-1 && j>0 && j<matriz[i].length-1) {
						System.out.println("O valor � esquerda �: " + matriz[i][j-1]);
						System.out.println("O valor � direita �: " + matriz[i][j+1]);
						System.out.println("O valor abaixo �:  " + matriz[i+1][j]);
						System.out.println("O valor acima � : " + matriz[i-1][j]);
					}
					
					if (i>0 && i<matriz.length-1 && j>0 && j==matriz[i].length-1) {
						System.out.println("O valor abaixo �:  " + matriz[i+1][j]);
						System.out.println("O valor acima � : " + matriz[i-1][j]);
						System.out.println("O valor � esquerda �: " + matriz[i][j-1]);
						
					}
					
					if(i==matriz.length-1 && j==0) {
						System.out.println("O valor acima � : " + matriz[i-1][j]);
						System.out.println("O valor � direita �: " + matriz[i][j+1]);
										
					}
					if(i==matriz.length-1 && j==matriz[i].length-1) {
						System.out.println("O valor � esquerda �: " + matriz[i][j-1]);
						System.out.println("O valor acima � : " + matriz[i-1][j]);
					}
					
					if(i==matriz.length-1 && j!=matriz[i].length-1) {
						System.out.println("O valor acima � : " + matriz[i-1][j]);
						System.out.println("O valor � esquerda �: " + matriz[i][j-1]);
						System.out.println("O valor � direita �: " + matriz[i][j+1]);
					
					} 
					}
					
				
				
				
			}
			
		}
		
		

	}

}

package ExerciciosArrey;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [][] matriz1 = new float[2][2];
		float [][] matriz2 = new float[2][2];
		float [][] operacoes = new float[2][2];
		int escolha,constante;
		
		Scanner leia = new Scanner (System.in);
		
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				matriz1[linha][coluna]=leia.nextInt();
			}
		}
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				matriz2[linha][coluna]=leia.nextInt();
			}
		}
		
		System.out.println("\nEscolha:");
		System.out.println("1 - somar as duas matrizes: ");
		System.out.println("2 - subtrair a primeira matriz da segunda: ");
		System.out.println("3 - adicionar uma constante as duas matrizes: ");
		System.out.println("4 - imprimir as matrizes: ");
		escolha=leia.nextInt();
		
		switch(escolha)
		{
		case 1:
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					operacoes[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
				}
			}
			System.out.println("\nA Matriz ficou assim: \n");
			for(int linha=0;linha<2;linha++)
			{
				System.out.println();
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\t %.2f \t",operacoes[linha][coluna]);
				}
			}
			break;
		case 2:
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					operacoes[linha][coluna]=matriz1[linha][coluna]-matriz2[linha][coluna];
				}
			}
			System.out.println("\nA Matriz ficou assim: \n");
			for(int linha=0;linha<2;linha++)
			{
				System.out.println();
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\t %.2f \t",operacoes[linha][coluna]);
				}
			}
			break;
		case 3:
			System.out.println("Entre com um número da constante: ");
			constante = leia.nextInt();
			
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					operacoes[linha][coluna]=constante;
				}
			}
			System.out.println("\nA Matriz ficou assim: \n");
			for(int linha=0;linha<2;linha++)
			{
				System.out.println();
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\t %.2f \t",operacoes[linha][coluna]);
				}
			}
			
			break;
		case 4:
			System.out.println("\nA Matriz 1 ficou assim: \n");
			for(int linha=0;linha<2;linha++)
			{
				System.out.println();
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\t %.2f \t",matriz1[linha][coluna]);
				}
			}
			System.out.println("\n\nA Matriz 2 ficou assim: \n");
			for(int linha=0;linha<2;linha++)
			{
				System.out.println();
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\t %.2f \t",matriz2[linha][coluna]);
				}
			}
			break;
		default: 
			System.out.println("\nOpção inválida!!!");
		}
	}
}

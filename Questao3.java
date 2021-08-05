package ExerciciosArrey;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]matriz = new int[3][3];
		int contmais10=0;

		Scanner leia = new Scanner(System.in);
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna]=leia.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					contmais10++;
				}
			}
		}
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{				
				if(matriz[linha][coluna]>10)
				{
					System.out.println(matriz[linha][coluna]+" <--- Este número é maior que 10.");
				}
			}
		}
		System.out.println("\nQuantidade de números maiores que 10: "+contmais10);
	}

}

package ExerciciosArrey;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros = new int[6];
		int pares, somapar=0, impares=0, contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<6;x++)
		{
			System.out.print("\nEntre com o n�mero: ");
			numeros[x] = leia.nextInt();
			if(numeros[x]%2==0)
			{
				somapar+=numeros[x];
			}
			else
			{
				contimpar++;
			}
		}
		System.out.println("\n");
		for(int x=0;x<6;x++)
		{
			if(numeros[x]%2==0)
			{
				System.out.println(numeros[x]+" <--- Este n�mero � par.");
			}
			else
			{
				System.out.println(numeros[x]+" <--- Este n�mero � impar.");
			}
		}
		System.out.println("\nA soma dos n�meros pares digitados �: "+somapar);
		System.out.println("\nA quantidade de n�meros �mpares digitados �: "+contimpar);
	}

}

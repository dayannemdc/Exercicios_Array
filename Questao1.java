package ExerciciosArrey;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vetor = {1,0,5,-2,-5,7};
		int soma;
		
		soma = vetor[0] + vetor[1] + vetor[5];
		System.out.println("\nA soma entre os valores das posições A[0], A[1] e A[5] é igual a: "+soma);
		
		vetor[4]=100;
		
		for (int i=0;i<6;i++)
		{
			System.out.println("Vetor A ["+i+"] = "+vetor[i]);
		}
	}
}

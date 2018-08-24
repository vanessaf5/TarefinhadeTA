package TA;

public class Main {

	/*
	 * Você deve refatorar o código abaixo para, 
	 * ao invés de trabalhar com a implementação de métodos estáticos, 
	 * adotar Lambdas.
	 */
	public static void main(String[] args) {
		
		ProcedimentoSoma procedimentoSoma = (n1,n2)-> n1+n2;
		System.out.println(procedimentoSoma.somar(10,15));//25
		
		
		
		
		ProcedimentoFatorial procedimentoFatorial = n1 -> {
			if (n1 < 0) {
				throw new IllegalArgumentException("numero < 0");
			}
			
			int resultado = 1;
			
			for (int i = 1; i <= n1; i++) {
				resultado *= i;
			}
			
			return resultado;
		};
		
		System.out.println(procedimentoFatorial.fatorial(5));
		System.out.println(procedimentoFatorial.fatorial(7));
		
		
		
		
		ProcedimentoPrimo procedimentoPrimo = n1 -> {
			int divisiveis = 0;
			
			for (int i = 1; i <= n1; i++) {
				if (n1 % i == 0) {
					divisiveis++;
				}
			}
			
			return divisiveis == 2;
			
		};
		System.out.println(procedimentoPrimo.isPrimo(13));
		System.out.println(procedimentoPrimo.isPrimo(14));
		
		
		
		
		
		ProcedimentoInteiroValido procedimentoInteiroValido = texto -> {
			        return texto.matches("-?\\d+");
		};
	
		System.out.println(procedimentoInteiroValido.isInteiroValido("157"));
		System.out.println(procedimentoInteiroValido.isInteiroValido("15a7"));
		
		
		
		
		ProcedimentoCalcularMedia procedimentoCalcularMedia = vetor -> {
			if (vetor.length == 0) {
				throw new IllegalArgumentException("vetor.length == 0");
			}
			
			double soma = 0;
			
			for (double valor : vetor) {
				soma += valor;
			}
			
			return soma / vetor.length;
		};
		
		double[] array1 = { 1, 10, 6.5, 189.5 };
		System.out.println(procedimentoCalcularMedia.calcularMedia(array1));
		
		double[] array2 = { 10, 58.9, 6.5, 18 };
		System.out.println(procedimentoCalcularMedia.calcularMedia(array2));

		
		
		
		
		ProcedimentoImprimirMaiorNumero procedimentoImprimirMaiorNumero = vetor -> {
			if (vetor.length == 0) {
				throw new IllegalArgumentException("vetor.length == 0");
			}
			
			double maiorNumero = vetor[0];
			
			for (int i = 1; i < vetor.length; i++) {
				if (vetor[i] > maiorNumero) {
					maiorNumero = vetor[i];
				}
			}
			
			System.out.println("Maior número = " + maiorNumero);
		};
		
		procedimentoImprimirMaiorNumero.imprimirMaiorNumero(array1);
		procedimentoImprimirMaiorNumero.imprimirMaiorNumero(array2);
	}
}
	

	
	
	
	
	
	
	
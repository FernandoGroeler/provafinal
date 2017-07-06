package br.univelprovafinal;

public class Ex04 {
	private static char[] vet;
	public static void execute(Integer num) {
		char[] charVet = String.valueOf(num).toCharArray();
		vet = new char[charVet.length * 2];
		
		for (int i = 0; i < charVet.length; i++) {
			vet[i] = charVet[i];
		}
		
		for (int i = 0; i < charVet.length; i++) {
			vet[i + charVet.length] = charVet[i];
		}
		
		char[] result = new char[charVet.length / 2];
		for (int i = 0; i < result.length; i++) {
			result[i] = vet[i * 2];
		}
		
		for (char c : result) {
			System.out.print(c);
		}
		
		System.out.println("");
	}
}
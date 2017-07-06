package br.univelprovafinal;

public class Ex02 {
	public static void execute(Integer ra) {
		int soma = ra % 2;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == i) {
					soma += calc(ra, j * i);
				}
			}
		}
		System.out.println(soma);
	}
	
	private static int calc(Integer num, int i) {
		String str = String.valueOf(num);
		if (i >= str.length()) {
			return 0;
		} else {
			int add = Integer.parseInt(str.substring(i + 2, i + 3));
			return add + i;
		}
	}
}

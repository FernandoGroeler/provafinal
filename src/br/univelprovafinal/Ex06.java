package br.univelprovafinal;

public class Ex06 {
	public static void  execute(Integer num) {
		int res = num % 10;
		if (res > 8) {
			res = res % 8;
		}
		if (res < 5) {
			res = res + 5;
		}
		calc(res);
	}
	
	private static void calc(int res) {
		int a = 1;
		int b = 1;
		System.out.print(a + "," + b);
		
		while (b < res) {
			System.out.print("," + (a + b));
			if (a > b)
				b += a;
			else
				a += b;
		}
		System.out.println("");
	}
}
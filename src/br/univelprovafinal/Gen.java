package br.univelprovafinal;

public class Gen {
	protected int num;
	protected int parc;
	public Gen(int parc, int num) {
		this.parc = parc;
		this.num = num;
	}
	public void imprime() {
		System.out.println((num % 2) - this.parc);
	}

}

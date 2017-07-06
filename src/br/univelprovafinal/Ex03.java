package br.univelprovafinal;

public class Ex03 {
	public static void execute(Integer ii) {
		String str = String.valueOf(ii);
		int parc = Integer.parseInt(str.substring(5, 6));
		Plunct a = new Plact(parc);
		Plact b = new Zoom(parc);
		System.out.println(a.getType() + b.getType());
	}
}
	
class Plunct {
	private int num;
	public Plunct(int num) {
		this.num = num;
	}
	int getType() {
		return this.num + 10;
	}
}
	
class Plact extends Plunct {
	 public Plact(int num) {
		super(num + 10);
	}
	int getType() {
		return super.getType() + 10;
	}
}
	
class Zoom extends Plact {
	public Zoom(int num) {
		super(num + 10);
	}
	int getType() {
		return super.getType() + 10;
	}
}
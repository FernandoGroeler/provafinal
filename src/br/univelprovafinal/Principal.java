package br.univelprovafinal;

public class Principal {
	public static void execute(Integer ra) {
		Ex01 ex01 = new Ex01();
		ex01.execute(ra);
		
		Ex02 ex02 = new Ex02();
		ex02.execute(ra);
		
		Ex03 ex03 = new Ex03();
		ex03.execute(ra);

		Ex04 ex04 = new Ex04();
		ex04.execute(ra);
		
		Ex05 ex05 = new Ex05();
		ex05.execute(ra);
		
		Ex06 ex06 = new Ex06();
		ex06.execute(ra);
		
		Ex07 ex07 = new Ex07();
		ex07.execute(ra);
		
		Ex08 ex08 = new Ex08();
		ex08.execute(ra);
		
		Ex09 ex09 = new Ex09();
		ex09.execute(ra);
		
		Ex10 ex10 = new Ex10();
		ex10.execute(ra);		
	}
	
	public static void main(String[] args) {
		Integer raAluno1 = 161400;
		Integer raAluno2 = 161022;
		
		System.out.println("Fernando");
		execute(raAluno1);
		System.out.println("====================================");
		System.out.println("Edson");
		execute(raAluno2);
		
	}
}
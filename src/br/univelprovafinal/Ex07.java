package br.univelprovafinal;import java.util.Iterator;

public class Ex07<T> {
	private CompartimentoLista<T> raiz;
	private CompartimentoLista<T> prox;
	
	public void add(T t) {
		if (raiz == null) {
			raiz = new CompartimentoLista<T>(t);
			prox = raiz;
		} else {
			CompartimentoLista<T> novo = new CompartimentoLista<T>(t);
			prox.setProximo(novo);
			prox = novo;
		}
	}
	
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private CompartimentoLista<T> step = raiz;
			
			@Override
			public boolean hasNext() {
				return step != null;
			}

			@Override
			public T next() {
				T objeto = step.getObjeto();
				step = step.getProximo();
				return objeto;
			}
			
			@Override
			public void remove() {
				
			}
		};
	}
	
	public static void execute(Integer codigo) {
		char[] ar = String.valueOf(codigo).toCharArray();
		
		Ex07<Integer> lista = new Ex07<>();
		for (int j = 0; j < ar.length; j++) {
			lista.add(Integer.parseInt(ar[j] + ""));
		}
		Iterator<Integer> it = lista.iterator();
		
		int soma = 0;
		
		while (it.hasNext()) {
			int num = it.next();
			if (num % 2 == 0) {
				soma += num;
			} else {
				soma += 1;
			}
		}
		System.out.println(soma);
	}
 }

class CompartimentoLista<T> {
	private T objeto;
	private CompartimentoLista<T> proximo;
	
	public CompartimentoLista(T t) {
		this.objeto = t;
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public CompartimentoLista<T> getProximo() {
		return proximo;
	}

	public void setProximo(CompartimentoLista<T> proximo) {
		this.proximo = proximo;
	}
}
package org.lessons.java;

import org.lessons.java.pojo.CicloInteri;

public class Main {
	public static void main(String[] args) {
		int[] elementi = {1, 2, 3, 4, 5,};
		CicloInteri elenco = new CicloInteri(elementi);
		
		elenco.addElemento(11);
		elenco.addElemento(12);
		elenco.addElemento(13);
		elenco.addElemento(14);
		elenco.addElemento(15);
		
		 

		while (elenco.hasAncoraElementi()) {
		    int elemento = elenco.getElementoSuccessivo();
		    System.out.println(elemento);
		}
		
		System.out.println("gli elementi sono finiti.");
		
	}

}

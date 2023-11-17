package org.lessons.java;

import org.lessons.java.pojo.CicloInteri;

public class Main {
	public static void main(String[] args) {
		int[] elementi = {1, 2, 3, 4, 5,};
		CicloInteri elenco = new CicloInteri(elementi);
		
		 

		while (elenco.hasAncoraElementi()) {
		    int elemento = elenco.getElementoSuccessivo();
		    System.out.println(elemento);
		}
		
	}

}

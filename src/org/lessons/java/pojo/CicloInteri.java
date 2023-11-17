package org.lessons.java.pojo;

public class CicloInteri {
	
	private int[] elenco;
	private int indice;
	
	public CicloInteri(int[] elenco) {
		// TODO Auto-generated constructor stub
		setElenco(elenco);
		setIndice(0);
	}

	public int[] getElenco() {
		return elenco;
	}

	public void setElenco(int[] elenco) {
		this.elenco = elenco;
	}

	public int getIndice() {
		return indice;
	}

	private void setIndice(int indice) {
		this.indice = indice;
	} 
	
	public int getElementoSuccessivo() {
		
			 int[] elencoNumeri = getElenco();
		     setIndice(getIndice() + 1);
		     return elencoNumeri[getIndice() - 1];
		
		
	}
	
	public boolean hasAncoraElementi() {
        return getIndice() < getElenco().length;
        
    }
	
	

}

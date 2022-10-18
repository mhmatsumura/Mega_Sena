package Model;

import java.io.Serializable;
import java.util.Arrays;

public class Cartela implements Serializable,Comparable<Cartela>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer[] numerosDaCartela;

	public Cartela(Integer[] helper) {
		
		numerosDaCartela =Arrays.copyOf(helper,helper.length);
	}

	public Integer[] getNumerosDaCartela() {
		return numerosDaCartela;
	}

	public void setNumerosDaCartela(Integer[] numerosDaCartela) {
		this.numerosDaCartela = numerosDaCartela;
	}

	
	@Override
	public int compareTo(Cartela c) {
		if (Arrays.asList(this.getNumerosDaCartela()).containsAll(Arrays.asList(c.getNumerosDaCartela()))) {
			return 0;
		}
		return -1;
	}

	

}

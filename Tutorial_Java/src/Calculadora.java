
public class Calculadora {
	private Integer numero1;
	private Integer numero2;
	

	public Integer getNumero1() {
		return numero1;
	}


	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}


	public Integer getNumero2() {
		return numero2;
	}


	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}


	public Integer somar() { //construcao da funcao (metodo)
		// toda funcao deve ser public
		// Integer para ter um retorno
		// somar nome da funcao deve ser sempre uma acao
		
		Integer total;
		
		total = numero1 + numero2;
		
		return total;
		
	}
	
}


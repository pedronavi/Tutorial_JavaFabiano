
public abstract class Felino {
	private String cor;
	private Double peso;
	private String sexo;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void comer() {
		System.out.println("o gato comeu");
		
	}
	public void emitirSom() {
		System.out.println("o gato miou");
		
	}

}

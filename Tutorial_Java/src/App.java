
public class App {

	public static void main(String[] args) {
		/* main tem a funcao para o compilador entender onde come�ar < - main
		 static compilador executa sem instanciar < - static
		 void tem a fun��o de nao retorna valor < - void */
		
		Calculadora yuri;
		Integer valor; // variavel para receber o valor da fun��o somar
		
		// Para instaciar o objeto:
		yuri = new Calculadora();
		
		// SET para setar valor e GET para imprimir,pegar o valor 
		yuri.setNumero1(5);
		yuri.setNumero2(7);
		
		valor = yuri.somar();
		
		System.out.println(valor);
		
	}

}

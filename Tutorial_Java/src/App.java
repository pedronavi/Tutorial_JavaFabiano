
public class App {

	public static void main(String[] args) {
		/* main tem a funcao para o compilador entender onde começar < - main
		 static compilador executa sem instanciar < - static
		 void tem a função de nao retorna valor < - void */
		
		Calculadora yuri;
		Integer valor; // variavel para receber o valor da função somar
		
		// Para instaciar o objeto:
		yuri = new Calculadora();
		
		// SET para setar valor e GET para imprimir,pegar o valor 
		yuri.setNumero1(5);
		yuri.setNumero2(7);
		
		valor = yuri.somar();
		
		System.out.println(valor);
		
	}

}

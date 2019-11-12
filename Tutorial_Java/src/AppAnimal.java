
public class AppAnimal {

	public static void main(String[] args) {
		Gato bolota;
		bolota = new Gato();
		
		bolota.setCor("branco");
		bolota.setSexo("M");
		bolota.setPeso(2d);
		
		bolota.comer();
		bolota.emitirSom();
		System.out.println("A cor do gato é: " + bolota.getCor());
	
		Tigre nervoso;
		nervoso = new Tigre();
		
		nervoso.emitirSom();
	
	}
	
	
		
	
}


public class main {

	public static void main(String[] args) {

		Animal animal = new Cachorro(); // polimorfismo: variavel animal mas instancia cachorro
		
		animal.Falar(); //uma s� variavel...
		
		animal = new Gato(); //vantagem, chamando gato j� vai aparecer o dialogo dele, porque mudou a instancia, mudou de forma
		
		animal.Falar(); //...mas 2 a�oes diferentes
		
		
	}

}


public class Aplicacao {

	public static void main(String[] args) {
		
		// Item Item = new Item();
		
		Item item = new Cogumelo(); // o primeiro j� cria a variavel
		item.pegar(); // exibe o conteuco colocado l� na classe do cogumelo, mas o metodo usado em todos � o mesmo
		
		item = new Moeda(); // na segunda n�o precisa, porque j� foi feita na primeira vez, tamo s� reutilizando
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
		
		
		
		
	}

}

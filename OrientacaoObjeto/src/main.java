
public class main {

	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa(); // o new cria um novo espa�o na heap, a stack guarda o endere�o do objeto, sem ele o objeto se perde
		
		pessoa1.nome = "Marcos";
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


public class main {

	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa(); // o new cria um novo espa�o na heap, a stack guarda o endere�o do objeto, sem ele o objeto se perde
		
		pessoa1.nome = "Marcos"; // nome da pessoa
		pessoa1.numFigurinhas = 1; // quantia de figs que j� possui
		
		pessoa1.receber(3);
		
		System.out.println("Usu�rio: " + pessoa1.nome);
		System.out.println("Saldo de figurinhas: " + pessoa1.numFigurinhas);
		
		Pessoa pessoa2 = new Pessoa(); // fez outra pessoa, a que vai pegar as figs
		
		pessoa2.nome = "Junin";
		pessoa2.numFigurinhas = 5; // figs que ela j� possui
		
		System.out.println("Usu�rio: " + pessoa2.nome);
		System.out.println("Saldo de figurinhas: " + pessoa2.numFigurinhas);
		
		pessoa1.dar(4, pessoa2); // � por causa desse comando que o pessoa passou a ser o pessoa2
		
		if (pessoa1.numFigurinhas >= 0) { // comando IF, � o SE s� que do java
			
			System.out.println("");
		System.out.println("transfer�ncia aceita com sucesso! os novos valores agora s�o:");
		System.out.println("");
		
		System.out.println("Usu�rio: " + pessoa1.nome);
		System.out.println("Saldo de figurinhas: " + pessoa1.numFigurinhas);
		
		System.out.println("Usu�rio: " + pessoa2.nome);
		System.out.println("Saldo de figurinhas: " + pessoa2.numFigurinhas);
		}
		
		else { // ELSE � o sen�o do java
			
			System.out.println("");
			System.out.println("transfer�ncia recusada, o saldo de nenhum usu�rio pode ficar negativo");
		}
		
		//metodo alternativo part2
		//aqui o retorno precisa ser true pra informa��o aparecer.
		//o  true precisa ser uma condi��o do if no Main.
	}

}

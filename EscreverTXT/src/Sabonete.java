
public class Sabonete {

	private String Nome, cheiro, cor;

	

	public Sabonete(String nome, String cheiro, String cor) { // construtor, � importante deixar os parametos com as informa�oes para que d� para preenche-las no main
		this.Nome = nome;
		this.cheiro = cheiro;
		this.cor = cor;
	}

	@Override
	public String toString() { // toString, converte varias strings em uma s�
		return "Sabonete [Nome=" + Nome + ", cheiro=" + cheiro + ", cor=" + cor + "]\n";
	}
	
	
	
	
	
	
	
	
	
	
}

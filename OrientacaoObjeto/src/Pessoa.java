
public class Pessoa {
	
	//variaveis
	String nome;
	int numFigurinhas; // variaveis globais, guardadas no heap
	
	//metodos (variaveis dentro do metodo s�o variaveis locais, somem ap�s o uso)
	void receber(int numFigurinhas) { // metodo para receber informa��o
		this.numFigurinhas += numFigurinhas; //this = acessa os atributos do objeto chamado
		
	}
	
	
	
	

}

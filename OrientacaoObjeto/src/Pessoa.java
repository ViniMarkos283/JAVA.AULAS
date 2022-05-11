
public class Pessoa {
	
	//variaveis
	String nome;
	int numFigurinhas; // variaveis globais, guardadas no heap
	
	//metodos (variaveis dentro do metodo s�o variaveis locais, somem ap�s o uso)
	void receber(int numFigurinhas) { // metodo para receber informa��o
		this.numFigurinhas += numFigurinhas; //this = acessa os atributos do objeto chamado
		
	}
	
	void dar(int numFigurinhas, Pessoa pessoa) { // A classe � pessoa porque chama o objeto, o Pessoa pessoa faz com que qualquer um seja chamado, n � um especifico
		this.numFigurinhas -= numFigurinhas;
			
		pessoa.receber(numFigurinhas);
		
	}
	
	//metodo alternativo: usar o boolean no lugar do void do DAR
	//os retornos ser�o true e false, dentro do if que ficar no pessoa

	

}

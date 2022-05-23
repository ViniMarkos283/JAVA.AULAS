
public enum DiaDaSemana {  // criado via source "Enum"
	  
	
	// todos os valores se tornar�o constantes, e suas v�riaveis precisam ter 100% maiusculas e separadas por virgula
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	// o ultimo fecha com ponto e virgula
	//todos s�o automaticamente instanciados aqui
	//eles podem receber atributos tambem
	//colocou valores pro private funcionar
	
	private int num; // inacessivel la fora, mas por ele pode-se definir as info armazenadas dentro dos valores
	
	private DiaDaSemana(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	

}

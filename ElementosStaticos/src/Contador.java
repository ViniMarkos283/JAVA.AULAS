
public class Contador {

	private static int valor; //atributo
	
//	public Contador() { // faz come�ar com o 1
//		this.valor = 1;
//	}
	
	static { // executa s� na primeira vez 
		valor = 1;
	}

	public static void incrementar() { // add +1
		valor ++;
	}

	public static int getValor() { // captura valor
		return valor;
	}

	public void setValor(int valor) { // mostra valor
		this.valor = valor;
	}
	
	
	
	
	
	
}

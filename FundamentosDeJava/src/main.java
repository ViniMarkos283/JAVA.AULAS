import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		//int x = 100;
		//double y  = 200.3;
		//int a = 0;
		//double b = 0;
		//short z = (short) 10000;
		
		//a = (int)y; // converte o double em int, sen�o perde informa��es //
		//b = x; // n�o precisou converter, porque o int cabe dentro do double //
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(z);
		
//		int idadePessoa = 19;
//		
//		if(idadePessoa < 18) { // primeira condi��o //
//			System.out.println("voc� n�o pode beber");
//		}
//		else if(idadePessoa < 60) { // segunda condi��o //
//			System.out.println("Bora tomar uma?");
//		}
//		else { // caso o valor n se encaixe em nenhuma das condicoes //
//			System.out.println("Aposentado ou pensionista?");
//		}
//
//		System.out.println("Voc� tem " + idadePessoa + " anos");
		
//		int  num = 2;
//		
//		switch(num) { // fun��o escolha
//		case 1: //caso
//			System.out.println("Domingo");
//			break; //manda o switch parar e vai pra depois da chave
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Ter�a");
//			break;
//		case 4:
//			System.out.println("Quarta");
//			break;
//		case 5:
//			System.out.println("Quinta");
//			break;
//		case 6:
//			System.out.println("Sexta");
//			break;
//		case 7:
//			System.out.println("S�bado");
//			break;
//		default: // serve de outrocaso, caso nenhum dos outros sejam atendidos
//			System.out.println("Este n�mero n�o corresponde a nenhum dia da semana");
//		} //chave*
		
		//pra comentar todo o codigo � s� usar o crtl + /
		
		// char significa caractere
//		char caractere = 'b'; // com caractere unico usa-se a aspas simples, sen�o vira uma string
//		
//		switch (caractere) {
//		case 'a':
//			System.out.println("seu caractere �: a");
//			break;
//		case 'b':
//			System.out.println("seu caractere �: b");
//			break;
//		default:
//			System.out.println("valor n�o encontrado");
//
//		}
		
//		String farol = "verde";
//		
//		switch(farol) {
//			case "verde":
//		System.out.println(farol);
//		System.out.println("Luz Verde: Prossiga");
//		break;
//			case "amarelo":
//		System.out.println(farol);
//		System.out.println("Luz Amarela: Aten��o");
//		break;
//			case "vermelho":
//		System.out.println(farol);
//		System.out.println("Luz Vermelha: Pare");
//		break;
//			default:
//		System.out.println("Cor inv�lida, o farol de transito n�o possui a cor correspondente");
//		System.out.println("Sugest�o: use cores como: verde, amarelo ou vermelho");
//			break;
//	
//		}
		
//		int x = 0;
//		
//		//while � o enquanto, repete algo at� a condi��o ser atendida, come�a verificando a condi��o e depois faz 
//		while(x<10) {
//			System.out.println(x);
//			x = x + 1;
//		}	
//		
//		// segundo tipo de while, o "do" significa fa�a. ele faz primeiro e depois atende a condi��o
//		do {
//			System.out.println(x);
//			x = x + 1;
//		}while (x<10); // enquanto isso n�o ocorre
		
	
//		//for � um para
//		for(int x=0; x<10; x++) {
//			System.out.println(x);
//		}
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int y = entrada.nextInt();
		
		
		for(int x=0; x<=10; x++) {
			System.out.println(y + " x " + x + " = " + x*y);
		} 
		
		
	}

}

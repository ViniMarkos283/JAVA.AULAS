
public class Aplicacao {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();

		veiculo.setMarca("Fiat");
		veiculo.setModelo("UNO");
		veiculo.setAno(2012);

		veiculo.imprimir();
		veiculo.buzinar();

		Carro carro = new Carro();

		carro.setMarca("n�o lembro ;-;"); // caracteristicas da super
		carro.setModelo("Sandero");
		carro.setAno(2015);
		carro.setQuatroPortas(true); // caracteristica da subclasse
		
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.setMarca("Mercedez");
		caminhao.setModelo("sla vei");
		caminhao.setAno(2010);
		
		System.out.println();
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda"); // copiei msm
		moto.setModelo("titan");
		moto.setAno(2010);
		
		System.out.println();
		
		moto.imprimir();
		moto.buzinar();
		moto.empinar();

	}

}


public class quadrado implements AreaCalculavel{

	@Override
	public void calcularArea(double x, double y) {
		System.out.println("A area do seu quadrado �: " +  Math.pow(x, 2));		
	}

}

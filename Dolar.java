package uninter;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}

	@Override 
	public void info() {
		System.out.println("Dólar: US " + this.valor);
		
	}

	@Override
	public double converter() {
		return this.valor*5.40;
	}

}

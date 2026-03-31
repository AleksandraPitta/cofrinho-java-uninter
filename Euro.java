package uninter;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Euro: € " + this.valor);
		
	}

	@Override
	public double converter() {
		return this.valor*6.30;
	}

}

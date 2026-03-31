package uninter;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}

	@Override //pra usar a classe mãe 
	//e adicionar ou mudar algum elemento
	public void info() {
		System.out.println("Real: R$" + this.valor); // valor da moeda
	}

	@Override
	public double converter() {
		return this.valor;
	}

}

package uninter;

public abstract class Moeda {
	protected double valor; 
	//protected p fazer com que as classes (mãe e filhas) tenham acesso direto.
	//aqui na classe abstrata não é possível criar objetos
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
//as subclasses(classes filhas) delas serão o real, dolar e euro
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract void info();
	public abstract double converter();

}

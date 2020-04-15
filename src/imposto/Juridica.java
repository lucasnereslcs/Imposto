package imposto;

public class Juridica extends Pessoa {

	protected int funcionarios;

	public Juridica(String nome, double renda, int funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	public double Imposto() {
		if (funcionarios > 10) {
			return renda * 0.14;
		}

		else
			return renda * 0.16;
	}

}

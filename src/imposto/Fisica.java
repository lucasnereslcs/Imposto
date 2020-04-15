package imposto;

public class Fisica extends Pessoa {

	protected double gastoSaude;

	public Fisica(String nome, double renda, double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude / 2;
	}

	public double Imposto() {
		if (this.renda < 20000.00) {
			return renda * 0.15 - this.gastoSaude;
		}

		else {
			return renda * 0.25 - this.gastoSaude;
		}
	}

}

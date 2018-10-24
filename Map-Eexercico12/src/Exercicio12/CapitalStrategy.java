package Exercicio12;

public abstract class CapitalStrategy {
	public abstract double capital(Loan loan);

	public double duration(Loan loan) {
		return 0;
	}

	protected double riskFactorFor(Loan loan) {
		return 0;
	}
}
package Exercicio12Respondido;

public abstract class CapitalStrategy {

	public double capital(Loan loan) {
		return duration(loan) 
				* riskFactorFor(loan) 
				* calcStrategyCapital(loan);
	}

	public abstract double calcStrategyCapital(Loan loan);

	public double duration(Loan loan) {
		return 0;
	}

	protected double riskFactorFor(Loan loan) {
		return 0;
	}
}

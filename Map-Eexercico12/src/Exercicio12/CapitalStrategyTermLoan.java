package Exercicio12;

public class CapitalStrategyTermLoan extends CapitalStrategy {

	public double capital(Loan loan) {

		return loan.getCommitment() 
				* duration(loan) 
				* riskFactorFor(loan);
	}

	public double duration(Loan loan) {
		return 0;
	}

}

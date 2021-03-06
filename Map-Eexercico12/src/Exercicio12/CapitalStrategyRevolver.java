package Exercicio12;

public class CapitalStrategyRevolver extends CapitalStrategy {

	public double capital(Loan loan) {

		return loan.outstandingRiskAmount() 
				* duration(loan) 
				* riskFactorFor(loan)
				+ (loan.unusedRiskAmount() 
				* duration(loan) 
				* unusedRiskFactory(loan));
	}

	public double unusedRiskFactory(Loan loan) {
		return 0;
	}
}

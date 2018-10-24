package Exercicio12Respondido;

public class CapitalStrategyTermLoan {
	public double calcStrategyCapital(Loan loan) {
		return loan.getCommitment();
	}

	public double duration(Loan loan) {
		return 0;
	}
}

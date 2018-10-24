package Exercicio12Respondido;

public class CapitalStrategyAdvisedLine extends CapitalStrategy {

	public double calcStrategyCapital(Loan loan) {

		return loan.getCommitment() * loan.getUnusedPercentage();
	}

}
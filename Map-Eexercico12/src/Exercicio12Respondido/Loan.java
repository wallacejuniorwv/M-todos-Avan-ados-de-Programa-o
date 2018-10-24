package Exercicio12Respondido;

public class Loan {

	private double commitment;
	private double unusedPercentage;

	public Loan(double commitment, double unusedPercentage) {
		this.commitment = commitment;
		this.unusedPercentage = unusedPercentage;
	}

	public double outstandingRiskAmount() {

		return 0;

	}

	public double unusedRiskAmount() {

		return 0;

	}

	public double getCommitment() {

		return commitment;

	}

	public void setCommitment(double commitment) {

		this.commitment = commitment;

	}

	public double getUnusedPercentage() {

		return unusedPercentage;

	}

	public void setUnusedPercentage(double unusedPercentage) {

		this.unusedPercentage = unusedPercentage;

	}

}
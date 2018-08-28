
public class main {
	
		public static void main(String[] args) {

			ContaBancaria contaC = new ContaCorrente("011.769.254-90");

			try {
				contaC.deposito(500.00);
			} catch (ValorInvalidoException e) {
				System.out.println(e);
			}

			System.out.println(contaC.consultarSaldo());

			ContaBancaria contaP = new ContaPoupanca("022.769.254.80");

			try {
				contaP.deposito(100.00);
			} catch (ValorInvalidoException e) {
				System.out.println(e);
			}

			System.out.println(contaP.consultarSaldo());
		}
}



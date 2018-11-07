package Exercicio14;

public class Main {

	public static void main(String[] args) {

		Pai pai = new Pai();
		Filho filho = new Filho();

		pai.setNome("João");
		pai.setIdade(50);
		
		filho.setPai(pai);
		filho.setNome("Carlos");
		filho.setIdade(20);
		filho.setEmail("carlos@teste.com");

		System.out.println(pai.mostraDados());
		System.out.println(filho.mostraDados());
	}
}
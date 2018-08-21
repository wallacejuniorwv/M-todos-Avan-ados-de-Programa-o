package Composicao;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa("Wallace", "Rua dalí");

		Agente agente = new Agente();
		agente.setPessoa(pessoa);
		agente.setIdAgente(10);

		if (agente != null && agente.getPessoa() != null) {
			System.out.println("Agente: " + agente.getPessoa().getNome() + 
					"Id do Agente: " + agente.getIdAgente());

		}
	
	
	}

}

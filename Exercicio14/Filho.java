package Exercicio14;

public class Filho implements IFamilia {

	private Pai pai;
	private String nome;
	private int idade;
	private String email;

	@Override
	public String dados() {
		return "Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Email: " + this.email;
	}

	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String mostraDados() {
		return dados();
	}

}

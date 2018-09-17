package PadraoProxy;

public class BancoProxy implements BancoUsuarios {

	protected String usuario, senha;
	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	public BancoProxy() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}

	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return new String("Total de usuários: " + quantidadeDeUsuarios);
		}
		return null;
	}

	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return new String("Usuários conectados: " + usuariosConectados);
		}
		return null;
	}

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}

}

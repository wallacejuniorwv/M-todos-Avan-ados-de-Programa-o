package Adapter;

public class ImagemAdapter implements ImagemTarget {

	private Imagem imagem;

	@Override
	public void carregarImagem(Imagem imagem) {
		imagem.carregar();

	}

	@Override
	public void desenharImagem(Imagem imagem) {
		imagem.desenhar();

	}

}
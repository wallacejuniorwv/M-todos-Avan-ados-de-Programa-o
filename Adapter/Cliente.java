package Adapter;

public class Cliente {

	public static void main(String[] args) {
		ImagemAdapter imagem = new ImagemAdapter();
		Imagem imagemPng = new ImagemPNG();
		Imagem imagemJpeg = new ImagemJPEG();
		imagem.desenharImagem(imagemPng);
		imagem.desenharImagem(imagemJpeg);
	}

}

package Adapter;

public class ImagemJPEG implements Imagem {

	@Override
	public void carregar() {
		System.out.println("JPEG");

	}

	@Override
	public void desenhar() {
		System.out.println("JPEG");

	}

}
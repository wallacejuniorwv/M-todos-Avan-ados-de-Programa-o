
public class ValorInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String MENSAGEM = "Valor invalido";
	
	public ValorInvalidoException() {
		super(MENSAGEM);
	}

}
package models;

public class Revenda {
	
	private String RazaoSocial;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((RazaoSocial == null) ? 0 : RazaoSocial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revenda other = (Revenda) obj;
		if (RazaoSocial == null) {
			if (other.RazaoSocial != null)
				return false;
		} else if (!RazaoSocial.equals(other.RazaoSocial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revenda [RazaoSocial=").append(RazaoSocial).append("]");
		return builder.toString();
	}
	
	

}

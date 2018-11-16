package models;

import java.util.Date;

public class Historico {
	private Date data;
	private String Valor;
	private Revenda revenda;
	
		
	public Historico() {
		super();
	}
	public Historico(Date data, String valor) {
		super();
		this.data = data;
		Valor = valor;
	}
	public Historico(Date data, String valor, Revenda revenda) {
		super();
		this.data = data;
		Valor = valor;
		this.revenda = revenda;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	public Revenda getRevenda() {
		return revenda;
	}
	public void setRevenda(Revenda revenda) {
		this.revenda = revenda;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Valor == null) ? 0 : Valor.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((revenda == null) ? 0 : revenda.hashCode());
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
		Historico other = (Historico) obj;
		if (Valor == null) {
			if (other.Valor != null)
				return false;
		} else if (!Valor.equals(other.Valor))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (revenda == null) {
			if (other.revenda != null)
				return false;
		} else if (!revenda.equals(other.revenda))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Historico [data=").append(data).append(", Valor=").append(Valor).append(", revenda=")
				.append(revenda).append("]");
		return builder.toString();
	}
	
	
	

}

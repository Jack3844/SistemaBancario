
public class Gerentes {
	private String nomeCompleto;
	private String telefone;
	private String endereco;
//Construtores
	public Gerentes(String nomeCompleto, String telefone) {
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
	}
	public Gerentes(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
//GETTERS
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}
//Setters
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Object equalsIgnoreCase(Gerentes gerente) {
		// TODO Auto-generated method stub
		return null;
	}
	

}


public class Cliente {
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefone;
	private String endreco;
	
	public Cliente(String nomeCompleto, String cpf, String telefone) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndreco() {
		return endreco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndreco(String endreco) {
		this.endreco = endreco;
	}
	@Override
	public String toString() {
		return String.format("Nome do cliente:%s\nCPF do cliente: %s\n\n",this.nomeCompleto,this.cpf);
	}
	

}

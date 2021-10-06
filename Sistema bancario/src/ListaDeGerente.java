import java.util.ArrayList;

public class ListaDeGerente {
	private ArrayList<Gerentes> lista = new ArrayList<Gerentes>();
	
	public void cadastrar(Gerentes gerente) {
		if(gerente != null) {
			lista.add(gerente);
		}
	}
	public void remover (Gerentes gerente) {
		lista.removeIf((elemento)->elemento.getNomeCompleto().equalsIgnoreCase(gerente.getNomeCompleto()));
	}
	public Gerentes buscar(Gerentes gerente) {
		for (Gerentes elemento:this.lista) {
			if(elemento.getNomeCompleto().equalsIgnoreCase(elemento.getNomeCompleto())) {
				return elemento;
			}
		}
		return null;
	}
	public void editar (Gerentes gerente) {
		int indice = lista.indexOf(this.buscar(gerente));
		lista.set(indice, gerente);
	}
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Gerentes gerente:this.lista) {
			builder.append("Nome:"+gerente.getNomeCompleto()+" - Telefone:"+gerente.getTelefone()+"\n");
		}
	return builder.toString();
	}
}

import java.util.ArrayList;

public class listaDeContas {
	private ArrayList<Conta>contas = new ArrayList<Conta>();
	
	public void cadastrar(Conta conta) {
		if(conta !=null) {
			contas.add(conta);
		}
	}
	public void remover (Conta conta) {
		contas.removeIf((elemento)->elemento.getNumeroConta() == (conta.getNumeroConta()));
	}
	public Conta buscar (Conta conta) {
		for (Conta elemento:this.contas) { 
				if(elemento.getNumeroConta()== conta.getNumeroConta()) {
					return elemento;
			}
		}
		return null;
	}
	public void editar(Conta conta) {
		int indice = contas.indexOf(this.buscar(conta));{
			contas.set(indice, conta);
		}
	}
		public String listar() {
			StringBuilder builder = new StringBuilder();
			for(Conta conta:this.contas) {
				builder.append(conta.toString());
			}
			return builder.toString();
		}
}

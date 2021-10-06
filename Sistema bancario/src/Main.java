import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	listaDeContas banco = new listaDeContas();

	Conta conta1 = new Conta (1,11);
	Conta conta2 = new Conta (2,16);
	
	banco.cadastrar(conta1);
	banco.cadastrar(conta2);

	System.out.println(banco.listar());
	}

}

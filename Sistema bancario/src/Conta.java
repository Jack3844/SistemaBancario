import java.util.ArrayList;

public class Conta {
	private int numeroConta;
	private int agencia;
	private int senha;
	private float saldo;
	

	public Conta(int numeroConta, float saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getSenha() {
		return senha;
	}
	public float getSaldo() {
		return saldo;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
		
	}
	@Override
	public String toString() {
		return String.format("N°conta:%d\nSaldo:%.2f\n\n",this.numeroConta,this.saldo);
	}
	

}

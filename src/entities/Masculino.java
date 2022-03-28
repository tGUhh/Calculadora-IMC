package entities;

public class Masculino extends  Pessoa{

	
	public Masculino(String nome, Integer idade, Double peso, Double altura, String telefone, String email) {
		super(nome, idade, peso, altura, telefone, email);
	}

	@Override
	public double calcIMC() {
		return peso / (altura * altura);
	}
	
}

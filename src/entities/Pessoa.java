package entities;

public class Pessoa {
	String nome;
	Integer idade;
	Double peso;
	Double altura;
	String telefone;
	String email;

	public Pessoa(String nome, Integer idade, Double peso, Double altura, String telefone, String email) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.telefone = telefone;
		this.email = email;
	}

	public Pessoa(String nome, Integer idade, Double peso, String telefone, String email) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.telefone = telefone;
		this.email = email;
	}

	public Pessoa(String nome, Integer idade, Double peso, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.telefone = telefone;
	}

	public Pessoa(String nome, Integer idade, Double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public Pessoa(Integer idade, Double peso) {
		this.idade = idade;
		this.peso = peso;
	}

	public Pessoa(Double peso, Double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double calcIMC() {
		return peso / (altura * altura);

	}

	public void tabelaIMC() {
		if (calcIMC() <= 16) {
			System.out.println("Resultado: Magreza GRAVE.");
		} else if (calcIMC() > 16 && calcIMC() <= 17.0) {
			System.out.println("Resultado: Magreza MODERADA.");
		} else if (calcIMC() > 17.1 && calcIMC() <= 18.5) {
			System.out.println("Resultado: Magreza LEVE.");
		} else if (calcIMC() > 18.5 && calcIMC() <= 25.0) {
			System.out.println("Resultado: SAUDÁVEL.");
		} else if (calcIMC() > 25.0 && calcIMC() <= 30.0) {
			System.out.println("Resultado: SOBRE PESO.");
		} else if (calcIMC() > 30.0 && calcIMC() <= 35.0) {
			System.out.println("Resultado: Obesidade GRAU I.");
		} else if (calcIMC() > 35.0 && calcIMC() <= 40.0) {
			System.out.println("Resultado: Obesidade GRAU II (Severa).");
		} else
			System.out.println("Resultado: Obesidade GRAU III (Mórbida");

	}

}

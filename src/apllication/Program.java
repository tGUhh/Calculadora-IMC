package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Feminino;
import entities.Masculino;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o Seu Sexo Biologico \n(M)Masculino  (F)Feminino  (N) Não se Aplica");
		char sexo = sc.next().charAt(0);

		if (sexo == 'M' || sexo == 'm' || sexo == 'H' || sexo == 'h') {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Telefone: ");
			String telefone = sc.nextLine();
			System.out.print("e-mail: ");
			String email = sc.nextLine();
			Pessoa novaPessoa = new Masculino(nome, idade, peso, altura, telefone, email);
			System.out.println(novaPessoa.getNome() + " IMC: " + novaPessoa.calcIMC());
		} else if (sexo == 'F' || sexo == 'f' || sexo == 'M' || sexo == 'm') {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Telefone: ");
			String telefone = sc.nextLine();
			System.out.print("e-mail: ");
			String email = sc.nextLine();
			Pessoa novaPessoa = new Feminino(nome, idade, peso, altura, telefone, email);
			System.out.println(novaPessoa.getNome() + " imc " + novaPessoa.calcIMC());
		} else if (sexo == 'N' || sexo == 'n' || sexo == 'X' || sexo == 'z') {
			sc.nextLine();
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			Pessoa novaPessoa = new Pessoa(peso, altura);
			System.out.println("IMC " + novaPessoa.calcIMC());
		}

	}

}

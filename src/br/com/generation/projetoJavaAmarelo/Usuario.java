package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Usuario {

	public void usuario() {

		String nome;
		int numeroTelefone;
		int idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe seu Nome completo: ");
		nome = leia.next();

		System.out.println("Informe o N�mero de Telefone: ");
		numeroTelefone = leia.nextInt();

		System.out.println("Informe a sua idade: ");
		idade = leia.nextInt();

		leia.close();
	}

}

package br.com.generation.projetoJavaAmarelo;

public class Inicio {

	public static void main(String[] args) {

		System.out.println("******************************** MENU **********************************");
		System.out.println("Ol�,seja bem vindo(a), estamos no setembro amarelo, e esse projeto tem o");
		System.out.println("objetivo de encurtar dist�ncias.");

		LoginDoProfissional login1 = new LoginDoProfissional(); // para se linkar uma classe na outra � igual o processo
																// que se faz com o Scanner
		login1.Login();

	}
}

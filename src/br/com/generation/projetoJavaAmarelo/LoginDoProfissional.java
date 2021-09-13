package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class LoginDoProfissional extends Dados {

	public void login() { // s� pode ter um main por projeto. � a parte principal dele

		Dados dados1 = new Dados();
		Scanner entrada = new Scanner(System.in);

		int tentativas = 1;
		String senhaInformada;
		String emailInformado;

		while (tentativas <= 3) {

			System.out.println("Insira seu e-mail:");
			emailInformado = entrada.next();
			dados1.setEmailInformado(emailInformado);

			System.out.println("Digite a senha:");
			senhaInformada = entrada.next();
			dados1.setSenhaInformada(senhaInformada);

			if (emailInformado.equals(dados1.getEmailInformado())
					&& senhaInformada.equals(dados1.getSenhaInformada())) {
				// Strings n�o s�o do tipo primitivo,
				// ent�o para compar�-las, se usa o
				// .equals()

				ImprimeLista lista = new ImprimeLista();
				lista.imprimindo();
				break;

			} else {
				System.out.println("E-mail ou senha incorretos, tente novamente.");
			}

		}

		entrada.close();
	}
}

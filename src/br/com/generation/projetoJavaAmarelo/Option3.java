package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Option3 {
	Scanner leia = new Scanner(System.in);
	int opcao;

	// menuPrevencao
	public void menuPrevencao() {

		System.out.println("Seja bem vindo ao sistema de preven��o ao s�icidio "
				+ "aqui voc� ter� algumas decis�es a serem tomadas!\n" + "\n//A preven��o\\"
				+ "\nAs raz�es podem ser bem diferentes, por�m muito mais gente do que se imagina j� pensou em suic�dio."
				+ " \nSegundo estudo realizado pela Unicamp, 17% dos brasileiros,"
				+ " em algum momento, pensaram seriamente em dar um fim � pr�pria " + "\nvida e,"
				+ " desses, 4,8% chegaram a elaborar um plano para isso. Em muitos casos,"
				+ " � poss�vel evitar que esses pensamentos" + "\nsuicidas se tornem realidade.");
		System.out.println("\n//CVV\\"
				+ "O CVV � uma das ONGs mais antigas do pa�s. Fundado em S�o Paulo em 1962, atua no apoio emocional e "
				+ "na preven��o do "
				+ "\nsuic�dio pelo telefone 188, " + "e tamb�m por chat, e-mail e pessoalmente.");
		System.out.println("\n[1] Encerrar o programa");
		System.out.println("[2] Menu Inicial");
		opcao = leia.nextInt();
		switch (opcao) {
		case 1:
			Encerramento encerramento = new Encerramento();
			encerramento.encerrar();
		case 2:
			Menu menu = new Menu();
			menu.menuInicio();
		}
		leia.close();
	}
}
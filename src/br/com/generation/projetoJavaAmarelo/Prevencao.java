package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

	public class Prevencao {
		Scanner leia = new Scanner(System.in);
		int opcoes;
		
		//menuPrevencao
		public void menuPrevencao() {
			
			System.out.println("Seja bem vindo ao sistema de preven��o ao s�icidio, "
					+ "aqui voc� ter� algumas decis�es a serem tomadas!" +
					"\n//A preven��o\\"
					+ "\nAs raz�es podem ser bem diferentes, por�m muito mais gente do que se imagina j� pensou em suic�dio."
					+ " Segundo estudo realizado pela Unicamp, 17% dos brasileiros,"
					+ " em algum momento, pensaram seriamente em dar um fim � pr�pria vida e,"
					+ " desses, 4,8% chegaram a elaborar um plano para isso. Em muitos casos,"
					+ " � poss�vel evitar que esses pensamentos suicidas se tornem realidade.");
			System.out.println("\n//CVV\\"
					+ "O CVV � uma das ONGs mais antigas do pa�s. Fundado em S�o Paulo em 1962, atua no apoio emocional e "
					+ "na preven��o do suic�dio pelo telefone 188, "
					+ "e tamb�m por chat, e-mail e pessoalmente.");
			System.out.println("Digite Para:"
					+ "\n[1]: Menu Inicial "
					+ "\n[2]: Encerrar o programa ");
			
			switch(opcoes) {
				case 1:
					Menu menu = new Menu();
					menu.menuInicio();
							
				case 2:						
					break;					
					default: 
						System.out.println("Op��o inv�lida!");
						menuPrevencao();
					
			}
			leia.close();
		}
	 }
package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class MenuPaciente implements Opcao {

	@Override
	public void menuPaciente() {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		System.out.println("\n*************************** MENU DO USU�RIO ****************************\n");
		
		System.out.println(
				"Escolha a op��o que mais se enquadra:" + "\n1.Procedimento de Agendamento de Consulta no SUS"
						+ "\n2.Cadastrar seus dados na base" + "\n3.Preven��o ao suic�dio");
		System.out.println("\nOp��o: ");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			Option1 option1 = new Option1();
			option1.ApresentaOp();
			break;

		case 2:
			TestandoOption02 option2 = new TestandoOption02();
			option2.apresentaOp2();
			break;

		case 3:
			Option3 prevencao = new Option3();
			prevencao.menuPrevencao();
			break;
		default:
			// chamar M�todo de limpar console
			System.out.println("Op��o v�lida!");
			menuPaciente();

		}
		entrada.close();
	}

	@Override
	public void menuInicio() {
		// TODO Auto-generated method stub

	}

}

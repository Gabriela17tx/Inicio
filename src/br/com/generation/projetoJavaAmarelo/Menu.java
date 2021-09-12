package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Menu implements Opcao {
	Scanner leia = new Scanner(System.in);	
	int opcao;
	
	
	@Override
	public void menuInicio() {
			
		
		System.out.println("\nEscolha a op��o que mais se enquadra:"
				+ "\n1.Paciente"
				+ "\n2.M�dico");
		System.out.println("\nOp��o: ");
		opcao = leia.nextInt();			
			
		switch(opcao) {
			case 1:
				menuPaciente();
				break;
			
			case 2:			
				LoginDoProfissional login = new LoginDoProfissional();
				login.login();
				break;
			
			default:				
				//chamar M�todo de limpar console
				System.out.println("Op��o v�lida!");	
				menuInicio();
		}	
		
		
		leia.close();		
	}
	
	@Override
	public void menuPaciente() {
		
		System.out.println("\nEscolha a op��o que mais se enquadra:"
				+ "\n1.Procedimento de Agendamento de Consulta no SUS"
				+ "\n2.Cadastrar seus dados na base"
				+ "\n3.Preven��o ao suic�dio");
		System.out.println("\nOp��o: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
			case 1: 
				//SUS
				break;
			
			case 2:
				//Cadastro
				break;
			
			case 3:
				//Preven��o
				break;
			default:
				//chamar M�todo de limpar console
				System.out.println("Op��o v�lida!");
				menuPaciente();
				
		}
		leia.close();		
	}

	
}

package br.com.generation.projetoJavaAmarelo;
import java.util.Scanner;

public class Option1{
	

	 

	public static void ApresentaOp() { //vamos tentar colocar esse m�todo num m�todo "pai" (de uma superclasse) pra sobrecarrega-lo dentro das Op1, 2 e 3;
	Scanner ler = new Scanner(System.in);
	int resp=1;
   
    while(resp==1) {
	System.out.println("1 - TER O CART�O DO SUS: ");
	System.out.println("Sempre que voc� usa os servi�os do sistema �nico de sa�de, precisar� apresentar seu cart�o/carteirinha");
	System.out.println("Ele � gratuito e simples de conseguir: basta ir at� uma unidade de sa�de com o seu RG ou outro documento de identifica��o com foto.");
	System.out.println("Ap�s preencher um cadastro, sua carteirinha estar� impressa e voc� j� poder� ser atendido.");
	System.out.println("\n2 - IR AT� UMA UBS (Unidade b�sica de sa�de) OU CAPS(Centro de aten��o psicosocial): ");
	System.out.println("-Na UBS ou no CAPS voc� ser� direcionado para o acolhimento, aonde um profissional far� uma triagem com diagn�stico inicial.");
	System.out.println("-Ap�s triagem voc� poder� ser encaminhado para um psic�logo que tratar� do seu caso. Apenas casos grav�ssimos v�o pra hospitaliza��o.");
	System.out.println("-Com a consulta marcada, voc� receber� um papel com a data marcada de sua consulta.");
	System.out.println("-Da� � s� aguardar o dia e comparecer no hor�rio correto da consulta.");
	System.out.println("\nDESEJA REPETIR A EXPLICA��O ? 1=SIM 2 = N�O");
	resp = ler.nextInt();
   if(resp==2) {
    	System.out.println("\nOBRIGADO!\nVOLTANDO AO INICIO...");
    	Inicio.main(null);
   }	
	
	
	
	}//fechamento do while
    ler.close();
	
	}//chave do ApresentaOp
	
	
	
	
	
	
	
	
	
}

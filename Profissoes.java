package br.com.vacinasmap;

public class Profissoes {

	
	String[] profissoes = {
			 "Trabalhador de sa�de, ind�genas e quilombolas",
			 "Trabalhador de sa�de, ind�genas e quilombolas",
			 "Profissionais de seguran�a p�blica  e administra��o penitenci�ria",
			 "Profissionais da educa��o","Metrovi�rios e ferrovi�rios",
			 "Motoristas e cobradores de �nibus", "Profissionais do transporte a�reo ",
			 "Profissionais do transporte portu�rio"
		};
		
		public void mostrarAreasPro() {
			System.out.println("\n \t\t\t\t[ AREA DE ATUA��O / PROFISS�ES ]\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			for(int i=0; i<profissoes.length; i++ ) {
				
				System.out.println(" ["+(i+1)+"] : "+ profissoes[i]);
			}
			
		}
		
}

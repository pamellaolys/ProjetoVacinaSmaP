package br.com.vacinasmap;

public class Comorbidades {
	
	
	String[] comorbidades = { 
			"Insufici�ncia card�aca", "Cor-pumonale e Hipertens�o pulmonar",
			"Miocardiopatias / Pericardiopatias", "S�ndrome coronarianas", "Valvopatias",
			"Doen�a de Aorta, dos Grandes Vasos e Fistulas arteriovenosas",
			"Cardiopatias cong�nitas no adulto / Cardiopatia hipertensiva",
			"Pr�teses valvares e Dispositivos card�acos implantados", "Diabetes mellitus",
			"Pneumopatias cr�nicas graves", "Hipertens�o art�ria est�gio 3",
			"Hipertens�o est�gios 1 e 2 com les�o e �rg�o alvo", "Doen�a Cerebrovascular", "Doen�a renal cr�nica",
			"Imunossuprimidos (inclui pacientes oncol�gicos)", "Anemia falciforme", "Obesidade m�rbida",
			"Cirrose Hep�tica", "HIV" 
			};
	public void mostrarComorbidades() {
		System.out.println("\n \t\t\t\t\t[ COMORBIDADES ]\n");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		for(int i=0; i<comorbidades.length; i++ ) {
			
			System.out.println(" ["+(i+1)+"] : "+ comorbidades[i]);
		}
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
	}
}

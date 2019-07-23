package fontesDeEnergia;

import javax.swing.JOptionPane;

public class Painel {

	public static void main(String[] args) {
        
		
			JOptionPane.showMessageDialog(null, "Bem vindo ao programa Fontes de Energias", "Boas Vindas",
					JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Esse aplicativo tem como objetivo explicar sobre Fontes de Energia n�o Renov�veis e Renov�veis. Mostrar tamb�m alguns\ntipos de fontes renov�veis e suas caracter�sticas, podendo at� cacular quanto seria em m�dia uma conta de energia el�trica.",
					"Boas Vindas", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Para ter acesso a essas informa��es voc� pode navegar atrav�s dos menus que v�o aparecendo de acordo com\nque vai interagindo. Ao encerrar cada fonte de energia, um arquivo de texto ser� gravado em seu computador.",
					"Boas Vindas", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "Espero que goste da experi�ncia!", "Boas Vindas",
					JOptionPane.PLAIN_MESSAGE);
			menuPrincipal();
		
	}
	
	public static void menuPrincipal() {
		String[] escolha = { "Defini��o", "E�lica", "Solar", "Hidreletrica", "Geot�rmica", "Sair" };
		int resp = JOptionPane.showOptionDialog(null, "Escolha um tipo de fonte de energia para come�ar",
				"Fontes de Energia", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null,
					"As fontes de energia n�o renov�veis s�o aquelas que s�o encontradas na natureza em quantia limitada. Os combust�veis\nfosseis s�o os principais exemplos, sendo eles: o petr�leo, o carv�o mineral, o g�s natural e o xisto betuminoso. Um dos\nproblemas mais graves em rela��o ao uso dessas fontes � produzem muitos gases que s�o respons�veis pelo efeito estufa.",
					"Energia n�o Renov�vel", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"S�o consideradas fontes de energia renov�veis as gera��es energ�ticas que utilizam recursos naturais inesgot�veis ou que possam ser repostos. S�o\n energias limpas pois os res�duos depositados s�o nulos ou quase nulos. Exemplos dessas fontes s�o: h�drica, biomassa, geot�rmica, e�lica, solar e das\n mar�s. Infelizmente s�o pouco utilizadas pelos pa�ses por possuir um alto investimento inicial e pouca produtividade em compara��o a outras existentes.",
					"Energia Renov�vel", JOptionPane.PLAIN_MESSAGE);
			menuPrincipal();
			break;
		case 1:
			Eolica e = new Eolica();
			e.energiaEolica();
			break;
		case 2:
			Solar s = new Solar();
			s.energiaSolar();
			break;
		case 3:
			Hidreletrica h = new Hidreletrica();
			h.energiaHidreletrica();
			break;
		case 4:
			Geotermica g = new Geotermica();
			g.energiaGeotermica();
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Obrigado por utilizar a plataforma. Espero que tenha gostado.",
					"Boas Vindas", JOptionPane.PLAIN_MESSAGE);
			break;
		}
	}

}
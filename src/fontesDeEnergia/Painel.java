package fontesDeEnergia;

import javax.swing.JOptionPane;

public class Painel {

	public static void main(String[] args) {
        
		
			JOptionPane.showMessageDialog(null, "Bem vindo ao programa Fontes de Energias", "Boas Vindas",
					JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Esse aplicativo tem como objetivo explicar sobre Fontes de Energia não Renováveis e Renováveis. Mostrar também alguns\ntipos de fontes renováveis e suas características, podendo até cacular quanto seria em média uma conta de energia elétrica.",
					"Boas Vindas", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"Para ter acesso a essas informações você pode navegar através dos menus que vão aparecendo de acordo com\nque vai interagindo. Ao encerrar cada fonte de energia, um arquivo de texto será gravado em seu computador.",
					"Boas Vindas", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "Espero que goste da experiência!", "Boas Vindas",
					JOptionPane.PLAIN_MESSAGE);
			menuPrincipal();
		
	}
	
	public static void menuPrincipal() {
		String[] escolha = { "Definição", "Eólica", "Solar", "Hidreletrica", "Geotérmica", "Sair" };
		int resp = JOptionPane.showOptionDialog(null, "Escolha um tipo de fonte de energia para começar",
				"Fontes de Energia", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null,
					"As fontes de energia não renováveis são aquelas que são encontradas na natureza em quantia limitada. Os combustíveis\nfosseis são os principais exemplos, sendo eles: o petróleo, o carvão mineral, o gás natural e o xisto betuminoso. Um dos\nproblemas mais graves em relação ao uso dessas fontes é produzem muitos gases que são responsáveis pelo efeito estufa.",
					"Energia não Renovável", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null,
					"São consideradas fontes de energia renováveis as gerações energéticas que utilizam recursos naturais inesgotáveis ou que possam ser repostos. São\n energias limpas pois os resíduos depositados são nulos ou quase nulos. Exemplos dessas fontes são: hídrica, biomassa, geotérmica, eólica, solar e das\n marés. Infelizmente são pouco utilizadas pelos países por possuir um alto investimento inicial e pouca produtividade em comparação a outras existentes.",
					"Energia Renovável", JOptionPane.PLAIN_MESSAGE);
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
package fontesDeEnergia;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Eolica extends Energia {
	public void energiaEolica() {
		DecimalFormat deci = new DecimalFormat("0.00");

		setNome("Energia Eólica");
		setDescricao(
				"O vento consiste num fluxo de gases em grande escala, proporcionando variações significativas ao longo do ano. Este movimento do ar em decorrência do\naquecimento irregular da atmosfera pela radiação solar pode ser transformado em energia útil. Este processo é conhecido como energia eólica e é usado\npara produzir energia mecânica através de moinhos de vento, produzir eletricidade ou impulsionar os veleiros através de velas. A energia eólica é renovável,\nlimpa e é uma alternativa aos combustíveis fósseis, estando permanentemente disponível em qualquer região no Mundo.");
		setVantagens(
				"As vantagens de se usar essa energia é a redução da emissão de dioxido de carbono na atmosfera, a fonte é inesgotável, tem\numa ótima rentablidade de investimento, em cerca de 6 meses se recupera a energia gasta com a instalação e manutenção.");
		setDesvantagens(
				"Apesar de ter boas vantagens, a utilização dessa fonte de energia é a poluição visual, visto que parque eolicos sao instalados em areas livres para aproveitar\nda melhor forma os ventos, tambem a poluição sonora proveniente do funcionamento dos equipamentos pode ser pertubador para a população local, também\ncausa impactos sobre a fauna, nomeadamente a colisão de morcegos e aves e vaiações significativas da velocidade do vento ao longo do ano, ou seja, nem\nsempre o vento sopra quando a eletricidade é ecessaria em determinado local.");
		setPrecoKWH(0.059F);

		String[] escolha = { "Definição", "Vantagens", "Desvantagens", "Conta", "Voltar" };
		int resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Energia Eólica",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null, getDescricao(), "Energia Eólica", JOptionPane.PLAIN_MESSAGE);
			energiaEolica();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, getVantagens(), "Vantagens da Energia Eólica",
					JOptionPane.PLAIN_MESSAGE);
			energiaEolica();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, getDesvantagens(), "Desvantagens Energia Eólica",
					JOptionPane.PLAIN_MESSAGE);
			energiaEolica();
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Agora você poderá calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia Eólica", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Preço médio do kwh: R$ " + deci.format(getPrecoKWH()) +
					"\nValor da conta: R$ " + deci.format(getTotalConta()), "Energia Eólica",
					JOptionPane.PLAIN_MESSAGE);
			energiaEolica();
			break;
		case 4:
			gravarDados(getNome(), getDescricao(), getVantagens(), getDesvantagens(), getTotalConta());
			Painel.menuPrincipal();
			break;
		}
	}
}

class Solar extends Energia {

	public void energiaSolar() {
		DecimalFormat deci = new DecimalFormat("0.00");

		setNome("Energia Solar");
		setDescricao(
				"Energia solar corresponde à energia proveniente da luz e do calor emitidos pelo Sol. Essa fonte de energia pode ser aproveitada\nde forma fotovoltaica ou térmica gerando energia elétrica e térmica, respectivamente. Por ser considerada uma fonte de energia\nlimpa, a energia solar é uma das fontes alternativas mais promissoras para obtenção energética.");
		setVantagens(
				"As vantagens de se usar essa energia é que ela é fonte renovável e inesgotável de energia não poluente, que exige pouca\nmanutenção em suas centrais de produção e os paineis solares estao com suto cada vez mais baixos.");
		setDesvantagens(
				"Apesar de estarem sendo utilizadas cada vez mais, se comparada aos combustíveis fosseis, ela possui baixa eficiência, portanto,pouco rentável para o mercado\nmesmo necessitando de pouco espaço para a produção. Fonte de energia viável para lugares afastados e de difícil acesso, visto que não necessita de grandes\ninvestimentos a manutenção de equipamentos. Excelente fonte de energia para países tropicais, como o Brasil, cuja radiação solar costuma ser intensa durante\nboa parte do ano e requer áreas menos extensas para ser produzida.");
		setPrecoKWH(0.063F);
		String[] escolha = { "Definição", "Vantagens", "Desvantagens", "Conta", "Voltar" };
		int resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Energia Solar",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null, getDescricao(), "Energia Solar", JOptionPane.PLAIN_MESSAGE);
			energiaSolar();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, getVantagens(), "Vantagens da Energia Solar",
					JOptionPane.PLAIN_MESSAGE);
			energiaSolar();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, getDesvantagens(), "Desvantagens Energia Solar",
					JOptionPane.PLAIN_MESSAGE);
			energiaSolar();
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Agora você poderá calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia Solar", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Preço médio do kwh: R$ " + deci.format(getPrecoKWH()) +
					"\nValor da conta: R$ " + deci.format(getTotalConta()), "Energia Solar", JOptionPane.PLAIN_MESSAGE);
			energiaSolar();
			break;
		case 4:
			gravarDados(getNome(), getDescricao(), getVantagens(), getDesvantagens(), getTotalConta());
			Painel.menuPrincipal();
			break;
		}
	}
}

class Hidreletrica extends Energia {
	DecimalFormat deci = new DecimalFormat("0.00");

	public void energiaHidreletrica() {

		setNome("Energia Hidrelétrica");
		setDescricao(
				"A energia hidrelétrica é fruto da energia cinética que promove a rotação das pás das turbinas que compõem o sistema de uma usina hidrelétrica.");
		setVantagens(
				"As vantagens de se usar essa energia é que ela é fonte renovável e inesgotável de energia não poluente, que exige um conjunto de obras e equipamentos,\naproveitando a vazão hidráulica e pela concentração dos desníveis ao longo rio, chamado potencial elétrico.");
		setDesvantagens(
				"Um impacto negativo da implantação de grandes empreendimentos hidrelétricos é a mudança no modo de vida das populações que residem na região, onde será alocada a usina.  Mesmo\nsendo considerada por muitos como uma fonte de energia limpa por não estar associada à queima de combustíveis fosseis, a produção de energia hidrelétrica contribui para a emissão de\ndióxido de carbono e metano, dois gases que são potenciais causadores do aquecimento global.");
		setPrecoKWH(0.062F);

		String[] escolha = { "Definição", "Vantagens", "Desvantagens", "Conta", "Voltar" };
		int resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Energia Hidrelétrica",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null, getDescricao(), "Energia Hidrelétrica", JOptionPane.PLAIN_MESSAGE);
			energiaHidreletrica();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, getVantagens(), "Vantagens da Energia Hidrelétrica",
					JOptionPane.PLAIN_MESSAGE);
			energiaHidreletrica();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, getDesvantagens(), "Desvantagens Energia Hidrelétrica",
					JOptionPane.PLAIN_MESSAGE);
			energiaHidreletrica();
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Agora você poderá calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia Hidrelétrica", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Preço médio do kwh: R$ " + deci.format(getPrecoKWH()) +
					"\nValor da conta: R$ " + deci.format(getTotalConta()), "Energia Hidrelétrica",
					JOptionPane.PLAIN_MESSAGE);
			energiaHidreletrica();
			break;
		case 4:
			gravarDados(getNome(), getDescricao(), getVantagens(), getDesvantagens(), getTotalConta());
			Painel.menuPrincipal();
			break;
		}
	}
}

class Geotermica extends Energia {

	public void energiaGeotermica() {
		DecimalFormat deci = new DecimalFormat("0.00");

		setNome("Energia Geotermica");
		setDescricao(
				"A energia geotérmica ou geotermal, é a energia que provem do calor gerado do interior do nosso planeta, sendo considerado uma das mais limpas energias que existem.\nLocais que se tem intrusões magmáticas, são zonas que possuem um elevado potencial geotérmico por conta de suas temperaturas elevadas no solo. ");
		setVantagens(
				"As vantagens de se usar essa energia é que os gases produzidos nesses processos já acabariam indo para a atmosfera de forma natural, ou seja, seu uso não acrescenta\nem mais nenhum prejuízo para o meio ambiente. Porém, o processo de perfuração do solo tem que ser feito com cuidado, já que a água possui minérios e gases, como o\nácido sulfúrico, que são prejudicais a saúde, com isso, o descarte não pode ser feito em rios e mares de forma direta.");
		setDesvantagens(
				"Apesar de estarem sendo utilizadas cada vez mais, se comparada aos combustíveis fosseis, ela possui baixa eficiência,\nportanto,pouco rentável para o mercado, mesmo necessitando de pouco espaço para a produção.");
		setPrecoKWH(0.045F);

		String[] escolha = { "Definição", "Vantagens", "Desvantagens", "Conta", "Voltar" };
		int resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Energia Geotérmica",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null, getDescricao(), "Energia Geotérmica", JOptionPane.PLAIN_MESSAGE);
			energiaGeotermica();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, getVantagens(), "Vantagens da Energia Geotérmica",
					JOptionPane.PLAIN_MESSAGE);
			energiaGeotermica();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, getDesvantagens(), "Desvantagens Energia Geotérmica",
					JOptionPane.PLAIN_MESSAGE);
			energiaGeotermica();
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Agora você poderá calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia Geotérmica", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Preço médio do kwh: R$ " + deci.format(getPrecoKWH()) +
					"\nValor da conta: R$ " + deci.format(getTotalConta()), "Energia Geotérmica",
					JOptionPane.PLAIN_MESSAGE);
			energiaGeotermica();
			break;
		case 4:
			gravarDados(getNome(), getDescricao(), getVantagens(), getDesvantagens(), getTotalConta());
			Painel.menuPrincipal();
			break;
		}
	}
}

package fontesDeEnergia;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Eolica extends Energia {
	public void energiaEolica() {
		DecimalFormat deci = new DecimalFormat("0.00");

		setNome("Energia E�lica");
		setDescricao(
				"O vento consiste num fluxo de gases em grande escala, proporcionando varia��es significativas ao longo do ano. Este movimento do ar em decorr�ncia do\naquecimento irregular da atmosfera pela radia��o solar pode ser transformado em energia �til. Este processo � conhecido como energia e�lica e � usado\npara produzir energia mec�nica atrav�s de moinhos de vento, produzir eletricidade ou impulsionar os veleiros atrav�s de velas.�A energia e�lica � renov�vel,\nlimpa e � uma alternativa aos combust�veis f�sseis, estando permanentemente dispon�vel em qualquer regi�o no Mundo.");
		setVantagens(
				"As vantagens de se usar essa energia � a redu��o da emiss�o de dioxido de carbono na atmosfera, a fonte � inesgot�vel, tem\numa �tima rentablidade de investimento, em cerca de 6 meses se recupera a energia gasta com a instala��o e manuten��o.");
		setDesvantagens(
				"Apesar de ter boas vantagens, a utiliza��o dessa fonte de energia � a polui��o visual, visto que parque eolicos sao instalados em areas livres para aproveitar\nda melhor forma os ventos, tambem a polui��o sonora proveniente do funcionamento dos equipamentos pode ser pertubador para a popula��o local, tamb�m\ncausa impactos sobre a fauna, nomeadamente a colis�o de morcegos e aves e vaia��es significativas da velocidade do vento ao longo do ano, ou seja, nem\nsempre o vento sopra quando a eletricidade � ecessaria em determinado local.");
		setPrecoKWH(0.059F);

		String[] escolha = { "Defini��o", "Vantagens", "Desvantagens", "Conta", "Voltar" };
		int resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Energia E�lica",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null, getDescricao(), "Energia E�lica", JOptionPane.PLAIN_MESSAGE);
			energiaEolica();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, getVantagens(), "Vantagens da Energia E�lica",
					JOptionPane.PLAIN_MESSAGE);
			energiaEolica();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, getDesvantagens(), "Desvantagens Energia E�lica",
					JOptionPane.PLAIN_MESSAGE);
			energiaEolica();
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Agora voc� poder� calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia E�lica", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Pre�o m�dio do kwh: R$ " + deci.format(getPrecoKWH()) +
					"\nValor da conta: R$ " + deci.format(getTotalConta()), "Energia E�lica",
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
				"Energia solar corresponde � energia proveniente da luz e do calor emitidos pelo Sol. Essa fonte de energia pode ser aproveitada\nde forma fotovoltaica ou t�rmica gerando energia el�trica e t�rmica, respectivamente. Por ser considerada uma fonte de energia\nlimpa, a energia solar � uma das fontes alternativas mais promissoras para obten��o energ�tica.");
		setVantagens(
				"As vantagens de se usar essa energia � que ela � fonte renov�vel e inesgot�vel de energia n�o poluente, que exige pouca\nmanuten��o em suas centrais de produ��o e os paineis solares estao com suto cada vez mais baixos.");
		setDesvantagens(
				"Apesar de estarem sendo utilizadas cada vez mais, se comparada aos combust�veis fosseis, ela possui baixa efici�ncia, portanto,pouco rent�vel para o mercado\nmesmo necessitando de pouco espa�o para a produ��o. Fonte de energia vi�vel para lugares afastados e de dif�cil acesso, visto que n�o necessita de grandes\ninvestimentos a manuten��o de equipamentos. Excelente fonte de energia para pa�ses tropicais, como o Brasil, cuja radia��o solar costuma ser intensa durante\nboa parte do ano e requer �reas menos extensas para ser produzida.");
		setPrecoKWH(0.063F);
		String[] escolha = { "Defini��o", "Vantagens", "Desvantagens", "Conta", "Voltar" };
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
					"Agora voc� poder� calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia Solar", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Pre�o m�dio do kwh: R$ " + deci.format(getPrecoKWH()) +
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

		setNome("Energia Hidrel�trica");
		setDescricao(
				"A energia hidrel�trica � fruto da energia cin�tica que promove a rota��o das p�s das turbinas que comp�em o sistema de uma usina hidrel�trica.");
		setVantagens(
				"As vantagens de se usar essa energia � que ela � fonte renov�vel e inesgot�vel de energia n�o poluente, que exige um conjunto de obras e equipamentos,\naproveitando a vaz�o hidr�ulica e pela concentra��o dos desn�veis ao longo rio, chamado potencial el�trico.");
		setDesvantagens(
				"Um impacto negativo da implanta��o de grandes empreendimentos hidrel�tricos � a mudan�a no modo de vida das popula��es que residem na regi�o, onde ser� alocada a usina.  Mesmo\nsendo considerada por muitos como uma fonte de energia limpa por n�o estar associada � queima de combust�veis fosseis, a produ��o de energia hidrel�trica contribui para a emiss�o de\ndi�xido de carbono e metano, dois gases que s�o potenciais causadores do aquecimento global.");
		setPrecoKWH(0.062F);

		String[] escolha = { "Defini��o", "Vantagens", "Desvantagens", "Conta", "Voltar" };
		int resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Energia Hidrel�trica",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null, getDescricao(), "Energia Hidrel�trica", JOptionPane.PLAIN_MESSAGE);
			energiaHidreletrica();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, getVantagens(), "Vantagens da Energia Hidrel�trica",
					JOptionPane.PLAIN_MESSAGE);
			energiaHidreletrica();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, getDesvantagens(), "Desvantagens Energia Hidrel�trica",
					JOptionPane.PLAIN_MESSAGE);
			energiaHidreletrica();
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Agora voc� poder� calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia Hidrel�trica", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Pre�o m�dio do kwh: R$ " + deci.format(getPrecoKWH()) +
					"\nValor da conta: R$ " + deci.format(getTotalConta()), "Energia Hidrel�trica",
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
				"A energia geot�rmica ou geotermal, � a energia que provem do calor gerado do interior do nosso planeta, sendo considerado uma das mais limpas energias que existem.\nLocais que se tem intrus�es magm�ticas, s�o zonas que possuem um elevado potencial geot�rmico por conta de suas temperaturas elevadas no solo. ");
		setVantagens(
				"As vantagens de se usar essa energia � que os gases produzidos nesses processos j� acabariam indo para a atmosfera de forma natural, ou seja, seu uso n�o acrescenta\nem mais nenhum preju�zo para o meio ambiente. Por�m, o processo de perfura��o do solo tem que ser feito com cuidado, j� que a �gua possui min�rios e gases, como o\n�cido sulf�rico, que s�o prejudicais a sa�de, com isso, o descarte n�o pode ser feito em rios e mares de forma direta.");
		setDesvantagens(
				"Apesar de estarem sendo utilizadas cada vez mais, se comparada aos combust�veis fosseis, ela possui baixa efici�ncia,\nportanto,pouco rent�vel para o mercado, mesmo necessitando de pouco espa�o para a produ��o.");
		setPrecoKWH(0.045F);

		String[] escolha = { "Defini��o", "Vantagens", "Desvantagens", "Conta", "Voltar" };
		int resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Energia Geot�rmica",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

		switch (resp) {
		case 0:
			JOptionPane.showMessageDialog(null, getDescricao(), "Energia Geot�rmica", JOptionPane.PLAIN_MESSAGE);
			energiaGeotermica();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, getVantagens(), "Vantagens da Energia Geot�rmica",
					JOptionPane.PLAIN_MESSAGE);
			energiaGeotermica();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, getDesvantagens(), "Desvantagens Energia Geot�rmica",
					JOptionPane.PLAIN_MESSAGE);
			energiaGeotermica();
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Agora voc� poder� calcular quanto custaria em media uma conta de eletecidade se essa fonte utilizada",
					"Energia Geot�rmica", JOptionPane.PLAIN_MESSAGE);
			float kwh = (Float.parseFloat(JOptionPane.showInputDialog(
					"Insira a quantidade de kwh que consumiu para calcular a conta")));
			calcularConta(kwh, getPrecoKWH());
			JOptionPane.showMessageDialog(null, "Pre�o m�dio do kwh: R$ " + deci.format(getPrecoKWH()) +
					"\nValor da conta: R$ " + deci.format(getTotalConta()), "Energia Geot�rmica",
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

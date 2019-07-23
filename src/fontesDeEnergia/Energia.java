package fontesDeEnergia;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Energia {

	private float precoKWH;
	private String descricao;
	private String vantagens;
	private String desvantagens;
	private String nome;
	private float totalConta;

	public float getPrecoKWH() {
		return precoKWH;
	}

	public void setPrecoKWH(float precoKWH) {
		this.precoKWH = precoKWH;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getVantagens() {
		return vantagens;
	}

	public void setVantagens(String vantagens) {
		this.vantagens = vantagens;
	}

	public String getDesvantagens() {
		return desvantagens;
	}

	public void setDesvantagens(String desvantagens) {
		this.desvantagens = desvantagens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getTotalConta() {
		return totalConta;
	}

	public void setTotalConta(float totalConta) {
		this.totalConta = totalConta;
	}

	
	public void calcularConta(float kwh, float precoKWH) {	
		float conta = precoKWH * kwh;
		totalConta = conta;
		
	}
	
	public static void gravarDados(String nome, String descricao, String vantagens, String desvantagens, float conta){
		try{
			DecimalFormat deci = new DecimalFormat("0.00");
			RandomAccessFile raf = new RandomAccessFile("C:\\Users\\crezende\\eclipse-workspace\\APS\\"+nome+".txt", "rw");
			
				raf.writeBytes("Nome: "+ nome);
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes("Descrição: "+ descricao);
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes("Vantagens: "+ vantagens);
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes("Desvantagens: "+ desvantagens);
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes("Total da conta: R$ " + deci.format(conta));
				raf.writeBytes(System.getProperty("line.separator"));
				raf.writeBytes(System.getProperty("line.separator"));
			
				raf.close();
				
				JOptionPane.showMessageDialog(null, "Todos os dados foram gravados no arquivo no caminho C:\\Users\\crezende\\eclipse-workspace\\APS\\"+nome+".txt", nome, JOptionPane.PLAIN_MESSAGE);
		}
		catch(IOException  IOE){
			System.out.println(IOE.getMessage());
		}
	}
}



package exercicios;

import javax.swing.JOptionPane;

public class eleitoresMunicipio {

	public static void main(String[] args) {
		/*
		 * 8) Ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e
		 * v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total de
		 * eleitores.
		 * 
		 */
		int totalEleitores = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de eleitores:"));
		int votosBrancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos brancos:"));
		int votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos nulos:"));
		int votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos V�lidos:"));
		
		double percVotosBrancos = (votosBrancos * 100) / totalEleitores;
		double percVotosNulos = (votosNulos * 100) / totalEleitores;
		double percVotosValidos = (votosValidos * 100) / totalEleitores;
		
		JOptionPane.showMessageDialog(null, "Brancos: " + percVotosBrancos + "%");
		JOptionPane.showMessageDialog(null, "Nulos: " + percVotosNulos + "%");
		JOptionPane.showMessageDialog(null, "Validos: " + percVotosValidos + "%");
		
	}

}

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
		int votosnulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos nulos:"));
		int votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos V�lidos:"));
		
		/*
        JOptionPane.showMessageDialog(null, "Real: R$" + resultado);*/
	}

}

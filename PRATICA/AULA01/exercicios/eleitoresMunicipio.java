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
		System.out.println("Eleitores: " + totalEleitores);
		int votosBrancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos brancos:"));
		System.out.println("Brancos: " + votosBrancos);	
		int votosnulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos nulos:"));
		System.out.println("Nulos: " + votosnulos);
		int votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos V�lidos:"));
		System.out.println("V�lidos: " + votosValidos);
		
		double percentualBrancos = (votosBrancos * 100) / totalEleitores;
		double percentualNulos = (votosnulos * 100) / totalEleitores;
		double percentualValidos = (votosValidos * 100) / totalEleitores;

		System.out.println("Porcentagem: ");
		JOptionPane.showMessageDialog(null, "Votos em branco: " +  percentualBrancos + "%");
		System.out.println("Brancos: " + percentualBrancos + "%");
		JOptionPane.showMessageDialog(null, "Votos nulos: " +  percentualNulos + "%");
		System.out.println("Nulos: " + percentualNulos + "%");
	    JOptionPane.showMessageDialog(null, "Votos v�lidos: " +  percentualValidos + "%");
	    System.out.println("V�lidos: " + percentualValidos + "%");

	}

}
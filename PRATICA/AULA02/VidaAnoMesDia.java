import javax.swing.JOptionPane;

public class VidaAnoMesDia {

	public static void main(String[] args) {
		/*
		 * 7) Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa 
		 * expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
		 */
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ANO de seu nascimento:"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o MÊS do seu nascimento:"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o DIA do seu nascimento:"));
		
		int dias = dia + (ano * 365) + (mes * 30);
		JOptionPane.showMessageDialog(null, "Idade expressa em dias: " +  dias);
		
	}

}

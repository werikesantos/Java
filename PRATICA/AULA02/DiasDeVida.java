import javax.swing.JOptionPane;

public class DiasDeVida {

	public static void main(String[] args) {
		/*
		 * 6) Ler a idade de uma pessoa expressa em anos e exibir expressa em dias 
		 * (considere que um ano tem 365 dias.
		 * 
		 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento:"));
		int idade = (2021 - ano);
		int dias = (idade * 365);
		JOptionPane.showMessageDialog(null, "Dias de vida: " +  dias);
		
	}

}

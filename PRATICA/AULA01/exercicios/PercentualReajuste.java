package exercicios;

import javax.swing.JOptionPane;

public class PercentualReajuste {

	public static void main(String[] args) {
		/*
		 * 9) Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir o valor do novo salário.
		 * 
		 */
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));
		double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do reajuste:"));

		double percentualReajuste = (reajuste / 100) * salario;

		JOptionPane.showMessageDialog(null, "Aumento salarial de " + reajuste + "%\nTotal: R$" + (percentualReajuste + salario));
		
	}

}

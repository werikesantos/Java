package exercicios;

import javax.swing.JOptionPane;

public class PercentualReajuste {

	public static void main(String[] args) {
		/*
		 * 9) Ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. Calcular e exibir o valor do novo sal�rio.
		 * 
		 */
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sal�rio:"));
		double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do reajuste:"));
<<<<<<< HEAD

		double percentualReajuste = (reajuste / 100) * salario;

		JOptionPane.showMessageDialog(null, "Aumento salarial de " + reajuste + "%\nTotal: R$" + (percentualReajuste + salario));


=======
		
		double percentualReajuste = (reajuste / 100) * salario;
		
		JOptionPane.showMessageDialog(null, "Aumento salarial de " + reajuste + "%\nTotal: R$" + (percentualReajuste + salario));
		
>>>>>>> 886525c5558fecc77e54394ce7f7522a40c3b69a
	}

}

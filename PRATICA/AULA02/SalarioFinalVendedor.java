import javax.swing.JOptionPane;

public class SalarioFinalVendedor {

	public static void main(String[] args) {
		/*
		 * 11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
		 * por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor
		 * das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o valor total de
		 * suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir o
		 * salário final do vendedor.
		 * 
		 */
		int carros = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de carros vendidos:"));
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de suas vendas:"));
		double salariofixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario fixo:"));
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por carro vendido:"));

		double salario = salariofixo + (comissao * carros) + (vendas * 0.05);

		JOptionPane.showMessageDialog(null, "O custo ao consumidor de um carro novo é: R$" + salario);

	}

}

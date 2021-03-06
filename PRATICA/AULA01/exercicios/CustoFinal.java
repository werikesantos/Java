package exercicios;

import javax.swing.JOptionPane;

public class CustoFinal {

	public static void main(String[] args) {
		/*
		 * 10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
		 * do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
		 * do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro,
		 * calcular e escrever o custo final ao consumidor.
		 * 
		 */

	     double porcentagemDistribuidor = 28.0;
	     double PercentualImpostos = 45.0;
<<<<<<< HEAD

	     double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica de um carro novo:"));

	     double Destribuidor = (custoFabrica * porcentagemDistribuidor) / 100.000;
	     double ValorImpostos = (custoFabrica * PercentualImpostos) / 100;

	     double custoConsumidor = (Destribuidor + ValorImpostos);

=======
	 
	     double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica de um carro novo:"));
	 
	     double Destribuidor = (custoFabrica * porcentagemDistribuidor) / 100.000;
	     double ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
	 
	     double custoConsumidor = (Destribuidor + ValorImpostos);
	 
>>>>>>> 886525c5558fecc77e54394ce7f7522a40c3b69a
	     JOptionPane.showMessageDialog(null, "O custo ao consumidor de um carro novo é: R$" + custoConsumidor);

	}

}

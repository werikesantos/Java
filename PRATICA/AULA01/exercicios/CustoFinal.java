import javax.swing.JOptionPane;

public class CustoFinal {

	public static void main(String[] args) {
		/*
		 * 10) O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem
		 * do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual
		 * do distribuidor seja de 28% e os impostos de 45%, ler o custo de f�brica de um carro,
		 * calcular e escrever o custo final ao consumidor.
		 * 
		 */

	     double porcentagemDistribuidor = 28.0;
	     double PercentualImpostos = 45.0;

	     double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de f�brica de um carro novo:"));

	     double Destribuidor = (custoFabrica * porcentagemDistribuidor) / 100.000;
	     double ValorImpostos = (custoFabrica * PercentualImpostos) / 100;

	     double custoConsumidor = (Destribuidor + ValorImpostos);

	     JOptionPane.showMessageDialog(null, "O custo ao consumidor de um carro novo �: R$" + custoConsumidor);

	}

}

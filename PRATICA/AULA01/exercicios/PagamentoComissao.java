import javax.swing.JOptionPane;

public class PagamentoComissao {

	public static void main(String[] args) {
		/* 
         * 3) Calcular o pagamento de comiss�o de vendedores de pe�as, levando-se em considera��o que sua comiss�o
         * ser� de 5% do total da venda e que voc� tem os seguintes dados: pre�o unit�rio da pe�a e quantidade vendida. 
         * 
         */
        JOptionPane.showMessageDialog(null, "Cal�a custa R$300,00");
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas cal�as deseja comprar:"));

        double total = (300 * quantidade); 

        double comissao = (5.00 / 100.00) * total;

        JOptionPane.showMessageDialog(null, "Total de comiss�o: " +  comissao);

	}

}

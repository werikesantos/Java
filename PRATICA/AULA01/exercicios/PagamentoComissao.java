import javax.swing.JOptionPane;

public class PagamentoComissao {

	public static void main(String[] args) {
	/* 
         * 3) Calcular o pagamento de comissão de vendedores de peçaas, levando-se em consideração que sua comissão
         * será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e quantidade vendida. 
         * 
         */
        JOptionPane.showMessageDialog(null, "Calça custa R$300,00");
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas calças deseja comprar:"));

        double total = (300 * quantidade); 

        double comissao = (5.00 / 100.00) * total;

        JOptionPane.showMessageDialog(null, "Total de comissão: " +  comissao);

	}

}

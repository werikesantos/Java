import javax.swing.JOptionPane;

public class CotacaoDollar {

	public static void main(String[] args) {
        /* 
         * 1) Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado.
         * 
         */
        double dollar = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dólares:"));
        double resultado = (dollar * 5.68);
        JOptionPane.showMessageDialog(null, "Real: R$" + resultado);

	}

}

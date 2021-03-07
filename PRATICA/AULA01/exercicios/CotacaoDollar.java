import javax.swing.JOptionPane;

public class CotacaoDollar {

	public static void main(String[] args) {

		/* 
         * 1) Ler a cota��o do d�lar e a quantidade de d�lares. Converter para real e mostrar o resultado.
         * 
         */
        double dollar = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de d�lares:"));
        double resultado = (dollar * 5.68);
        JOptionPane.showMessageDialog(null, "Real: R$" + resultado);

	}

}

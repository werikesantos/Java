import javax.swing.JOptionPane;

public class SomaQuadrados {

	public static void main(String[] args) {
	/* 
         * 2) Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado.
         * 
         */
        int primeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro número:"));
        int segundo = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo número:"));
        int terceiro = Integer.parseInt(JOptionPane.showInputDialog("Digite terceiro número:"));
        int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite quarto número:"));

        int quadrado1 = primeiro * 2; 
        int quadrado2 = segundo * 2; 
        int quadrado3 = terceiro * 2; 
        int quadrado4 = quarto * 2; 

        int resultado = quadrado1 + quadrado2 + quadrado3 + quadrado4;

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

	}

}

import javax.swing.JOptionPane;

public class AreaRetangulo {

	public static void main(String[] args) {
	/* 
         * 5) Ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.
         * 
         */
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a base do ret�ngulo:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do ret�ngulo:"));

        int area = base * altura; 

        JOptionPane.showMessageDialog(null, "�rea do ret�ngulo: " +  area);

	}

}

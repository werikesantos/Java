package exercicios;

import javax.swing.JOptionPane;

public class AreaRetangulo {

	public static void main(String[] args) {
	/* 
         * 5) Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
         * 
         */
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a base do retângulo:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do retângulo:"));

        int area = base * altura; 

        JOptionPane.showMessageDialog(null, "Area do retângulo: " +  area);

	}

}

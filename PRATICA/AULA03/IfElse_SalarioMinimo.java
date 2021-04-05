import javax.swing.JOptionPane;

public class IfElse_SalarioMinimo {
    public static void main(String[] args) {
        /* 
         * 1) Escreva um programa que obtém o salário de uma pessoa e diz se ela 
         * está ganhando pelo menos o salário mínimo.
         * 
         */

        JOptionPane.showMessageDialog(null, "Salário mínimo 2021 é igual a R$ 1.087,85!");

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));
    
        if (salario >= 1087.85) {
            JOptionPane.showMessageDialog(null, "O seu salário é igual ou maior que o salário mínimo: " +  salario);
        } else {
            JOptionPane.showMessageDialog(null, "O seu salário está abaixo do mínimo!");
        }
    }
}

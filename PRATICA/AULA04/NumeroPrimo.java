import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args) {
        /* 
         * 2) Escreva  um  programa  que  verifica  se  um  número  natural  digitado  pelo  usuário  é primo.
         * 
         */
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        int diferenca = 0;

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                diferenca ++;
            }
        }

        if (diferenca == 1) {
            JOptionPane.showMessageDialog(null, "É um número primo: " + numero);
        }else {
            JOptionPane.showMessageDialog(null, "Não um número primo: " + numero);
        }
    }        
      
}

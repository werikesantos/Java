import javax.swing.JOptionPane;

public class Entre20E90 {
    public static void main(String[] args) {
        /* 
         * 7) Construir um algoritmo que indique se o número digitado está compreendido 
         * entre 20 e 90 ou não. 
         * 
         */
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    
        if (n1 >= 20 && n1 <= 90) {
            JOptionPane.showMessageDialog(null, "O número " + n1 + " está entre 20 e 90");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + n1 + " NÃO está entre 20 e 90");
        }

    }
}

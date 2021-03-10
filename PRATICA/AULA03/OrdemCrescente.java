import javax.swing.JOptionPane;

public class OrdemCrescente {
    public static void main(String[] args) {
        /* 
         * 6) Ler três números e escrevê-los em ordem crescente (suponha números diferentes).
         * 
         */
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
    
        if ((n1 > n2) && (n1 > n3)) {
            JOptionPane.showMessageDialog(null, n3 +"-"+ n2 +"-"+ n1);
        }else if((n2 > n1) && (n2 > n3)){
            JOptionPane.showMessageDialog(null, n3 +"-"+ n1 +"-"+ n2);
        }else{
            JOptionPane.showMessageDialog(null, n1 +"-"+ n2 +"-"+ n3);
        }
    }
}

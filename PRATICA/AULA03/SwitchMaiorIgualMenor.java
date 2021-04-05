import javax.swing.JOptionPane;

public class SwitchMaiorIgualMenor {
    public static void main(String[] args) {
        /* 
         * 8) Entrar com um número e imprimir uma das mensagens:maior do que 20, igual a 20 ou 
         * menor do que 20. Use switch-case. 
         * 
         */
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    
        switch (n1) {
            case 21:
                JOptionPane.showMessageDialog(null,"Maior do que 20!");
                break;
            case 20:
                JOptionPane.showMessageDialog(null,"Igual a 20!");
                break;
            case 19:
                JOptionPane.showMessageDialog(null,"Menor do que 20!");
                break;
            default: 
                break;
        }

    }
}

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        /* 
         * 3) Escreva  um  programa  que  calcula  o  fatorial  de  um valor  natural  digitado  pelo usuário.
         * 
         */
        int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    
        int resultado=1;
        int countador=1;

        while (countador <= fatorial) {
            resultado = resultado * countador;
            countador += 1;    
        } 
        JOptionPane.showMessageDialog(null, resultado);     
    }
}

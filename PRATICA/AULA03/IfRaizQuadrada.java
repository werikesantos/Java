import javax.swing.JOptionPane;

public class IfRaizQuadrada {
    public static void main(String[] args) {
        /* 
         * 5) Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo
         * e o quadrado do número caso seja negativo.  
         * 
         */
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            JOptionPane.showMessageDialog(null, "Raiz Quadrada: " + raiz);
        } else{
            double quadrado = Math.pow(numero,2);
            JOptionPane.showMessageDialog(null, "Quadrado do número: " + quadrado);
        }
    }
}

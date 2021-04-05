import javax.swing.JOptionPane;

public class IfMenorIgual20 {
    public static void main(String[] args) {
        /* 
         * 4) Construir  um  algoritmo  que  leia  dois  números  e  efetue  a  adição.  
         * Caso  o  valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5. 
         * 
         */
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor do tipo inteiro:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor do tipo inteiro:"));
        
        int resultado = valor1 + valor2;

        if (resultado <= 20) {
            int novoResultado = resultado - 5;
            JOptionPane.showMessageDialog(null, "A soma dos números é menor ou igual a 20 e será subtraido 5:\nResultado: " +  novoResultado);
        }
    }
}

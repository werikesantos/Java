import javax.swing.JOptionPane;

public class IfResultadoMaior10 {
    public static void main(String[] args) {
        /* 
         * 3) Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; 
         * caso o resultado seja maior que 10, apresentá-lo.
         * 
         */
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor do tipo inteiro:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor do tipo inteiro:"));
        
        int resultado = valor1 + valor2;

        if (resultado > 10) {
            JOptionPane.showMessageDialog(null, "A soma dos números é maior que 10:\nResultado: " +  resultado);
        }
    }
}

import javax.swing.JOptionPane;

public class Antecessor {

	public static void main(String[] args) {
	/* 
         * 4) Ler um valor inteiro e exibir seu antecessor.
         * 
         */
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));

        int antecessor = (valor - 1); 

        JOptionPane.showMessageDialog(null, "Antecessor: " +  antecessor);

	}

}

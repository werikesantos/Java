import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        /* 
         * 10) Entrar com dois números e imprimir o maior número (suponha números diferentes). 
         *  
         */
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número:","Primeiro número", JOptionPane.INFORMATION_MESSAGE));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número:","Segundo número", JOptionPane.INFORMATION_MESSAGE));

        if (numero1 > numero2){
            JOptionPane.showMessageDialog(null, numero1 + "\nMaior número", "Primeiro número digitado", JOptionPane.INFORMATION_MESSAGE);
        }else if(numero2 > numero1){
            JOptionPane.showMessageDialog(null, numero2 + "\nMaior número", "Segundo número digitado", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}

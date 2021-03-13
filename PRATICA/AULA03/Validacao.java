import javax.swing.JOptionPane;

public class Validacao {
    public static void main(String[] args) {
        /* 
         * 9) Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino e  tiver  
         * menos  que  25  anos, imprimir  nome  e  a  mensagem:  ACEITA.  Caso  contrário, 
         * imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.) 
         * 
         */
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        char sexo = JOptionPane.showInputDialog("Insira seu sexo:").charAt(0);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade:"));

        if ((sexo == 'f' || sexo == 'F') && (idade < 25)) {
            JOptionPane.showMessageDialog(null,"Aceita");
        }else{
            JOptionPane.showMessageDialog(null, nome + "\n" + "NÃO ACEITA");
        }

    }
}
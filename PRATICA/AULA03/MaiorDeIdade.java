import javax.swing.JOptionPane;

public class MaiorDeIdade {
    public static void main(String[] args) {
        /* 
         * 2) Escreva  um  programa  que  obtém  a  idade  de  uma  pessoa  e  diz  se  ela  é  maior, 
         * segundo  a  legislação  brasileira.  Escreva  uma  versão  com  if/else  e  outra  com  o operador ternário.
         * 
         */
        
        MaiorDeIdade maiorDeIdade = new MaiorDeIdade();

        maiorDeIdade.ifElseMaiorIdade();

        maiorDeIdade.ifTernarioMaiorIdade();

    }

    public void ifElseMaiorIdade(){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
    
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é MAIOR de idade, segundo a legislação brasileira");
        } else {
            JOptionPane.showMessageDialog(null, "Você é MENOR de idade, segundo a legislação brasileira");
        }
    }

    public void ifTernarioMaiorIdade(){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
    
        JOptionPane.showMessageDialog(null, ((idade >= 18) ? 
        "Você é MAIOR de idade, segundo a legislação brasileira!" : 
        "Você é MENOR de idade, segundo a legislação brasileira!"));
    }

}

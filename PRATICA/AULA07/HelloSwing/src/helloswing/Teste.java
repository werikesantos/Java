package helloswing;

import static helloswing.HelloswingTela.criarTela;
import javax.swing.SwingUtilities;

public class Teste {
    public static void main(String[] args) {
        
        //SEMPRE INICIAR O PROGRAMA COM O COMANDO ABAIXO
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}

package helloswing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
        
    public class HelloswingTela{
        
        public static void criarTela(){
            
            JFrame criarTela = new JFrame("Hello, Mundo!!!");
            //AO CLICAR NO "X" O PROGRAMA É ENCERRADO
            criarTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            //constroi um JLabel
            JLabel criarDescricao = new JLabel("Hello, Swing!!!!!!!");
            
            //obtem o painel de conteúdo
            Container painelDeConteudo = criarTela.getContentPane();
            
            //adiciona o JLabel ao painel de conteúdo
            painelDeConteudo.add(criarDescricao);
            
            //ajusta largura e altura da tela conforme seu conteúdo
            criarTela.pack();
            
            //torna a tela visível
            criarTela.setVisible(true);
            
        }
        
    }
    


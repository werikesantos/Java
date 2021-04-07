package conversordetemperatura;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversorDeTemperatura {
    
    public static void criarTela(){
            
        //CONFIGURANDO A TELA
        JFrame tela = new JFrame ("Conversor");
        //centraliza a tela
        tela.setLocationRelativeTo(null);
        //altera comportamento padrão do botão fechar
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //CONFIGURANDO O PAINEL
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 4, 2, 4));
        
        //CRIAÇÃO DE BOTOES
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("ºC");
        JButton convertButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        
        //ADCIONANDO OS BOTOES NA TELA
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(convertButton);
        painelDeConteudo.add(valorConvertidoLabel);
        
        //EVENTO NO BOTAO
        convertButton.addActionListener((e) -> {
            double celsius = Double.parseDouble(celsiusTextField.getText());
            
            double fahrenheit = celsius / 5 * 9 + 32;
            
            valorConvertidoLabel.setText(String.format("%.2fºF", fahrenheit));
            
        });
        
        //ajusta largura e altura de acordo com o conteúdo
        tela.pack();
        //torna a tela visível
        tela.setVisible(true);
        
    } 
}

package conversordetemperatura;

import static conversordetemperatura.ConversorDeTemperatura.criarTela;
import javax.swing.SwingUtilities;

public class Teste {

    public static void main(String[] args) {
        SwingUtilities.invokeLater (() -> {
            criarTela();
        });
    }
}

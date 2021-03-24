import javax.swing.JOptionPane;

public class Veiculo {
    public static void main(String[] args) {
        
        //VEÍCULO 1
        Carro carro1 = new Carro(); 

        carro1.carroPadrao();
        carro1.adquirirCarro();

        //VEÍCULO 2
        String cor = "AZUL";
        String marca = "UNO";

        Carro carro2 = new Carro(cor, marca);

        JOptionPane.showMessageDialog(null, "CARRO 2:\n" + "Marca: " + carro2.getMarca() + "\nCor: " + carro2.getCor());
    }
}

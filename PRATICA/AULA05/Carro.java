import javax.swing.JOptionPane;

public class Carro {
    
    private String cor;
    private String marca;

    /* CONSTRUTOR PADRÃO - CARRO PADRÃO */
    public Carro(){
        this.cor = "Preto";
        this.marca = "Volkswagen";
    }

    /* CONSTRUTOR PADRÃO - CARRO PADRÃO */
    public Carro(String cor, String marca){
        this.cor = cor;
        this.marca = marca;
    }

    /* MÉTODOS */
    public void carroPadrao(){

        Carro carro = new Carro();
        JOptionPane.showMessageDialog(null, "CARRO PADRÃO\n" + "Marca: " + carro.getMarca() + "\nCor: " + carro.getCor());
        System.out.println("CARRO PADRÃO:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Cor: " + carro.getCor());

    }

    public void adquirirCarro(){

        Carro carro = new Carro();

        String marca = JOptionPane.showInputDialog("Escolha uma marca de carro:");
        String cor = JOptionPane.showInputDialog("Escolha uma cor para o carro:");

        carro.setCor(cor);
        carro.setMarca(marca);

        JOptionPane.showMessageDialog(null, "CARRO ADQUIRIDO\n" + "Marca: " + carro.getMarca() + "\nCor: " + carro.getCor()); 
        
        System.out.println("=======================");
        System.out.println("CARRO ADQUIRIDO:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Cor: " + carro.getCor());
    }

    /* GETTER AND SETTER */
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

public class ForWhileDoWhile {
    public static void main(String[] args) {
        /* 
         * 1) Escreva  um  programa  que  exibe  os  primeiros 100  números  naturais.
         * Faça  versões usando for, while e do/while.
         * 
         */
        ForWhileDoWhile forWhileDoWhile = new ForWhileDoWhile();

        forWhileDoWhile.exemploFor();

        forWhileDoWhile.exemploWhile();
        
        forWhileDoWhile.exemploDoWhile();
      
    }

    public void exemploFor(){
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
    }

    public void exemploWhile(){
        int i=1;
        while (i<=100) {
            System.out.println(i);
            i++;
        }
    }

    public void exemploDoWhile(){
        int i=1;
        do {
            System.out.println(i); 
            i++;   
        } while (i<=100);
    }

}

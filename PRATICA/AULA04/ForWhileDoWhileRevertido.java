public class ForWhileDoWhileRevertido {
    public static void main(String[] args) {
        /* 
         * 2) Reimplemente o exercício 1, fazendo com que os valores sejam exibidos em ordem reversa.
         * 
         */
        ForWhileDoWhileRevertido forWhileDoWhileRevertido = new ForWhileDoWhileRevertido();

        forWhileDoWhileRevertido.exemploFor();

        forWhileDoWhileRevertido.exemploWhile();
        
        forWhileDoWhileRevertido.exemploDoWhile();
      
    }

    public void exemploFor(){
        for(int i=100;i>0;i--){
            System.out.println(i);
        }
    }

    public void exemploWhile(){
        int i=100;
        while (i>0) {
            System.out.println(i);
            i--;
        }
    }

    public void exemploDoWhile(){
        int i=100;
        do {
            System.out.println(i); 
            i--;   
        } while (i>0);
    }
}

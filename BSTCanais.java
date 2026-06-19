public class BSTCanais {


    Canal raiz;

    public BSTCanais() {
        raiz = null;
    }

    public void inserir(Canal canal) {
        raiz = inserirRec(raiz, canal);
    }

    private Canal inserirRec(Canal atual, Canal canal){

        if(atual == null){
            return canal;
        }

        if(canal.numero < atual.numero){
            atual.esquerda = inserirRec(atual.esquerda, canal);
        }

        else if(canal.numero > atual.numero){
            atual.direita = inserirRec(atual.direita, canal);
        }

        return atual;
    }

    public Canal buscar(int numero){
        return buscarRec(raiz, numero);
    }

    private Canal buscarRec(Canal atual, int numero){

        if(atual == null){
            return null;
        }

        if(numero == atual.numero){
            return atual;
        }

        if(numero < atual.numero){
            return buscarRec(atual.esquerda, numero);
        }

        return buscarRec(atual.direita, numero);
    }

    public void listarEmOrdem(){
        listarRec(raiz);
    }

    private void listarRec(Canal atual){

        if(atual != null){

            listarRec(atual.esquerda);

            System.out.println(atual.numero + " - " + atual.nome);

            listarRec(atual.direita);
        }
    }

}

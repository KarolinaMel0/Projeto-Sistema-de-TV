public class FilaProgramacao {


    Programa inicio;
    Programa fim;

    public void enfileirar(Programa programa){

        if(inicio == null){

            inicio = programa;
            fim = programa;

        }else{

            fim.proximo = programa;
            fim = programa;
        }
    }

    public Programa desenfileirar(){

        if(inicio == null){
            return null;
        }

        Programa removido = inicio;

        inicio = inicio.proximo;

        if(inicio == null){
            fim = null;
        }

        removido.proximo = null;

        return removido;
    }

    public void exibirFila(){

        Programa atual = inicio;

        while(atual != null){

            System.out.println(atual.titulo);

            atual = atual.proximo;
        }
    }
}

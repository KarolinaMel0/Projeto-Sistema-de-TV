public class PilhaHistorico {

    Programa topo;

    public void empilhar(Programa programa){

        programa.proximo = topo;

        topo = programa;
    }

    public Programa desempilhar(){

        if(topo == null){
            return null;
        }

        Programa removido = topo;

        topo = topo.proximo;

        removido.proximo = null;

        return removido;
    }

    public void exibirHistorico(){

        Programa atual = topo;

        while(atual != null){

            System.out.println(atual.titulo);

            atual = atual.proximo;
        }
    }

}

public class Canal {


    int numero;
    String nome;

    Programa programas;

    Canal esquerda;
    Canal direita;

    public Canal(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;

        programas = null;

        esquerda = null;
        direita = null;
    }

    public void inserirPrograma(Programa novo) {

        if(programas == null){
            programas = novo;
            return;
        }

        Programa atual = programas;

        while(atual.proximo != null){
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public void listarProgramas(){

        Programa atual = programas;

        while(atual != null){
            atual.exibirInfo();
            atual = atual.proximo;
        }
    }

    public Programa buscarPrograma(String titulo){

        Programa atual = programas;

        while(atual != null){

            if(atual.titulo.equalsIgnoreCase(titulo)){
                return atual;
            }

            atual = atual.proximo;
        }

        return null;
    }


}

public class SistemaTV {


    BSTCanais canais;
    PilhaHistorico historico;

    public SistemaTV() {
        canais = new BSTCanais();
        historico = new PilhaHistorico();
    }

    public void assistirPrograma(int canalNumero, String titulo){

        Canal canal = canais.buscar(canalNumero);

        if(canal == null){

            System.out.println("Canal não encontrado");
            return;
        }

        Programa programa = canal.buscarPrograma(titulo);

        if(programa == null){

            System.out.println("Programa não encontrado");
            return;
        }

        historico.empilhar(new Programa(programa.titulo, programa.horario, programa.tipo));

        System.out.println("Assistindo: " + programa.titulo);
    }
}

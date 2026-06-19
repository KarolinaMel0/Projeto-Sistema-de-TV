public class Main {

    public static void main(String[] args) {

        SistemaTV sistema = new SistemaTV();

        Canal globo = new Canal(10, "Globo");
        Canal sbt = new Canal(5, "SBT");
        Canal record = new Canal(15, "Record");

        sistema.canais.inserir(globo);
        sistema.canais.inserir(sbt);
        sistema.canais.inserir(record);

        globo.inserirPrograma(new Programa("Jornal Nacional", "20:30", "Noticias"));

        globo.inserirPrograma(new Programa("Tela Quente", "22:30", "Filme"));

        System.out.println("CANAIS");

        sistema.canais.listarEmOrdem();

        System.out.println();

        System.out.println("PROGRAMAÇÃO GLOBO");

        globo.listarProgramas();

        System.out.println();

        sistema.assistirPrograma(10, "Jornal Nacional");

        System.out.println();

        System.out.println("HISTÓRICO");

        sistema.historico.exibirHistorico();
    }
}
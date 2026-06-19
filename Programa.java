public class Programa {
    String titulo;
    String horario;
    String tipo;

    Programa proximo;

    public Programa(String titulo, String horario, String tipo){
        this.titulo = titulo;
        this.horario= horario;
        this.tipo = tipo;
        this.proximo = null;
    }
    public void exibirInfo(){
        System.out.println(titulo +  " | " + horario +  " | " + tipo);
    }

}

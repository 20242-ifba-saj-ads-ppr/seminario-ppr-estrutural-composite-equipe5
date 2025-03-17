package ExemploLego;

public class PecaLego implements Lego {

    private String nome;

    public PecaLego(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println("Peça de Lego: " + nome);
    }

    @Override
    public void montar() {
        System.out.println("Montando peça de Lego: " + nome);
    }

    @Override
    public void desmontar() {
        System.out.println("Desmontando peça de Lego: " + nome);
    }
}

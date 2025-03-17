package ExemploLego;

import java.util.ArrayList;
import java.util.List;

public class EstruturaLego implements Lego{
        private String nome;
    private List<Lego> pecas = new ArrayList<>();

    public EstruturaLego(String nome) {
        this.nome = nome;
    }

    public void adicionarPeca(Lego peca) {
        pecas.add(peca);
    }

    public void removerPeca(Lego peca) {
        pecas.remove(peca);
    }

    @Override
    public void exibir() {
        System.out.println("Estrutura de Lego: " + nome);
        for (Lego peca : pecas) {
            peca.exibir();
        }
    }

    @Override
    public void montar() {
        System.out.println("Montando estrutura de Lego: " + nome);
        for (Lego peca : pecas) {
            peca.montar();
        }
    }

    @Override
    public void desmontar() {
        System.out.println("Desmontando estrutura de Lego: " + nome);
        for (Lego peca : pecas) {
            peca.desmontar();
        }
    }
}

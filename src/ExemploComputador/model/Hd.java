public class Hd implements Computador {
    @Override
    public void mostrar() {
        System.out.println("HD");
    }

    @Override
    public void adicionar(Computador c) {
        // Método não suportado para folhas
    }

    @Override
    public void remover(Computador c) {
        // Método não suportado para folhas
    }

    @Override
    public Computador getFilho(int i) {
        // Método não suportado para folhas
        return null;
    }
}

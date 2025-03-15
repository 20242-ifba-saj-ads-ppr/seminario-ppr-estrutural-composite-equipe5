
public class Hd implements Computador {
    private String marca;
    
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

    @Override
    public String toString() {
        return "{"
                + getClass().toString()
                + ": marca='"
                + getMarca()
                + "'"
                + "}";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

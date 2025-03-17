
public class Cpu implements Computador {
    private String marca;

    public Cpu(String marca) {
        setMarca(marca);
    }

    @Override
    public void adicionar(Computador c) {
        // Objeto Folha não suporta essa operação
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void remover(Computador c) {
        // Objeto Folha não suporta essa operação
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public Computador getFilho(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFilho'");
    }

    @Override
    public String toString() {
        return "{"
                + getClass().getName().toString()
                + ": marca='" + getMarca() 
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

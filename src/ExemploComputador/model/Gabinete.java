
public class Gabinete implements Computador {
    private String tipo;

    @Override
    public void adicionar(Computador c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void remover(Computador c) {
        // TODO Auto-generated method stub
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
                + getClass().toString()
                + ": tipo='" 
                + getTipo() 
                + "'"
                + "}";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

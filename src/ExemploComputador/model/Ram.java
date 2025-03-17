public class Ram implements Computador {
    private String marca;
    
    public Ram(String marca) {
        setMarca(marca);
    }
    
    @Override
    public void adicionar(Computador c) {
        //Método não suportado para folhas
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void remover(Computador c) {
        //Método não suportado para folhas
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public Computador getFilho(int i) {
        //Método não suportado para folhas
        throw new UnsupportedOperationException("Unimplemented method 'getFilho'");
    }
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        return "{"
                + getClass().getName().toString()
                + ": marca='"
                + getMarca()
                + "'"
                + "}";
    }

}

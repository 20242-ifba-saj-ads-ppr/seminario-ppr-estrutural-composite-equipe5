import java.util.ArrayList;
import java.util.List;

public class Perifericos implements Computador {
    private String tipo;
    private List<Computador> componentes;
    
    public Perifericos() {
    }
    public Perifericos(String tipo) {
        setTipo(tipo);
        setComponentes(new ArrayList<>());
    }
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
                + ": marca='"
                + getTipo()
                + "', componentes='"
                + getComponentes()
                + "'"
                + "}";
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Computador> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Computador> componentes) {
        this.componentes = componentes;
    }
    
    
}

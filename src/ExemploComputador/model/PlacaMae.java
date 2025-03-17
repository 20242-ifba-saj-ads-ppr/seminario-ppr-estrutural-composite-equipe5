import java.util.ArrayList;
import java.util.List;

public class PlacaMae implements Computador {
    private String tipo;
    private List<Computador> componentes;
    
    public PlacaMae() {
    }
    public PlacaMae(String tipo) {
        setTipo(tipo);
        setComponentes(new ArrayList<>());
    }
    @Override
    public void adicionar(Computador c) {
        getComponentes().add(c);
    }

    @Override
    public void remover(Computador c) {
        getComponentes().remove(c);
    }

    @Override
    public Computador getFilho(int i) {
        return getComponentes().get(i);
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

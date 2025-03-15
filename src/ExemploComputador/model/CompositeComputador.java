import java.util.ArrayList;
import java.util.List;

public class CompositeComputador implements Computador {
    private List<Computador> componentes;


    public CompositeComputador() {
        setComponentes(new ArrayList<>());
    }

    @Override
    public void mostrar() {
       getComponentes().forEach(Computador::mostrar);
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

    public List<Computador> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Computador> componentes) {
        this.componentes = componentes;
    }
}

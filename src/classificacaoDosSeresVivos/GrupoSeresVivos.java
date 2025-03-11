

import java.util.ArrayList;
import java.util.List;

public class GrupoSeresVivos implements SerVivo {
    private List<SerVivo> seresVivos;

    public GrupoSeresVivos() {
        setSeresVivos(new ArrayList<>());
    }

    public void adicionar(SerVivo serVivo) {
        getSeresVivos().add(serVivo);
    }

    public void remover(SerVivo serVivo) {
        getSeresVivos().remove(serVivo);
    }

    @Override
    public void mostrar() {
        getSeresVivos().forEach(servivo -> servivo.mostrar());
    }

    public List<SerVivo> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(List<SerVivo> seresVivos) {
        this.seresVivos = seresVivos;
    }
}

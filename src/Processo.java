import java.util.Map;
import java.util.List;

public class Processo {
    private static int ultimoId = 0;
    private final int id;
    private Map<Integer, EntradaPagina> tabelaPaginas;
    private List<Integer> sequencia;

    public Processo(Map<Integer, EntradaPagina> tabelaPaginas, List<Integer> sequencia) {
        this.id = ultimoId++;
        setTabelaPaginas(tabelaPaginas);
        setSequencia(sequencia);
    }

    public int getId() {
        return id;
    }

    public Map<Integer, EntradaPagina> getTabelaPaginas() {
        return tabelaPaginas;
    }

    private void setTabelaPaginas(Map<Integer, EntradaPagina> tabelaPaginas) {
        this.tabelaPaginas = tabelaPaginas;
    }

    public List<Integer> getSequencia() {
        return sequencia;
    }

    private void setSequencia(List<Integer> sequencia) {
        this.sequencia = sequencia;
    }

    public boolean acessarPagina(int paginaId) {
        EntradaPagina entrada = tabelaPaginas.get(paginaId);
        return entrada != null && entrada.isPresente();
    }

    public EntradaPagina getEntradaPagina(int paginaId) {
        return tabelaPaginas.get(paginaId);
    }
}

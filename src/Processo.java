import java.util.Map;

public class Processo {
    private static int ultimoId = 0;
    private final int id;
    private Map<Integer, EntradaPagina> tabelaPaginas;
    private int[] sequencia;

    public Processo(Map<Integer, EntradaPagina> tabelaPaginas, int[] sequencia) {
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

    public int[] getSequencia() {
        return sequencia;
    }

    private void setSequencia(int[] sequencia) {
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

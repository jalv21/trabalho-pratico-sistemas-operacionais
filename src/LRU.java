import java.util.List;
import java.util.Map;

public class LRU extends Politica {
    public String nome = "LRU";
    private List<Integer> historicoAcessos;
    
    @Override
    public Frame selecionarPagina(List<Frame> frames, Map<Integer, EntradaPagina> tabelaPaginas, int acessoAtual, List<Integer> requisicoesFuturas) {
        // TODO Implementar a lógica de seleção LRU de página
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }
}

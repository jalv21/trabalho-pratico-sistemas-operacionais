import java.util.List;
import java.util.Map;

public class FIFO implements IPolitica {
    @Override
    public Frame selecionarPagina(List<Frame> frames, Map<Integer, EntradaPagina> tabelaPaginas, int acessoAtual, List<Integer> requisicoesFuturas) {
        // TODO: Implementar a lógica de seleção FIFO de página
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }
}

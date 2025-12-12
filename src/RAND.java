import java.util.List;
import java.util.Map;

public class RAND extends Politica {
    public String nome = "RAND";
    
    @Override
    public Frame selecionarPagina(List<Frame> frames, Map<Integer, EntradaPagina> tabelaPaginas, int acessoAtual, List<Integer> requisicoesFuturas) {
        // TODO: Implementar a lógica de seleção aleatória de página
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }
}
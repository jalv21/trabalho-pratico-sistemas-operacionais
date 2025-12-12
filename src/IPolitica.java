import java.util.List;
import java.util.Map;

public interface IPolitica {
    public Frame selecionarPagina(List<Frame> frames, Map<Integer, EntradaPagina> tabelaPaginas, int acessoAtual, List<Integer> requisicoesFuturas);
}

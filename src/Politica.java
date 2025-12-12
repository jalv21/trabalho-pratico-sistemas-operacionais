import java.util.List;
import java.util.Map;

public abstract class Politica {
    public String nome = "POLITICA";
    public abstract Frame selecionarPagina(List<Frame> frames, Map<Integer, EntradaPagina> tabelaPaginas, int acessoAtual, List<Integer> requisicoesFuturas);
}

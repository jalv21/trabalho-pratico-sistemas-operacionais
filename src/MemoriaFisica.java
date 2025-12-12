import java.util.LinkedList;
import java.util.List;

public class MemoriaFisica {
    private List<Frame> frames;
    private Configuracao config;
    private int proximoFrameDisponivel;

    public MemoriaFisica(Configuracao config) {
        this.config = config;
        frames = new LinkedList<>();
    }

    public Frame encontrarFrameDisponivel() {
        if(cheia())
            throw new IllegalStateException("A memória física está cheia! Não há frames disponíveis!");

        return frames.stream().findFirst(getPagina() == null);
    }

    public void carregarPagina(Pagina pag, Frame frame, EntradaPagina entrada) {
        // TODO
    }

    public boolean cheia() {
        return (frames.size() == config.quantFrames());
    }
}

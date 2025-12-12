public class MemoriaFisica {
    private Frame[] frames;
    private Configuracao config;
    private int proximoFrameDisponivel;

    public MemoriaFisica(Configuracao config) {
        // TODO
    }

    public Frame encontrarFrameDisponivel() {
        // TODO
        return null;
    }

    public void carregarPagina(Pagina pag, Frame frame, EntradaPagina entrada) {
        // TODO
    }

    public boolean cheia() {
        return (frames.length == config.quantFrames());
    }
}

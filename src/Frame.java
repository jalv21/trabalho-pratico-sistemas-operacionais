public class Frame {
    private int numFrame;
    private Pagina pagina;
    private long tempoCarregado;

    public Frame(int numFrame, Pagina pagina) {
        this.numFrame = numFrame;
        this.pagina = pagina;
        atualizarTempoAcesso();
    }

    public boolean vazio() {
        return (this.pagina == null);
    }

    private void atualizarTempoAcesso() {
        this.tempoCarregado = 0;
    }

    public Pagina getPagina() {
        return pagina;
    }
}

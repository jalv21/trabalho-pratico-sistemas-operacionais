public class EntradaPagina {
    private int numFrame;
    private boolean presente;
    private boolean modificada;
    private boolean referenciada;

    public EntradaPagina() {
        numFrame = 0;
        presente = modificada = referenciada = false;
    }

    public EntradaPagina(int numFrame, boolean presente, boolean modificada, boolean referenciada) {
        this.numFrame = numFrame;
        this.presente = presente;
        this.modificada = modificada;
        this.referenciada = referenciada;
    }

    public boolean isPresente() {
        return presente;
    }

    public boolean isModificada() {
        return modificada;
    }

    public boolean isReferenciada() {
        return referenciada;
    }

    public boolean estaNoSwap() {
        // TODO Método para verificar se uma entrada está no Swap
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }

    public void setNumFrame(int numFrame) {
        this.numFrame = numFrame;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public void setModificada(boolean modificada) {
        this.modificada = modificada;
    }

    public void setReferenciada(boolean referenciada) {
        this.referenciada = referenciada;
    }
}

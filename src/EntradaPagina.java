public class EntradaPagina {
    private int numFrame;
    private boolean presente;
    private boolean modificada;
    private boolean referenciada;

    public EntradaPagina() {
        numFrame = 0;
        presente = modificada = referenciada = false;
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
}

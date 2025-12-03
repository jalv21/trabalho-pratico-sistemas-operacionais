public abstract class Memoria<E> {
    // Corresponde ao tamanho da memória em bytes
    private int tamanho;
    // Array que simula a memória
    private E[] memoria;
    // Enum que define a arquitetura do sistema (32 ou 64 bits)
    private final EArquitetura arquitetura;

    @SuppressWarnings("unchecked")
    protected Memoria(int tamanhoBytes, EArquitetura arquitetura) {

        tamanho = tamanhoBytes;
        memoria = (E[]) new Object[tamanhoBytes];
        this.arquitetura = arquitetura;
    }

    protected int getTamanho() {
        return tamanho;
    }

    abstract protected void alocar(int endereco, E valor);

    abstract protected E remover(int endereco, E valor);
}
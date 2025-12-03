public abstract class Memoria<E> {
    // Corresponde ao tamanho da memória em bytes
    private int tamanho;
    // Array que simula a memória
    private E[] memoria;
    // Enum que define a arquitetura do sistema (32 ou 64 bits)
    private EArquitetura arquitetura;

    @SuppressWarnings("unchecked")
    protected Memoria(int tamanhoBytes, EArquitetura arquitetura) {

        tamanho = tamanhoBytes;
        memoria = (E[]) new Object[tamanhoBytes];
        this.arquitetura = arquitetura;
    }
}

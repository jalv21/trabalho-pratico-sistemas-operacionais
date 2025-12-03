public class MemoriaVirtual<E> extends Memoria<E> {
    
    public MemoriaVirtual(int tamanhoBytes, EArquitetura arquitetura) {
        super(tamanhoBytes, arquitetura);
    }

    @Override
    protected void alocar(int endereco, E valor) {
        // TODO Implementação específica para alocar na memória virtual
    }

    @Override
    protected E remover(int endereco, E valor) {
        // TODO Implementação específica para remover da memória virtual
        return null;
    }
}

public class MemoriaFisica<E> extends Memoria<E>{

    public MemoriaFisica(int tamanhoBytes, EArquitetura arquitetura) {
        super(tamanhoBytes, arquitetura);
    }

    @Override
    protected void alocar(int endereco, E valor) {
        // TODO Implementação específica para alocar na memória física
    }

    @Override
    protected E remover(int endereco, E valor) {
        // TODO Implementação específica para remover da memória física
        return null;
    }
}

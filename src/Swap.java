import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Swap {
    private List<Integer> estado;
    private int tamanho;
    private int espacoUsado;

    public Swap(Configuracao config, int tamanho) {
        setTamanho(config.capacidadeSwap());
        this.espacoUsado = 0;
        this.estado = new ArrayList<>(tamanho);
    }

    private void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean podeInserir() {
        return (espacoUsado < tamanho);
    }

    public void inserirPagina(Pagina pag) {
        if(espacoUsado < pag.tamanho)
            throw new IllegalStateException("Não foi possível remover página do Swap: não há páginas alocadas.");

        boolean encontrada = false;

        for(int i = 0; i <= tamanho - 1; i++) {
            if(estado.get(i).equals(pag.getId())) {
                encontrada = true;
                estado.remove(i);  
                espacoUsado -= pag.tamanho;
            }
        }

        if(!encontrada)
            throw new NoSuchElementException("A página requisitada não está no Swap.");
    }


}

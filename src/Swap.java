import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Swap {
    private Configuracao config;
    private List<Integer> estado;
    private int tamanho;
    private int espacoUsado;

    public Swap(Configuracao config, int tamanho) {
        setConfig(config);
        setTamanho(tamanho);
        this.espacoUsado = 0;
        this.estado = new ArrayList<>(tamanho);
    }

    private void setConfig(Configuracao config) {
        this.config = config;
    }

    private void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean cheio() {
        return (espacoUsado >= tamanho);
    }

    public boolean vazio() {
        return (espacoUsado <= config.tamanhoPagina());
    }

    public void inserirPagina(Pagina pag) {
        if(vazio())
            throw new IllegalStateException("Não foi possível remover página do Swap: não há páginas alocadas.");

        boolean encontrada = false;

        for(int i = 0; i <= tamanho - 1; i++) {
            if(estado.get(i).equals(pag.getId())) {
                encontrada = true;
                estado.remove(i);  
                espacoUsado -= config.tamanhoPagina();
            }
        }

        if(!encontrada)
            throw new NoSuchElementException("A página requisitada não está no Swap.");
    }

    public void removerPagina(Pagina pag) {
        if(cheio())
            throw new IllegalStateException("Não é possível alocar página no Swap: não há espaço suficiente!");

        estado.addLast(pag.getId());
        espacoUsado += config.tamanhoPagina();
    }

    public List<Integer> getEstado() {
        return estado;
    } 
}

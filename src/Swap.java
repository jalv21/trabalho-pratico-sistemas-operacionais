import java.util.ArrayList;
import java.util.List;

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
        for(int i = 0; i <= tamanho - 1; i++) {
            if(estado.get(i).equals(pag.getId()))
                estado.remove(i);
        }
        espacoUsado -= pag.tamanho();
    }
}

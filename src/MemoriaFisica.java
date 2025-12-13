import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MemoriaFisica {
    private List<Frame> frames;
    private List<Frame> framesOcupados; 
    private Configuracao config;

    public MemoriaFisica(Configuracao config) {
        this.config = config;
        frames = new ArrayList<>(config.quantFrames());
        framesOcupados = new ArrayList<>();
    }

    public Frame encontrarFrameDisponivel() {
        if(cheia())
            throw new IllegalStateException("A memória física está cheia! Não há frames disponíveis!");

        return frames.stream()
                     .filter(f -> f == null)
                     .findFirst()
                     .orElseThrow(() -> new NoSuchElementException("Não há frames disponíveis!"));
    }

    public void carregarPagina(Pagina pag, EntradaPagina entrada) {
        Frame frame = encontrarFrameDisponivel();
        
        frame.setPagina(pag);
        entrada.setNumFrame(frame.getNumFrame());
        entrada.setPresente(true);
        entrada.setReferenciada(true);

        frames.add(frame);
        atualizarOcupados();
    }

    public boolean cheia() {
        return (framesOcupados.size() == frames.size());
    }

    private void atualizarOcupados() {
        framesOcupados = frames.stream().filter(f -> f != null).toList();
    }

    public List<Frame> getFrames() {
        return frames;
    }
}

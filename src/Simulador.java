public class Simulador {
    private Configuracao config;
    private Processo processo;
    private MemoriaFisica memoria;
    private Swap swap;
    private IPolitica politica;

    public Simulador(Configuracao config, Processo processo, IPolitica politica) {
        this.config = config;
        this.processo = processo;
        this.politica = politica;
        this.memoria = new MemoriaFisica(config);
        this.swap = new Swap(config, config.capacidadeSwap());
    }

    public void executar(int[] sequencia, IPolitica politica) {
        // TODO Implementar o método de simulação
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }
}

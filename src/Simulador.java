public class Simulador {
    private Configuracao config;
    private Processo processo;
    private MemoriaFisica memoria;
    private Swap swap;
    private Politica politica;

    public Simulador(Configuracao config, Processo processo, Politica politica) {
        this.config = config;
        this.processo = processo;
        this.politica = politica;
        this.memoria = new MemoriaFisica(config);
        this.swap = new Swap(config, config.capacidadeSwap());
    }

    public String executar(int[] sequencia, Politica politica) {
        StringBuilder resultado = new StringBuilder();
        int contPageFaults = 0;
        long inicio = System.nanoTime();

        boolean pageFault = false;
        for (int i = 0; i <= sequencia.length - 1; i++) {

        }
        
        long fim = System.nanoTime();
        double tempoExecucaoSegundos = (fim - inicio) / 1_000_000_000.0;

        return (politica.nome + "\n" + tempoExecucaoSegundos + "\n" + contPageFaults + "\n" + swap.toString());
    }
}

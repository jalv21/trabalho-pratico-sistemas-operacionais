public class Configuracao {
    private int tamMemFisica;   // Tamanho da memória física em bytes
    private int tamMemVirtual;  // Tamanho da memória virtual, deve ser maior ou igual à memória física
    private int arquitetura;    // Indica arquitetura da CPU (64 ou 32), em bits.
    private int numPaginas;     // Número de páginas virtuais no processo.
    private int numSequencias;  // Número de sequências de requisições a serem processadas
    private int tamPagina;      // Tamanho de cada página alocada na memória virtual.
    private int quantFrames;    // Quantidade de frames na memória física
    private int capacidadeSwap; // Capacidade mínima do Swap para fazer a substituição das páginas.

    /**
     * Construtor da classe. Classe Configuração guarda os dados lidos do arquivo de entrada e 
     * os processa para que outras partes do sistema possam usá-las.
     * 
     * @param tamMemFisica O tamanho, em bytes, da memória física
     * @param tamMemVirtual O tamanho, em bytes, da memória virtual. Deve ser maior ou igual à mem. física.
     * @param arquitetura A String que representa a arquitetura da CPU (x86 ou x64) que será convertida em inteiro (em bits)
     * @param numPaginas O número de páginas virtuais na memória.
     * @param numSequencias O número de sequências de requisições a serem processadas.
     */
    public Configuracao(int tamMemFisica, int tamMemVirtual, String arquitetura, int numPaginas, int numSequencias) {
        setTamMemFisica(tamMemFisica);
        setTamMemVirtual(tamMemVirtual);
        setArquitetura(arquitetura);
        setNumPaginas(numPaginas);
        setNumSequencias(numSequencias);

        // Calcula os atributos indicando tamanho de página, capacidade mínima de Swap e quantidade de frames
        this.tamPagina = (tamMemVirtual / numPaginas);
        this.capacidadeSwap = (tamMemVirtual - tamMemFisica);
        this.quantFrames = (tamMemFisica / tamPagina);
    }

    private void setTamMemFisica(int tamMemFisica) {
        if(tamMemFisica <= 0)
            // Tamanho da memória física não pode ser negativo ou zero.
            throw new IllegalArgumentException("Tamanho inválido para a memória física!");

        this.tamMemFisica = tamMemFisica;
    }

    private void setTamMemVirtual(int tamMemVirtual) {
        if(tamMemVirtual < tamMemFisica)
            // Tamanho da memória virtual não pode ser menor que a memória física.
            throw new IllegalArgumentException("Memória virtual deve ser maior ou igual à memória física!");

        this.tamMemVirtual = tamMemVirtual;
    }

    private void setArquitetura(String arquitetura) {
        if(!arquitetura.equals("x86") && !arquitetura.equals("x64"))
            // Caso a String da arquitetura não represente a arquiteura de 64 ou 32 bits, lança exceção.
            throw new IllegalArgumentException("Arquitetura de CPU inválida! Suporte apenas para 64 e 32 bits!");
        
        else if(arquitetura.equals("x86"))
            this.arquitetura = 64;
        else
            this.arquitetura = 32;
    }

    private void setNumPaginas(int numPaginas) {
        if(numPaginas <= 0)
            throw new IllegalArgumentException("Número de páginas virtuais inválido!");

        this.numPaginas = numPaginas;
    }

    private void setNumSequencias(int numSequencias) {
        if(numSequencias <= 0)
            throw new IllegalArgumentException("Número de sequências de requisições inválido!");

        this.numSequencias = numSequencias;
    }

    public int tamanhoPagina() {
        return tamPagina;
    }

    public int capacidadeSwap() {
        return capacidadeSwap;
    }

    public int quantFrames() {
        return quantFrames;
    }
}

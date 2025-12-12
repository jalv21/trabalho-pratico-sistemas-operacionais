public class Configuracao {
    private int tamMemFisica;
    private int tamMemVirtual;
    private String arquitetura;
    private int numPaginas;
    private int numSequencias;
    private int tamPagina;
    private int capacidadeSwap;

    public Configuracao(int tamMemFisica, int tamMemVirtual, String arquitetura, int numPaginas, int numSequencias) {
        setTamMemFisica(tamMemFisica);
        setTamMemVirtual(tamMemVirtual);
        setArquitetura(arquitetura);
        setNumPaginas(numPaginas);
        setNumSequencias(numSequencias);

        this.tamPagina = calcularTamPagina();
        this.capacidadeSwap = calcularCapacidadeSwap();
    }

    private void setTamMemFisica(int tamMemFisica) {
        if(tamMemFisica <= 0)
            throw new IllegalArgumentException("Tamanho inválido para a memória física!");

        this.tamMemFisica = tamMemFisica;
    }

    private void setTamMemVirtual(int tamMemVirtual) {
        if(tamMemVirtual < tamMemFisica)
            throw new IllegalArgumentException("Memória virtual deve ser maior ou igual à memória física!");

        this.tamMemVirtual = tamMemVirtual;
    }

    private void setArquitetura(String arquitetura) {
        if(!arquitetura.equals("x86") && !arquitetura.equals("x64"))
            throw new IllegalArgumentException("Arquitetura de CPU inválida! Suporte apenas para 64 e 32 bits!");

        this.arquitetura = arquitetura;
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

    private int calcularTamPagina() {
        return (tamMemVirtual / numPaginas);
    }

    private int calcularCapacidadeSwap() {
        return (this.tamMemVirtual - this.tamMemFisica);
    }
}

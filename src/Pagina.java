public class Pagina {
    private static int ultimoId;
    private int id;

    public Pagina() {
        setId(ultimoId++);;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
}

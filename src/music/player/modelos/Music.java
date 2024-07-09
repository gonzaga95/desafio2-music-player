package music.player.modelos;

public class Music extends Audio {
    private String cantor;
    private String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao(){
        double relacaoReproducoesCurtidas = (double) this.getTotalCurtidas() / this.getTotalReproducoes();
        return (int) (relacaoReproducoesCurtidas * 100);
    }
}

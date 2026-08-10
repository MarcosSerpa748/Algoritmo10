public class Estudante {
    private String nome;
    private Double mediaGeral;
    private Double distanciaLocalidade;

    public Estudante(String nome,Double mediaGeral,Double distanciaLocalidade){
        this.nome = nome;
        this.mediaGeral = mediaGeral;
        this.distanciaLocalidade = distanciaLocalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public Double getDistanciaLocalidade() {
        return distanciaLocalidade;
    }

    public void setDistanciaLocalidade(Double distanciaLocalidade) {
        this.distanciaLocalidade = distanciaLocalidade;
    }

    @Override
    public String toString() {
        return  "Nome do estudante:"+this.nome+"\n"+
                "Média geral:"+this.mediaGeral+"\n"+
                "Distância da sua localidade:"+this.distanciaLocalidade+"\n";
    }
}

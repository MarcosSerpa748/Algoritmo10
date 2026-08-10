import java.util.ArrayList;

public class CursoEscolhido {
    private String nome;
    private ArrayList<Estudante> estudantesAguardando = new ArrayList<>();
    private Double notaCorte;
    private Double distanciaMaxima;

    public CursoEscolhido(String nome,Double notaCorte,Double distanciaMaxima){
        this.nome = nome;
        this.notaCorte = notaCorte;
        this.distanciaMaxima = distanciaMaxima;
    }


    public void inserirEstudante(Estudante e){
        this.estudantesAguardando.add(e);
    }

    public ArrayList<Estudante> retornarAlunosAprovados(){
        ArrayList<Estudante> estudantesAprovados = new ArrayList<>();

        for (int i = 0;i<=this.estudantesAguardando.size()-1;i++){

            Estudante e = this.estudantesAguardando.get(i);

            if (e.getMediaGeral() > this.notaCorte && e.getDistanciaLocalidade() < this.distanciaMaxima){

                estudantesAprovados.add(e);

            }

        }

        return estudantesAprovados;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaCorte() {
        return notaCorte;
    }

    public void setNotaCorte(Double notaCorte) {
        this.notaCorte = notaCorte;
    }

    public Double getDistanciaMaxima() {
        return distanciaMaxima;
    }

    public void setDistanciaMaxima(Double distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }
}

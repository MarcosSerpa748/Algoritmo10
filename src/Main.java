import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CursoEscolhido c = new CursoEscolhido("Meidicina",7.5,15.0);

        Estudante e1 = new Estudante("Marcos",7.9,18.0);
        Estudante e2 = new Estudante("Débora",9.1,7.0);
        Estudante e3 = new Estudante("Clara",8.1,4.0);
        Estudante e4 = new Estudante("Kleber",7.2,2.5);

        c.inserirEstudante(e1);
        c.inserirEstudante(e2);
        c.inserirEstudante(e3);
        c.inserirEstudante(e4);

        ArrayList<Estudante> alunosAprovados = c.retornarAlunosAprovados();

        alunosAprovados.sort(Comparator.comparing(Estudante::getDistanciaLocalidade));

        for (int i = 0;i<= alunosAprovados.size()-1;i++){
            System.out.println(alunosAprovados.get(i));

        }
    }
}
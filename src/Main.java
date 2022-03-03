import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("curso de java 11");
        curso.setCargaHoraria(8);

        System.out.println(curso);
    }
}

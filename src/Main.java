import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("curso de java 11");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Novidades java 11");
        mentoria.setDescricao("Mentoria com fulado de tal, sobre as novidades do java 11");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Bootcamp Java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);


        Dev dev = new Dev();
        dev.setNome("Junior Fontes");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println("Dev: " + dev.getNome() + " " +dev.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: "+dev.getNome() + " " + dev.getConteudosConcluidos());
        System.out.println("XP: "+dev.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev: "+ dev2.getNome() + " " +dev2.getConteudosInscritos());
        dev2.progredir();

        System.out.println("Dev: "+ dev2.getNome() + " " +dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: "+dev2.getNome()+ " "  + dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());

    }
}

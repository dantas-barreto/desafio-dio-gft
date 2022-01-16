import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("João Pedro");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println();
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
    }
}

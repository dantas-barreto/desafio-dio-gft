import com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}

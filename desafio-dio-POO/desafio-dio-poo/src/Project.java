import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Project {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(8);
        System.out.println(curso.toString());

        Mentoria mentoria = new Mentoria();

        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Curso de Python");
        mentoria.setTitulo("Python");
        System.out.println(mentoria.toString());
        
    }
}

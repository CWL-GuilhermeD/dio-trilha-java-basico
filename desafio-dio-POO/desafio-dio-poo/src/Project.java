import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devGuilherme.getConteudoEscrito());
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("Conteudos Concluidos " + devGuilherme.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos " + devGuilherme.getConteudoEscrito());
    }
}

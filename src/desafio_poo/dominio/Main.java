import dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("-");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos e não concluídos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("-");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos e não concluídos Joao: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Java Script");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.iscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devAlexandre.getNome() + ": " +  devAlexandre.getCoteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos " + devAlexandre.getNome() + ": " + devAlexandre.getCoteudosInscritos());
        System.out.println("Conteúdos concluídos " +  devAlexandre.getNome() + ": " + devAlexandre.getCoteudosCocluidos());
        System.out.println("XP: " + devAlexandre.calcularTotalXp());

        System.out.println("-");
        Dev devRosimere = new Dev();
        devRosimere.setNome("Rosimere");
        devRosimere.iscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devRosimere.getNome() + ": " + devRosimere.getCoteudosInscritos());
        devRosimere.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos " + devRosimere.getNome() + ": " + devRosimere.getCoteudosInscritos());
        System.out.println("Conteúdos concluídos " + devRosimere.getNome() + ": " + devRosimere.getCoteudosInscritos());
        System.out.println("XP: " + devRosimere.calcularTotalXp());


    }
}

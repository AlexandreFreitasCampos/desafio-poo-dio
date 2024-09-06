import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Java Script");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso HTML5");
        curso3.setDescricao("Descrição do curso HTML5");
        curso3.setCargaHoraria(8);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso C++");
        curso4.setDescricao("Descrição do curso C++");
        curso4.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoriaJs = new Mentoria();
        mentoriaJs.setTitulo("Mentoria do Js");
        mentoriaJs.setDescricao("Descrição mentoria Js");
        mentoriaJs.setData(LocalDate.now());

        Mentoria mentoriaHtml5 = new Mentoria();
        mentoriaHtml5.setTitulo("Mentoria do HTML5");
        mentoriaHtml5.setDescricao("Descrição mentoria HTML5");
        mentoriaHtml5.setData(LocalDate.now());

        Mentoria mentoriaC = new Mentoria();
        mentoriaC.setTitulo("Mentoria do C++");
        mentoriaC.setDescricao("Descrição mentoria C++");
        mentoriaC.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
//        bootcamp.getConteudos().add(mentoriaJs);
//        bootcamp.getConteudos().add(mentoriaHtml5);
//        bootcamp.getConteudos().add(mentoriaC);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.iscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devAlexandre.getNome() + ": " +  devAlexandre.getCoteudosInscritos());
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
        devRosimere.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos " + devRosimere.getNome() + ": " + devRosimere.getCoteudosInscritos());
        System.out.println("Conteúdos concluídos " + devRosimere.getNome() + ": " + devRosimere.getCoteudosCocluidos());
        System.out.println("XP: " + devRosimere.calcularTotalXp());

        Dev devGabrielle = new Dev();
        devGabrielle.setNome("Gabrielle");
        devGabrielle.iscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devGabrielle.getNome() + ": " +  devGabrielle.getCoteudosInscritos());
        devGabrielle.progredir();
        devGabrielle.progredir();
        devGabrielle.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos " + devGabrielle.getNome() + ": " + devGabrielle.getCoteudosInscritos());
        System.out.println("Conteúdos concluídos " +  devGabrielle.getNome() + ": " + devGabrielle.getCoteudosCocluidos());
        System.out.println("XP: " + devGabrielle.calcularTotalXp());

        System.out.println("-");
        Dev devGiovanna = new Dev();
        devGiovanna.setNome("Giovanna");
        devGiovanna.iscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devGiovanna.getNome() + ": " + devGiovanna.getCoteudosInscritos());
        devGiovanna.progredir();
        devGiovanna.progredir();
        devGiovanna.progredir();
        devGiovanna.progredir();
        devGiovanna.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos " + devGiovanna.getNome() + ": " + devGiovanna.getCoteudosInscritos());
        System.out.println("Conteúdos concluídos " + devGiovanna.getNome() + ": " + devGiovanna.getCoteudosCocluidos());
        System.out.println("XP: " + devGiovanna.calcularTotalXp());


    }
}

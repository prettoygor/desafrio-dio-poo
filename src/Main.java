import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Introducao a Testes de Software");
        curso1.setDescricao("Apresentação dos conceitos de testes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Aprenda a aplicar testes com Java");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria #8: Como ser contratado pela GFT");
        mentoria.setDescricao("Detalhes sobre como concorrer as vagas na multinacional");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT QA #1");
        bootcamp.setDescricao("Um programa feito para você que planeja desenvolver suas habilidades em QA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devYgor = new Dev();
        devYgor.setNome("Ygor");
        devYgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ygor:" + devYgor.getConteudosInscritos());
        devYgor.progredir();
        devYgor.progredir();
        devYgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ygor:" + devYgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ygor:" + devYgor.getConteudosConcluidos());
        System.out.println("XP:" + devYgor.calcularTotalXp());

    }

}

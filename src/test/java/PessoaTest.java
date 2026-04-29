import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void AprovadoMedio(){

        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6);
        aluno.setNota2(6);
        assertEquals(true, aluno.foiAprovado() );

    }

    @Test
    public void ReprovadoMedio(){

        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6);
        aluno.setNota2(5);
        assertEquals(false, aluno.foiAprovado());
    }

    @Test
    public void AprovadoGraduacao(){

        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7);
        aluno.setNota2(7);
        assertEquals(true, aluno.foiAprovado());

    }

    @Test
    public void ReprovadoGraduacao(){

        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7);
        aluno.setNota2(6);
        assertEquals(false, aluno.foiAprovado());
    }

    @Test
    public void ProfessorGraduado(){

        Professor prof = new Professor();
        prof.setTitulacao(0);
        assertEquals("Graduado", prof.getTitulacao());

    }

    @Test
    public void ProfessorEspecialista(){

        Professor prof = new Professor();
        prof.setTitulacao(1);
        assertEquals("Especialista", prof.getTitulacao());

    }

    @Test
    public void ProfessorMestre(){

        Professor prof = new Professor();
        prof.setTitulacao(2);
        assertEquals("Mestre", prof.getTitulacao());

    }

    @Test
    public void ProfessorDoutor(){

        Professor prof = new Professor();
        prof.setTitulacao(3);
        assertEquals("Doutor", prof.getTitulacao());

    }

    @Test
    public void infoAlunoMedioAprovado(){

        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6);
        aluno.setNota2(6);
        aluno.setNome("Joao");
        aluno.setMatricula("01");

        assertEquals("Joao 01 Aprovado", aluno.info());
    }

    @Test
    public void infoAlunoMedioReprovado(){

        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6);
        aluno.setNota2(5);
        aluno.setNome("Joao");
        aluno.setMatricula("01");

        assertEquals("Joao 01 Reprovado", aluno.info());
    }

    @Test
    public void infoAlunoGraduacaoAprovado(){

        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7);
        aluno.setNota2(7);
        aluno.setNome("Joao");
        aluno.setMatricula("01");

        assertEquals("Joao 01 Aprovado", aluno.info());
    }

    @Test
    public void infoAlunoGraduacaoReprovado(){

        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7);
        aluno.setNota2(6);
        aluno.setNome("Joao");
        aluno.setMatricula("01");

        assertEquals("Joao 01 Reprovado", aluno.info());
    }

    @Test
    public void infoProfessorGraduado(){

        Professor prof = new Professor();
        prof.setNome("Joao");
        prof.setTitulacao(0);

        assertEquals("Joao Graduado",prof.info());

    }

    @Test
    public void infoProfessorEspecialista(){

        Professor prof = new Professor();
        prof.setNome("Joao");
        prof.setTitulacao(1);

        assertEquals("Joao Especialista",prof.info());

    }

    @Test
    public void infoProfessorMestre(){

        Professor prof = new Professor();
        prof.setNome("Joao");
        prof.setTitulacao(2);

        assertEquals("Joao Mestre",prof.info());

    }

    @Test
    public void infoProfessorDoutor(){

        Professor prof = new Professor();
        prof.setNome("Joao");
        prof.setTitulacao(3);

        assertEquals("Joao Doutor",prof.info());

    }

    @Test
    public void infoProfessorErro(){

        Professor prof = new Professor();
        prof.setNome("Joao");
        prof.setTitulacao(-1);

        assertThrows(IllegalArgumentException.class, () -> prof.getTitulacao());

    }




}
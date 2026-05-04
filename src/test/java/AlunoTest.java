import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void nome(){

        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        aluno.setCurso(curso);

        assertEquals(curso, aluno.getCurso());
    }






}
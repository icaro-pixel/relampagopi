import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void testandoCidadeEstado() {

        Estado mg = new Estado();
        mg.setNomeEstado("minas");
        Cidade jaca = new Cidade();
        jaca.setEstado(mg);

        assertEquals("minas", jaca.getNomeEstado());

    }

    @Test
    void nomeEscolaridadeProfessor() {

        Professor prof = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        prof.setEscolaridade(escolaridade);
        escolaridade.setEscolaridadeInfo("Mestre");
        assertEquals("Mestre", prof.getEscolaridadeNome());

    }

    @Test
    void nomeEscolaridadeCoordenadorDeCurso() {

        Professor coord = new Professor();
        Curso curso = new Curso();
        Escolaridade escolaridade = new Escolaridade();
        coord.setEscolaridade(escolaridade);
        escolaridade.setEscolaridadeInfo("Doutorado");
        curso.setCoordenacao(coord);

        assertEquals("Doutorado", curso.getEscolaridadeNomeCoordenador());


    }

    @Test
    void nomeEscolaridadeDiretor() {

        Professor diretor = new Professor();
        Escola escola = new Escola();
        Escolaridade escolaridade = new Escolaridade();
        diretor.setEscolaridade(escolaridade);
        escolaridade.setEscolaridadeInfo("Doutorado");
        escola.setDirecao(diretor);

        assertEquals("Doutorado", escola.getDiretorEscolaridadeNome());


    }

    @Test
    void nomeEstadoNaturalidadeAluno() {

        Aluno aluno = new Aluno();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();

        estado.setNomeEstado("MG");
        cidade.setEstado(estado);
        aluno.setNaturalidade(cidade);

        assertEquals("MG", aluno.getEstadoNaturalidadeNome());

    }

    @Test
    void nomeCidadeProfessor() {

        Professor prof = new Professor();
        Cidade cidade = new Cidade();
        cidade.setNome("jf");
        prof.setNaturalidade(cidade);

        assertEquals("jf", prof.getCidadeNaturalidadeNome());


    }

    @Test
    void nomeCidadeCursoAluno(){

        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Cidade cidade = new Cidade();

        aluno.setCurso(curso);
        curso.setCidade(cidade);
        cidade.setNome("jf");

        assertEquals("jf", aluno.getCursoCidadeNome());


    }

    @Test
    void nomeTipoProfContratado(){

        Professor professor = new Professor();
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNomeTipo("Superior");
        Curso curso = new Curso();

        professor.setCurso(curso);
        curso.setTipoEnsino(tipoEnsino);

        assertEquals("Superior", professor.getTipoEnsinoContratadoNome());

    }

    @Test
    void nomeCoordenadorCursoALuno(){

        Professor coord = new Professor();
        Aluno aluno = new Aluno();
        Curso curso = new Curso();

        curso.setCoordenacao(coord);
        aluno.setCurso(curso);
        coord.setNome("joa");



        assertEquals("joa", aluno.getCoordNome());





    }

    @Test
    void diretorProfessorNome(){

        Professor prof = new Professor();
        Professor dire = new Professor();
        Curso curso = new Curso();
        Escola escola = new Escola();

        prof.setCurso(curso);
        escola.setDirecao(dire);
        curso.setEscola(escola);

        dire.setNome("joao");

        assertEquals("joao", prof.getNomeDiretor());



    }

    @Test
    void coordenadorDeProfessorNome(){

        Professor professor = new Professor();
        Professor coord = new Professor();
        Curso curso = new Curso();

        curso.setCoordenacao(coord);
        coord.setNome("carlos");
        professor.setCurso(curso);

        assertEquals("carlos", professor.getNomeCoordenador());


    }



}
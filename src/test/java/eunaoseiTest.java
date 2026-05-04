import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class eunaoseiTest {

    @Test
    void testandoCidadeEstado() {

        Estado mg = new Estado();
        mg.setNomeEstado("minas");
        Cidade jaca = new Cidade();
        jaca.setEstado(mg);

        assertEquals("minas", jaca.getNomeEstado());

    }

    @Test
    void EscolaridadeProfessor() {

        Professor prof = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        prof.setEscolaridade(escolaridade);
        escolaridade.setEscolaridadeInfo("Mestre");
        assertEquals(escolaridade, prof.getEscolaridade());

    }

    @Test
    void EscolaridadeCoordenadorDeCurso() {

        Professor coord = new Professor();
        Curso curso = new Curso();
        Escolaridade escolaridade = new Escolaridade();
        coord.setEscolaridade(escolaridade);
        escolaridade.setEscolaridadeInfo("Doutorado");
        curso.setCoordenacao(coord);

        assertEquals(escolaridade, curso.getEscolaridadeCoordenador());


    }

    @Test
    void EscolaridadeDiretor() {

        Professor diretor = new Professor();
        Escola escola = new Escola();
        Escolaridade escolaridade = new Escolaridade();
        diretor.setEscolaridade(escolaridade);
        escolaridade.setEscolaridadeInfo("Doutorado");
        escola.setDirecao(diretor);

        assertEquals(escolaridade, escola.getDiretorEscolaridade());


    }

    @Test
    void EstadoNaturalidadeAluno() {

        Aluno aluno = new Aluno();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();

        estado.setNomeEstado("MG");
        cidade.setEstado(estado);
        aluno.setNaturalidade(cidade);

        assertEquals(estado, aluno.getEstadoNaturalidade());

    }

    @Test
    void CidadeProfessor() {

        Professor prof = new Professor();
        Cidade cidade = new Cidade();
        cidade.setNome("jf");
        prof.setNaturalidade(cidade);

        assertEquals(cidade, prof.getCidadeNaturalidade());


    }

    @Test
    void CidadeCursoAluno(){

        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Cidade cidade = new Cidade();

        aluno.setCurso(curso);
        curso.setCidade(cidade);
        cidade.setNome("jf");

        assertEquals(cidade, aluno.getCursoCidade());


    }

    @Test
    void nomeTipoProfContratado(){

        Professor professor = new Professor();
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNomeTipo("Superior");
        Curso curso = new Curso();

        professor.setCurso(curso);
        curso.setTipoEnsino(tipoEnsino);

        assertEquals(tipoEnsino, professor.getTipoEnsinoContratado());

    }

    @Test
    void CoordenadorCursoALuno(){

        Professor coord = new Professor();
        Aluno aluno = new Aluno();
        Curso curso = new Curso();

        curso.setCoordenacao(coord);
        aluno.setCurso(curso);
        coord.setNome("joa");
        aluno.getCurso().getNome();


        assertEquals(coord, aluno.getCoord());





    }

    @Test
    void diretorProfessor(){

        Professor prof = new Professor();
        Professor dire = new Professor();
        Curso curso = new Curso();
        Escola escola = new Escola();

        prof.setCurso(curso);
        escola.setDirecao(dire);
        curso.setEscola(escola);

        dire.setNome("joao");

        assertEquals(dire, prof.getDiretor());



    }

    @Test
    void coordenadorDeProfessor(){

        Professor professor = new Professor();
        Professor coord = new Professor();
        Curso curso = new Curso();

        curso.setCoordenacao(coord);
        coord.setNome("carlos");
        professor.setCurso(curso);

        assertEquals(coord, professor.getCoordenador());


    }

    // faltam mais teste, sera q preciso testar nome e etc?







}
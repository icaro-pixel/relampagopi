public class Aluno extends Pessoa {

    private Curso curso;

    public String getCursoCidadeNome(){

        return this.curso.getCidade().getNome();


    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getCoordNome(){

        return this.curso.getCoordenacao().getNome();
    }

}

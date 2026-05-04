public class Aluno extends Pessoa {

    private Curso curso;

    public Cidade getCursoCidade(){

        return this.curso.getCidade();

    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getCoord(){
        return this.curso.getCoordenacao();
    }

    public Curso getCurso() {
        return this.curso;
    }





}

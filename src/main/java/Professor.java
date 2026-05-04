public class Professor extends Pessoa {

    Curso curso;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public TipoEnsino getTipoEnsinoContratado(){


        return this.curso.getTipoEnsino();

    }

    public Professor getDiretor(){

        return this.curso.getEscola().getDirecao();

    }

    public Professor getCoordenador(){

        return this.curso.getCoordenacao();

    }


}

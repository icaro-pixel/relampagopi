public class Professor extends Pessoa {

    Curso curso;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getTipoEnsinoContratadoNome(){


        return this.curso.getTipoEnsino().getNomeTipo();

    }

    public String getNomeDiretor(){

        return this.curso.getEscola().getDirecao().getNome();

    }

    public String getNomeCoordenador(){

        return this.curso.getCoordenacao().getNome();

    }


}

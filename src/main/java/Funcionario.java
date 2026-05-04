public class Funcionario {

    private String name;
    private Departamento alocacao;
    private Escolaridade escolaridade;
    private Filial coordeno;

    public void setCoordeno(Filial coordeno) {
        this.coordeno = coordeno;
    }

    public Filial getCoordeno() {
        return coordeno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }



    public String getPaisAlocacao(){
        if (this.alocacao.getEmpresa() == null){
            throw new NullPointerException("nulo");
        }
        return this.alocacao.getEmpresa().getGrupo().getSede().getName();

    }


    public String getEstadoFilialTrabalho(){

        if(this.coordeno == null){
            throw new NullPointerException("nulo");
        }
        return this.coordeno.getCidade().getEstado().getName();



    }



}

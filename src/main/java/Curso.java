public class Curso {



    private String nome;
    private Professor coordenacao;
    private TipoEnsino tipoEnsino;
    private Cidade cidade;
    private Escola escola;


    public void setCoordenacao(Professor coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getEscolaridadeNomeCoordenador(){

        return this.coordenacao.getEscolaridadeNome();


    }

    public void setCidade(Cidade cidade){
        this.cidade = cidade;
    }

    public Cidade getCidade(){
        return this.cidade;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino){
        this.tipoEnsino = tipoEnsino;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public Professor getCoordenacao(){
        return this.coordenacao;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Escola getEscola() {
        return escola;
    }
}

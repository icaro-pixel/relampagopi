public class Pessoa {

    private String nome ;
    private Cidade naturalidade ;
    private Escolaridade escolaridade;

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEscolaridadeDescricao(){

        if (this.escolaridade == null){
            throw new NullPointerException("Sem escolaridade");
        }

        return this.escolaridade.getEscolaridadeInfo();


    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Estado getEstadoNaturalidade(){

        return this.naturalidade.getEstado();


    }

    public Cidade getCidadeNaturalidade(){

        return this.naturalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

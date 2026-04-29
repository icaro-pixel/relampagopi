public class Pessoa {

    private String nome ;
    private Cidade naturalidade ;
    private Escolaridade escolaridade;

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEscolaridadeNome(){

        return this.escolaridade.getEscolaridadeInfo();


    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstadoNaturalidadeNome(){

        return this.naturalidade.getNomeEstado();


    }

    public String getCidadeNaturalidadeNome(){

        return this.naturalidade.getNome();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

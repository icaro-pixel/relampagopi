public class Escola {

    private String nome;

    private Cidade cidade;

    private Professor direcao;

    public void setDirecao(Professor direcao) {
        this.direcao = direcao;
    }

    public Escolaridade getDiretorEscolaridade(){

        return this.direcao.getEscolaridade();

    }

    public String getDiretorEscolaridadeDescricao(){

        return this.direcao.getEscolaridade().getEscolaridadeInfo();
    }

    public Professor getDirecao() {
        return direcao;
    }
}

public class Escola {

    private String nome;

    private Cidade cidade;

    private Professor direcao;

    public void setDirecao(Professor direcao) {
        this.direcao = direcao;
    }

    public String getDiretorEscolaridadeNome(){

        return this.direcao.getEscolaridadeNome();


    }

    public Professor getDirecao() {
        return direcao;
    }
}

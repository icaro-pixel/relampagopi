public class Filial {

    private String name;
    private Cidade cidade;
//    private Funcionario coordenacao;
    private Empresa empresa;

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNomeDiretor(){
        if (empresa == null){
            throw new NullPointerException("deu bosta");
        }

        return empresa.getDiretor().getName();


    }


}

public class Departamento {

    private String nome;
    private Funcionario chefia;
    private Empresa empresa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefia() {
        return chefia;
    }

    public void setChefia(Funcionario chefia) {
        this.chefia = chefia;
    }

    public String getEscolaridadeChefe(){
        if (chefia.getEscolaridade() == null){
            throw new NullPointerException("nulo");
        }

        return chefia.getEscolaridade().getEscolaridade();


    }



}

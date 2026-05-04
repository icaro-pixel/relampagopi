public class Empresa {

    private String name;
    private Funcionario diretor;
    private Grupo grupo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}

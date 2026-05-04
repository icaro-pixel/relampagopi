public class Grupo {

    private String name;
    private Pais sede;
    private Funcionario presidente;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }



    public String getEscolaridadePresidente(){

        if (presidente.getEscolaridade() == null){

            throw new NullPointerException("Sem escolaridade");
        }

        return this.presidente.getEscolaridade().getEscolaridade();


    }






}

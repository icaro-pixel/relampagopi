public class Cidade {

    private String nome;
    private Estado estado;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNomeEstado(){

        return this.estado.getNomeEstado();

    }


}
